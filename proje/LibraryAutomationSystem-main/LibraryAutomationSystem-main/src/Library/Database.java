package Library;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class LibraryDatabase {

    private ArrayList<User> users;
    private ArrayList<Book> books;
    private ArrayList<Borrowing> borrowings;
    private ArrayList<Admin> staffMembers;
    
    private File userFile = new File("C:\\LibrarySystem\\Database\\User.txt");
    private File bookFile = new File("C:\\LibrarySystem\\Database\\Book.txt");
    private File borrowFile = new File("C:\\LibrarySystem\\Database\\Borrow.txt");
    private File staffFile = new File("C:\\LibrarySystem\\Database\\Staff.txt");
    private File dataFolder = new File("C:\\LibrarySystem\\Database");

    // Constructor: Initialize database and files
    public LibraryDatabase() {
        if (!dataFolder.exists()) {
            dataFolder.mkdirs();
        }
        checkFileExists(userFile);
        checkFileExists(bookFile);
        checkFileExists(borrowFile);
        checkFileExists(staffFile);
        
        users = new ArrayList<>();
        books = new ArrayList<>();
        borrowings = new ArrayList<>();
        staffMembers = new ArrayList<>();
        
        loadUsers();
        loadBooks();
        loadBorrowings();
        loadStaff();
    }

    // Helper method to check and create file if it does not exist
    private void checkFileExists(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("Error creating file: " + file.getName());
            }
        }
    }

    // Add new user
    public void addUser(User user) {
        users.add(user);
        saveUsers();
    }

    // Load users from file
    private void loadUsers() {
        String content = readFile(userFile);
        if (!content.isEmpty()) {
            String[] userEntries = content.split("<NewUser/>");
            for (String entry : userEntries) {
                String[] userInfo = entry.split("<N/>");
                if (userInfo[3].equalsIgnoreCase("Staff")) {
                    users.add(new Admin(userInfo[0], userInfo[1], userInfo[2]));
                } else {
                    users.add(new NormalUser(userInfo[0], userInfo[1], userInfo[2]));
                }
            }
        }
    }

    // Save users to file
    private void saveUsers() {
        StringBuilder content = new StringBuilder();
        for (User user : users) {
            content.append(user.toString()).append("<NewUser/>\n");
        }
        writeFile(userFile, content.toString());
    }

    // Load books from file
    private void loadBooks() {
        String content = readFile(bookFile);
        if (!content.isEmpty()) {
            String[] bookEntries = content.split("<NewBook/>");
            for (String entry : bookEntries) {
                books.add(parseBook(entry));
            }
        }
    }

    // Save books to file
    private void saveBooks() {
        StringBuilder content = new StringBuilder();
        for (Book book : books) {
            content.append(book.toString()).append("<NewBook/>\n");
        }
        writeFile(bookFile, content.toString());
    }

    // Helper method to read content from file
    private String readFile(File file) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + file.getName());
        }
        return content.toString();
    }

    // Helper method to write content to file
    private void writeFile(File file, String content) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.print(content);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + file.getName());
        }
    }

    // Parse a book entry string to a Book object
    private Book parseBook(String entry) {
        String[] fields = entry.split("<N/>");
        Book book = new Book();
        book.setBookId(fields[0]);
        book.setBookName(fields[1]);
        book.setAuthor(fields[2]);
        book.setPublisher(fields[3]);
        book.setAddress(fields[4]);
        book.setStatus(fields[5]);
        book.setAmount(Integer.parseInt(fields[6]));
        book.setLanguage(fields[7]);
        book.setType(fields[8]);
        book.setISBN(fields[9]);
        book.setPublicationYear(Integer.parseInt(fields[10]));
        return book;
    }

    // Add new book
    public void addBook(Book book) {
        books.add(book);
        saveBooks();
    }

    // Borrow a book
    public void borrowBook(Borrowing borrowing) {
        borrowings.add(borrowing);
        saveBorrowings();
    }

    // Return a borrowed book
    public void returnBook(Borrowing borrowing) {
        borrowings.remove(borrowing);
        saveBorrowings();
    }

    // Save borrowings to file
    private void saveBorrowings() {
        StringBuilder content = new StringBuilder();
        for (Borrowing borrowing : borrowings) {
            content.append(borrowing.toString()).append("<NewBorrowing/>\n");
        }
        writeFile(borrowFile, content.toString());
    }

    // Load borrowings from file
    private void loadBorrowings() {
        String content = readFile(borrowFile);
        if (!content.isEmpty()) {
            String[] borrowingEntries = content.split("<NewBorrowing/>");
            for (String entry : borrowingEntries) {
                borrowings.add(parseBorrowing(entry));
            }
        }
    }

    // Parse a borrowing entry string to a BorrowingRecord object
    private Borrowing parseBorrowing(String entry) {
        String[] fields = entry.split("<N/>");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate borrowDate = LocalDate.parse(fields[0], formatter);
        LocalDate returnDate = LocalDate.parse(fields[1], formatter);
        Book book = findBookById(fields[2]);
        User user = findUserByName(fields[3]);
        return new Borrowing(borrowDate, returnDate, book, user);
    }

    // Find a book by ID
    private Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    // Find a user by name
    private User findUserByName(String userName) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(userName)) {
                return user;
            }
        }
        return null;
    }

    // Add staff member
    public void addStaff(Admin admin) {
        adminMembers.add(admin);
        saveStaff();
    }

    // Load staff members from file
    private void loadStaff() {
        String content = readFile(staffFile);
        if (!content.isEmpty()) {
            String[] staffEntries = content.split("<NewStaff/>");
            for (String entry : staffEntries) {
                String[] staffInfo = entry.split("<N/>");
                staffMembers.add(new Admin(adminInfo[0], adminInfo[1], adminInfo[2], adminInfo[3], adminInfo[4]));
            }
        }
    }

    // Save staff members to file
    private void saveStaff() {
        StringBuilder content = new StringBuilder();
        for (Admin admin : adminMembers) {
            content.append(admin.toString()).append("<NewStaff/>\n");
        }
        writeFile(staffFile, content.toString());
    }

    // Get all books
    public ArrayList<Book> getAllBooks() {
        return books;
    }

    // Get all borrowings
    public ArrayList<Borrowing> getAllBorrowings() {
        return borrowings;
    }

    // Get all users
    public ArrayList<User> getAllUsers() {
        return users;
    }

    // Get all staff members
    public ArrayList<Admin> getAllStaff() {
        return staffMembers;
    }
}
