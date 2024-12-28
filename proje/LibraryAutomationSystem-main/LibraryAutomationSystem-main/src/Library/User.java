package Library;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public abstract class User {
	
	// Kullanıcı bilgileri ve işlem dizisi
	protected String name;
	protected String surname;
	protected String email;
	protected String password;

	
	// Parametresiz kurucu
	public User() {}
	
	// İsim bilgisi ile kurucu
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	// Tüm bilgileri içeren kurucu
	public User(String name, String surname, String email, String password) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
	}
    // İsim bilgisini getiren metot
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	// Email bilgisini getiren metot
	public String getEmail() {
		return email;
	}
	// Telefon numarası bilgisini getiren metot
	public String getPassword() {
		return password;
	}
    
	// Soyut metotlar
	abstract public String toString();
	
	//şevval ve ahsen
	abstract public void menu(Database database, Users users);
	
	// Kullanıcı menüsü penceresi oluşturan metot
	public JFrame frame(String[] data, Database database, User user) {
	    // Yeni bir JFrame (pencere) nesnesi oluşturuluyor
	    JFrame frame = new JFrame();
	    // Pencere boyutu ayarlanıyor (400x500 piksel)
	    frame.setSize(600, 600);
	    // Pencere kapatıldığında yalnızca bu pencerenin kapanması sağlanıyor
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    // Pencere ekranın ortasında açılacak şekilde ayarlanıyor
	    frame.setLocationRelativeTo(null);
	    // Pencere başlığı ayarlanıyor
	    frame.setTitle("Library Automation System");
	    // Pencerenin düzeni BorderLayout olarak belirleniyor
	    frame.setLayout(new BorderLayout());
	    // Pencerenin arka planı varsayılan olarak ayarlanıyor mor
	    frame.getContentPane().setBackground(Color.decode("#4B0082"));
	    
	    // Başlık etiketi oluşturuluyor ve pencerenin üst kısmına ekleniyor
	    JLabel label1 = Main.title(this.name + " Hoşgeldiniz");
	    label1.setForeground(Color.WHITE); // Yazı rengini beyaz yap
	    frame.getContentPane().add(label1, BorderLayout.NORTH);
	    
	    // Menü seçeneklerini içerecek olan panel oluşturuluyor
	    JPanel panel = new JPanel();
	    // Panelin kenar boşlukları ayarlanıyor
	    panel.setBorder(BorderFactory.createEmptyBorder(0, 60, 60, 60));
	    // Panelin düzeni 7 satırlı ve 1 sütunlu bir GridLayout olarak belirleniyor
	    panel.setLayout(new GridLayout(5, 1, 13, 13));
	    // Panelin arka planı varsayılan olarak ayarlanıyor
	    panel.setBackground(null); //Color.BLACK
	    
	    // Menü seçeneklerini içeren butonlar oluşturuluyor
	    for (int i = 0; i < 5; i++) {
	        // Her bir seçenek için bir buton oluşturuluyor
	        JButton button = new JButton(data[i]);
	        // Butonun yazı tipi ve boyutu ayarlanıyor
	        button.setFont(new Font("Tahoma", Font.BOLD, 17));
	        // Butonun yazı rengi beyaz olarak ayarlanıyor
	        button.setForeground(Color.white);
	        // Yazının buton içerisinde ortalanması sağlanıyor
	        button.setHorizontalAlignment(SwingConstants.CENTER);
	        // Butonun arka plan rengi ayarlanıyor
	        button.setBackground(Color.decode("#1da1f2"));
	        // Butonun kenarlığı kaldırılıyor
	        button.setBorder(null);
	        
	        // Döngü içerisindeki her butona özel bir index atanıyor
	        int index = i;
	        
	        // Her bir butona tıklanma durumunda çalışacak bir dinleyici ekleniyor
	        button.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // İlgili işlemi gerçekleştiren metot çağırılıyor
	                operations[index].oper(database, user);

	                // Eğer buton "Çıkış" ya da "Tüm datayı sil" seçeneği ise pencere kapatılıyor
	                if (data[index].matches("Çıkış") || data[index].matches("Tüm datayı sil")) {
	                    frame.dispose();
	                }
	            }
	        });
	        // Buton panel içerisine ekleniyor
	        panel.add(button);
	    }
	    
	    // Panel pencerenin merkez kısmına ekleniyor
	    frame.getContentPane().add(panel, BorderLayout.CENTER);
	    // Oluşturulan pencere nesnesi döndürülüyor
	    return frame;
	}
}