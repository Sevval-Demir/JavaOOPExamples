package fonksiyonlar;
import java.util.Scanner;
public class Fonksiyonlar_4 {
	public static void main(String[] args)
	{
		//1 1 2 3 5 8 13 21
		//f(6)=f(4)+f(5)
		//f(3)=f(1)+f(2)
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.println("Fibonacci hesaplaması için bir sayı girin : ");
		a=scan.nextInt();
		System.out.println(fibonacci(a));
		
		
	}
	
	static int fibonacci(int a)
	{
		if(a==1 || a==2)
		{
			return 1;
		}
		
		else
		{
			return fibonacci(a-2)+fibonacci(a-1);
			
			
		}
	}
}
