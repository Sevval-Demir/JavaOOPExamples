package inheritance;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calisan c=new Calisan();
		Akademisyen a=new Akademisyen();
		Memur m=new Memur();
		
		a.giris();*/
		
		/*Calisan c=new Calisan();
		Memur m=new Memur();
		GuvenlikGorevlisi g=new GuvenlikGorevlisi();
		Asistan a=new Asistan();
		a.derseGir();*/
		
		Calisan calisan=new Calisan("Sevval Demir","sevval@gmail.com","5555555555");
		//Akademisyen akademisyen=new Akademisyen("Ali","ali@gmail.com","1111111111","CENG","Hoca","BYM101");
		Memur memur=new Memur("Suna","suna@gmail.com","3333333333","CENG","Yarım Gün");
		//akademisyen.getadSoyad();
		
		Ogretmen ogretimUyesi=new Ogretmen("Veli4950","veli@gmail.com","2222222222","CENG","Hoca","BYM201","Doçent");
		//ogretimUyesi.giris();
		
		//Calisan c=new Akademisyen("Ali","ali@gmail.com","1111111111","CENG","Hoca","BYM101");
		
		//Calisan[] girisListesi= {akademisyen,ogretimUyesi,memur};
		
		//Calisan.listele(girisListesi);
		
		ogretimUyesi.derseGir(10);
}
}
