package main;
import java.util.Scanner;
public class Game {
	Player player;
	Location location;
	Scanner scan=new Scanner(System.in);
	public void login()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Macera Oyununa Hoşgeldiniz !");
		System.out.println("Oyuna başlamadan önce isminizi giriniz : ");
		//String playerName=scan.nextLine();
		player=new Player("a");
		player.selectCharacter();
		start();
	}
	public void start()
	{
		while(true)
		{
			System.out.println();
			System.out.println("**************************************************");
			System.out.println();
			System.out.println("Eylem gerçekleştirmek için bir yer seçiniz : ");
			System.out.println("1. Güvenli Ev --> Size ait güvenli bir mekan,düşman yok");
			System.out.println("2. Mağara --> Dikkat!Karşınıza zombi çıkabilir");
			System.out.println("3. Orman --> Dikkat!Karşınıza vampir çıkabilir");
			System.out.println("4. Nehir --> Dikkat!Karşınıza ayı çıkabilir");
			System.out.println("5. Mağaza --> Silah veya zırh alabilirsiniz");
			System.out.print("Gitmek istediğiniz yer : ");
			int selectLocation=scan.nextInt();
			while(selectLocation<0 || selectLocation>5)
			{
				System.out.print("Lütfen geçerli bir yer seçiniz!");
				selectLocation=scan.nextInt();
			}
			
			switch(selectLocation)
			{
			case 1:
				location=new SafeHouse(player);
				break;
			case 2:
				location=new Cave(player);
				break;
			case 3:
				location=new Forest(player);
				break;
			case 4:
				location=new River(player);
				break;
			case 5:
				location=new ToolStore(player);
				break;
			default:
				location=new SafeHouse(player);
			}
			if(location.getClass().getName().equals("SafeHouse"))
			{
				if(player.getInv().isFireWood() && player.getInv().isFood() && player.getInv().isWater())
				{
					System.out.println("Tebrikler! Oyunu Kazandınız :) ");
				}
			}
			if(!location.getLocation())
			{
				System.out.println("Oyun Bitti!");
				break;
			}
		}
	}
}
