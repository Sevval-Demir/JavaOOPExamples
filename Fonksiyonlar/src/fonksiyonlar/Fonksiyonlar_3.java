package fonksiyonlar;
import java.util.Scanner;
public class Fonksiyonlar_3 {
	
	public static void main(String[] args)
	{
		//Palindrom=tersi kendisine eşit
		
		//121 % 10 = 1 ,yeni=1, 121/10=12
		//12%10=2, yeni=yeni*10+2=12,12/10=1
		//1%10=1,yeni=yeni*10+1=121
		
		Scanner scan=new Scanner(System.in);
		int x;
		System.out.println("Bir sayı girin : ");
		x=scan.nextInt();
		
		isPalindrom(x);
		if(isPalindrom(x)==true)
			System.out.println("Girilen sayı palindromdur");
		else
			System.out.println("Girilen sayı palindrom degildir");
	}
	
	static boolean isPalindrom(int input)
	{
		int temp,tersSayi=0,kalan;
		temp=input;
		
		while(temp!=0)
		{
			kalan=temp%10;
			tersSayi=tersSayi*10+kalan;
			temp/=10;
		}
		
		if(input==tersSayi)
			return true;
		else
			return false;
	}

}
