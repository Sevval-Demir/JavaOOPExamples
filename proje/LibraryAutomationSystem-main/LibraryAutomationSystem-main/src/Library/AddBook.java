package Library;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Yeni bir kitap eklemek için kullanılan sınıf.
public class AddBook implements IOOperation {

	// IOOperation arayüzünden gelen oper() metodunu implement et.
	@Override
	public void oper(Database database, User user) {
		
		 // Yeni bir pencere oluştur.
		JFrame frame = Main.frame(600, 600);
		
		// Sayfanın başlık kısmı belirle.
		JLabel title = Main.title("Add a new Book");
		frame.getContentPane().add(title, BorderLayout.NORTH);
		
		// Kitap bilgilerini girmek için bir form oluştur.
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(8, 2, 15, 15));
		panel.setBorder(BorderFactory.createEmptyBorder(0, 30, 30, 30));
		panel.setBackground(null);
		
		// Etiketler ve metin alanları oluştur.
		JLabel label1 = Main.label("Book Name");
		JLabel label2 = Main.label("Book Author:");
		JLabel label3 = Main.label("Book Publishing:");
		JLabel label4 = Main.label("Address:");
		JLabel label5 = Main.label("Amount:");
		JLabel label6 = Main.label("Book Language:");
		JLabel label7 = Main.label("Book Type:");
		JLabel label8 = Main.label("Add ISBN:");
		JLabel label9 = Main.label("Cancel:");
		
		JTextField bookName = Main.textfield();
		JTextField bookAuthor = Main.textfield();
		JTextField bookPublisher = Main.textfield();
		JTextField bookAddress = Main.textfield();
		JTextField bookAmount = Main.textfield();
		JTextField bookLanguage = Main.textfield();
		JTextField bookType = Main.textfield();
		JTextField ISBN = Main.textfield();

		
		JButton addbook = Main.button("Add a Book");
		JButton cancel = Main.button("Back");
		
		// Forma etiketleri ve metin alanlarını ekle.
		panel.add(label1);
		panel.add(bookName);
		panel.add(label2);
		panel.add(bookAuthor);
		panel.add(label3);
		panel.add(bookPublisher);
		panel.add(label4);
		panel.add(bookAddress);
		panel.add(label5);
		panel.add(bookAmount);
		panel.add(label6);
		panel.add(bookLanguage);
		panel.add(label7);
		panel.add(bookType);
		panel.add(label8);
		panel.add(ISBN);
		panel.add(label9);
		panel.add(cancel);
		
		// "Kitabı Ekle" butonuna tıklandığında gerçekleşecek olayları tanımla.
		addbook.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 // Gerekli alanların boş olup olmadığını kontrol et.

				if (bookName.getText().toString().matches("")) {
					JOptionPane.showMessageDialog(new JFrame(), "the book name can not be empty!");
					return;
				}
				if (bookAuthor.getText().toString().matches("")) {
					JOptionPane.showMessageDialog(new JFrame(), "the author name can not be empty!");
					return;
				}
				if (bookPublisher.getText().toString().matches("")) {
					JOptionPane.showMessageDialog(new JFrame(), "the publishing name can not be empty!");
					return;
				}
				if (bookAddress.getText().toString().matches("")) {
					JOptionPane.showMessageDialog(new JFrame(), "the address can not be empty!");
					return;
				}
				if (bookAmount.getText().toString().matches("")) {
					JOptionPane.showMessageDialog(new JFrame(), "the amount can not be empty!");
					return;
				}
				if (bookLanguage.getText().toString().matches("")) {
					JOptionPane.showMessageDialog(new JFrame(), "the language can not be empty!");
					return;
				}
				if (bookType.getText().toString().matches("")) {
					JOptionPane.showMessageDialog(new JFrame(), "the type can not be empty!");
					return;
				}
				if (ISBN.getText().toString().matches("")) {
					JOptionPane.showMessageDialog(new JFrame(), "the ISBN can not be empty!");
					return;
				}

				// Satılık kopyalar, ücret ve ödünç alınabilir kopyaların sayısal olup olmadığını kontrol et.

				try {
					Integer.parseInt(bookAmount.getText().toString());
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(new JFrame(), "the value of loanable copies can not be empty!");
					return;
				}


				// Kitap objesini oluşturup veritabanına ekle.
				Book book = new Book();
				if (database.getBook(bookName.getText().toString())>-1) {
					JOptionPane.showMessageDialog(new JFrame(), "there is a book with this name!");
					return;
				} else {
					book.setBookName(bookName.getText().toString());
					book.setBookAuthor(bookAuthor.getText().toString());
					book.setBookPublisher(bookPublisher.getText().toString());
					book.setBookAddress(bookAddress.getText().toString());
					book.setBookAmount(Integer.parseInt(bookAmount.getText().toString()));
					book.setBookLanguage(bookLanguage.getText().toString());
					book.setBookType(bookType.getText().toString());
					book.setISBN(ISBN.getText().toString());
					database.AddBook(book);
					JOptionPane.showMessageDialog(new JFrame(), "added the book with succesfull!");
					frame.dispose(); 
					// Pencereyi kapatma.
				}
			}
		});
		// "Geri" butonuna tıklandığında gerçekleşecek olayları tanımla.
		cancel.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();	
			}
		});
		// Panel ve bileşenleri ana pencereye ekle.
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.setVisible(true);  //Pencereyi görünür yapma.
	}
	
}
