package Ornekler;
import java.util.Scanner;
public class Ornekler {

	public static void main(String[] args) {
		
		int[] notlar=new int[7];
		double sonuc=0;
		int toplam=0;
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Sınav notlarınızı girin : ");
		System.out.println("Matematik 1: ");
		notlar[0]=scan.nextInt();
		System.out.println("Türkçe: ");
		notlar[1]=scan.nextInt();
		System.out.println("Fizik: ");
		notlar[2]=scan.nextInt();
		System.out.println("Tarih: ");
		notlar[3]=scan.nextInt();
		System.out.println("Kimya: ");
		notlar[4]=scan.nextInt();
		System.out.println("Beden: ");
		notlar[5]=scan.nextInt();
		System.out.println("Müzik: ");
		notlar[6]=scan.nextInt();
		
		for(int not : notlar)
		{
			toplam+=not;
		}
		
		System.out.println("Ortalama : "+(toplam/notlar.length));

	}

}
