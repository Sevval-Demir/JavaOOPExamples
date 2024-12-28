package Library;

import javax.swing.JFrame;

public class NormalUser extends User {

	// Tek parametreli kurucu metod, sadece ismi içerir
	public NormalUser(String name, String surname) {
		super(name, surname);
		// Normal kullanıcının gerçekleştirebileceği işlemler tanımlanır
		this.operations = new IOOperation[] {
				new ViewBooks(),
				new Search(),
				new PlaceOrder(),
				new BorrowBook(),
				new CalculateFine(),
				new ReturnBook(),
				new Exit()
		};
	}
	// Üç parametreli kurucu metod, isim, email ve telefon numarasını içerir
	public NormalUser(String name, String surname, String email, String password) {
		super(name, surname, email, password);
		// Normal kullanıcının gerçekleştirebileceği işlemler tanımlanır
		this.operations = new IOOperation[] {
				new ViewBooks(),
				new Search(),
				new PlaceOrder(),
				new BorrowBook(),
				new CalculateFine(),
				new ReturnBook(),
				new Exit()
		};
	}
	// Menüyü oluşturan metot, kullanıcının gerçekleştirebileceği işlemleri içerir
	@Override
	public void menu(Database database, User user) {
		
		// Menü seçenekleri oluşturuluyor
		String[] data = new String[7];
		data[0] = "View Books";
		data[1] = "Search Books";
		data[2] = "Barrow Books";
		data[3] = "Give Back Books";
		data[4] = "Exit";
		
		// Menüyü oluşturan frame oluşturuluyor ve görünür hale getirilir
		JFrame frame = this.frame(data, database, user);
		frame.setVisible(true);
	}
	// Nesnenin String temsilini döndüren metot
	public String toString() {
		return name+"<N/>"+surname+"<N/>"+email+"<N/>"+password+"<N/>"+"Normal"
	}
	
}