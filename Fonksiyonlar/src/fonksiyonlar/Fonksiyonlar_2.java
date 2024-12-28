package fonksiyonlar;

public class Fonksiyonlar_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Özyinelemeli metotlar(recursive)
		//f(1)=1
		//f(2)=f(1)+2
		//f(3)=f(2)+3
		//...
		//...
		//f(7)=f(6)+7
		
		System.out.println(r(10));
		
	}
	
	static int r(int x)
	{
		if(x==1)
		{
			return 1;
		}
		return x+r(x-1);
	}
	
	static int f(int x)
	{
		int toplam=0;
		for(int i=1;i<=10;i++)
		{
			toplam+=i;
		}
		return toplam;
	}

}
