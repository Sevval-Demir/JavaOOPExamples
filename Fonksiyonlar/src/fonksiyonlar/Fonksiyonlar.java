package fonksiyonlar;
import java.util.Scanner;

public class Fonksiyonlar {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// f(x)=(x+2)*6
		
		Scanner scan=new Scanner(System.in);
		
		/*double x;
		System.out.println("Bir sayı girin : ");
		x=scan.nextDouble();
		f(x);
		
		int a,b;
		System.out.println("İki adet sayı girin : ");
		a=scan.nextInt();
		b=scan.nextInt();
		power(a,b);*/
		
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1,2,3.2));
		
		
	}
	//add(int,int)
	static int add(int a,int b)
	{
		return a+b;
	}
	//add(int,int,int)
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	//add(int,int,double)
	static double add(int a,int b,double c)
	{
		return a+b+c;
	}
	
	/*static void f(double x)
	{
		double result=(x+2)*6;
		System.out.println("Fonksiyon degeri : "+result);
	}*/
	
	/*static void power(int a,int b)
	{
		//üs alma
		int result=1;
		for(int i=1;i<=b;i++)
		{
			result*=a;
		}
		System.out.println("Üs alma : "+result);
		
	}*/
		
	
	//Overloading
	//Aynı isimli metotları farklı metotlar gibi gösterebiliriz
	
	
		
	

}
