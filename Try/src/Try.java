import java.util.Scanner;
public class Try {

	public static void main(String[] args) {
		
		System.out.println("Program Başladı!");
		int a=0,b;
		int[] arr=new int[3];
		Scanner scan=new Scanner(System.in);
		try
		{
			 a =2/1; //hata yakalandı
			 System.out.println(a);
			 arr[4]=10;
			 b=scan.nextInt();
		}
		catch(ArithmeticException e)
		{
			System.out.println("0'a bölünme hatası!");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array boyut hatası!");
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Bir hata var!");
			System.out.println(e.getMessage());
		}
		finally //Ne olursa olsun çalışır
		{
			System.out.println("Finally Kısmı");
		}
	
		System.out.println("Program Bitti");
		
		

	}

}
