package Siniflar;

public class HesapMakinesi {
	public int sayi1; //herkese açık
	public int sayi2;
	//private int sayi2; //sadece burada kullanılır
	//önüne bir şey yazılmazsa default olarak public tanımlanır
	
	public String renk;
	
	
	//Constructor(yapıcı)
	HesapMakinesi(int sayi1,int sayi2,String renk)
	{
		this.sayi1=sayi1; //this olunca sınıfa ait demek
		this.sayi2=sayi2;
		this.renk=renk;
	}
	
	public int toplama()
	{
		return this.sayi1+this.sayi2;
	}
	
	public int cikarma()
	{
		return this.sayi1-this.sayi2;
	}
	
	public int carpma()
	{
		return this.sayi1*this.sayi2;
	}
	
	public int bolme()
	{
		return this.sayi1/this.sayi2;
	}
}
