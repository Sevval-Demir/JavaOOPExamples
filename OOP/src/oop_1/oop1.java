package oop_1;

public class oop1 {

	public static void main(String[] args) {
		//Encapsulation(Sarmallama,Kapsülleme)
		//Inheritance(Kalıtım)
		//Polymorphism(Çok biçimlilik)
		//Abstraction(Soyutlama)
		
		//Sarmalama:Değişkenlere doğrudan erişim yerine, 
		//yalnızca belirlenen metotlar aracılığıyla erişilmesini sağlar.
		//Değişkenler private tanımlanır
		//Dışarıdan bu verilere erişmek ve değiştirmek için sınıf içinde 
		//public metotlar yazılır. Bu metotlar genellikle getter 
		//(veriyi okumak için) ve setter (veriyi değiştirmek için) olarak adlandırılır.
		
		 Book b1=new Book("Harry Potter","Rowling","KodlamaVakti",600);
		
		System.out.println(b1.getNumberOfPage());
		b1.setNumberOfPage(111);
		System.out.println(b1.getNumberOfPage());
		b1.disPlay();
		
		Book b2=new Book("The Lord of the Rings","Tolkien","KodlamaVakti",1000);
		b2.disPlay();
	}

}
