package Library;

import javax.swing.JFrame;

//İsim bilgisini alan yapıcı metot
public class Admin extends User {
	
	public Admin(String name, String surname) {
		super(name, surname);
		// Admin işlemlerini içeren IOOperation dizisini oluştur
		this.operations = new IOOperation[] {
				new ViewBooks(),
				new AddBook(),
				new DeleteBook(),
				new Search(),
				new DeleteAllData(),
				new ViewOrders(),
				new Exit()
		};
	}
	// İsim, e-posta ve telefon numarası bilgilerini alan yapıcı metot
	public Admin(String name, String surname, String email, String password) {
		super(name, surname, email, password);

		// Admin işlemlerini içeren IOOperation dizisini oluştur
		this.operations = new IOOperation[] {
				new ViewBooks(),
				new AddBook(),
				new DeleteBook(),
				new Search(),
				new DeleteAllData(),
				new ViewOrders(),
				new Exit()
		};
	}
	
	// Kullanıcıya özel menüyü oluşturan metot
	@Override
	public void menu(Database database, User user) {
		String[] data = new String[7];
		data[0] = "View Books";
		data[1] = "Add Books";
		data[2] = "Delete Books";
		data[3] = "Search Books";
		data[4] = "Delete All Data";
		data[5] = "Exit";
		
		// Menüyü oluşturan pencereyi al
		JFrame frame = this.frame(data, database, user);
		frame.setVisible(true);
	}
	
	// Admin sınıfının özel toString metodu
	//password kısmı tekrar düşünülecek
	public String toString() {
		return name+"<N/>"+surname+"<N/>"+email+"<N/>"+password+"<N/>"+"Staff";
	}

}