package Library;

//Kitap sınıfı, kütüphane uygulamasında kullanılan kitap nesnesini temsil eder
public class Book {
	
	private String bookName;		//Kitabın başlığı
	private String bookAuthor;		//Kitabın yazarı
	private String bookPublisher;	//Kitabın yayıncısı
	private String bookAddress;		//Kitabın bulunduğu koleksiyon adresi 
	private String bookStatus;		//Kitabın ödünç alınma durumu
	private int bookAmount;			//Satıs için kopya sayısı
	private String bookLanguage;	//Ödünc alınabilen kopya sayısı
	private String bookType;        //Kitap türü
	private String ISBN; 			//Kitap ISBN'si
	
	public Book() {};
	
	// Parametreli yapıcı metot, kitap bilgilerini alır
	public Book(String bookName, String bookAuthor, String bookPublisher,
			String bookAddress, String bookStatus, int bookAmount, String bookLanguage, String bookType, String ISBN) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookAddress = bookAddress;
		this.bookStatus = bookStatus;
		this.bookAmount = bookAmount;
		this.bookLanguage = bookLanguage;
		this.bookType = bookType;
		this.ISBN = ISBN;
	}
	// Kitap bilgilerini düzenli bir şekilde string olarak döndüren metot
	public String toString() {
		String text = "Book Name: " + bookName+"\n"+
				"Book Author: " + bookAuthor+"\n"+
				"Book Publisher: " + bookPublisher+"\n"+
				"Book Address: " + bookAddress+"\n"+
				"Book Status: " + bookStatus+"\n"+
				"Book Amount: " + String.valueOf(bookAmount)+"\n"+
				"Book Language: " + bookLanguage+"\n"+
				"Book Type: " + bookType +"\n"+
				"Book ISBN: " + ISBN +"\n";
				
		return text;
	}

	// Getter ve Setter metotları
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getBookAddress() {
		return bookAddress;
	}

	public void setBookAddress(String bookAddress) {
		this.bookAddress = bookAddress;
	}

	public String getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

	public int getBookAmount() {
		return bookAmount;
	}

	public void setBookAmount(int bookAmount) {
		this.bookAmount = bookAmount;
	}

	public String getBookLanguage() {
		return bookLanguage;
	}

	public void setBookLanguage(String bookLanguage) {
		this.bookLanguage = bookLanguage;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	// Kitap bilgilerini özel bir formatta string olarak döndüren metot
		public String toString2() {
			String text = bookName+"<N/>"+bookAuthor+"<N/>"+bookPublisher+"<N/>"+bookAddress+"<N/>"+bookStatus+
					"<N/>"+String.valueOf(bookAmount)+"<N/>"+bookLanguage+"<N/>"+ bookType+"<N/>"+ ISBN +"<N/>";
			return text;
		}


}