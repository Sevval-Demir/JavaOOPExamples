package Siniflar;

public class Siniflar {

	public static void main(String[] args) {
		//Object oriented programming
		//SınıfAdı objeAdı=new SınıfAdı()
		
		/*HesapMakinesi makine1=new HesapMakinesi();
		makine1.sayi1=10;
		makine1.sayi2=20;
		System.out.println(makine1.sayi1);
		System.out.println(makine1.sayi2);*/
		
		/*HesapMakinesi makine2=new HesapMakinesi();
		makine2.sayi1=55;
		makine2.sayi2=45;
		System.out.println(makine2.sayi1);
		System.out.println(makine2.sayi2);*/
		
		/*HesapMakinesi makine1;
		makine1=new HesapMakinesi(1,3);
		//Constructor(yapıcı) newden sonraki kısım
		 
		System.out.println(makine1.sayi1);
		System.out.println(makine1.sayi2);*/
		
		HesapMakinesi m1=new HesapMakinesi(10,5,"yesil");
		System.out.println(m1.toplama());
		System.out.println(m1.cikarma());
		System.out.println(m1.carpma());
		System.out.println(m1.bolme());
		
		HesapMakinesi m2=new HesapMakinesi(10,100,"mavi");
		System.out.println(m2.toplama());
	}

}
