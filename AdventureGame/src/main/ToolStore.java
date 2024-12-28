package main;
import java.util.Scanner;
public class ToolStore extends NormalLocation {
	Scanner scan=new Scanner(System.in);
	ToolStore(Player player)
	{
		super(player,"Mağaza");
	}
	
	public boolean getLocation()
	{
		System.out.println("Para : "+player.getMoney());
		System.out.println("1. Silahlar");
		System.out.println("2. Zırhlar");
		System.out.println("3. Çıkış");
		System.out.println("Seçiminiz : ");
		int selTool=scan.nextInt();
		int selItemId;
		switch(selTool)
		{
		case 1:
			selItemId=weaponMenu();
			buyWeapon(selItemId);
			
			break;
		case 2:
			selItemId=armorMenu();
			buyArmor(selItemId);
			break;
		default:
			break;
		}
		return true;
	}
	public int armorMenu()
	{
		System.out.println("1 -> Hafif \tEngelleme : 1 \t Para : 15");
		System.out.println("2 -> Orta \tEngelleme : 3 \t Para : 25");
		System.out.println("3 -> Ağır \tEngelleme : 5 \t Para : 40");
		System.out.println("4 -> Çıkış");
		System.out.println("Zırh Seçiniz : ");
		int selArmorId=scan.nextInt();
		return selArmorId;
		
	}
	public void buyArmor(int itemId)
	{
		int avoid=0,price=0;
		String aName=null;
			switch(itemId)
			{
			case 1:
				avoid=1;
				price=15;
				aName="Hafif Zırh";
				break;
			case 2:
				avoid=3;
				price=25;
				aName="Orta Zırh";
				break;
			case 3:
				avoid=5;
				price=45;
				aName="Ağır Zırh";
				break;
			case 4:
				System.out.println("Çıkış yapılıyor");
				break;
			default:
				System.out.println("Geçersiz İşlem!");
				break;
			}
			if(price>0)
			{
				if(player.getMoney()>=price)
				{
					player.getInv().setArmor(avoid);
					player.getInv().setaName(aName);
					player.setMoney(player.getMoney()-price);
					System.out.println(aName+" satın alımı başarılı olmuştur,Engellenen Hasar : "+
					player.getInv().getArmor());
					System.out.println("Kalan Bakiye : "+player.getMoney());
				}
				else
				{
					System.out.println("Yetersiz Bakiye!");
				}
			}
	}
	public int weaponMenu()
	{
		System.out.println("1 -> Tabanca \tHasar : 2 \t Para : 25");
		System.out.println("2 -> Kılıç \tHasar : 3 \t Para : 35");
		System.out.println("3 -> Tüfek \tHasar : 7 \t Para : 45");
		System.out.println("4 -> Çıkış");
		System.out.println("Silah Seçiniz : ");
		int selWeaponId=scan.nextInt();
		return selWeaponId;
	}
	public void buyWeapon(int itemId)
	{
		int damage=0,price=0;
		String wName=null;
			switch(itemId)
			{
			case 1:
				damage=2;
				price=5;
				wName="Tabanca";
				break;
			case 2:
				damage=3;
				price=35;
				wName="Kılıç";
				break;
			case 3:
				damage=7;
				price=45;
				wName="Tüfek";
				break;
			case 4:
				System.out.println("Çıkış yapılıyor");
				break;
			default:
				System.out.println("Geçersiz İşlem!");
				break;
			}
			if(price>0)
			{
				if(player.getMoney()>price)
				{
					player.getInv().setDamage(damage);
					player.getInv().setwName(wName);
					player.setMoney(player.getMoney()-price);
					System.out.println(wName+" satın alımı başarılı olmuştur,Önceki Hasar : "+
					player.getDamage()+", Yeni Hasar : "+(player.getDamage()+player.getInv().getDamage()));
					System.out.println("Kalan Bakiye : "+player.getTotalDamage());
				}
				else
				{
					System.out.println("Yetersiz Bakiye!");
				}
			}
			
	}
}
