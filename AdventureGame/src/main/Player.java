package main;
import java.util.Scanner;
public class Player {
	private int damage,healthy,money,rHealthy;
	private String name,cName;
	private Inventory inv;
	Scanner scan=new Scanner(System.in);
	public Player(String name)
	{
		this.name=name;
		this.inv=new Inventory();
	}
	
	public void selectCharacter()
	{
		switch(characterMenu())
		{
		case 1:
			initPlayer("SAMURAY",5,21,15);
			break;
		case 2:
			initPlayer("OKÇU",7,18,20);
			break;
		case 3:
			initPlayer("ŞÖVALYE",8,24,5);
			break;
		default:
			initPlayer("SAMURAY",5,21,15);
		}
		System.out.println("Karakteriniz oluştu !");
		System.out.println("Karakter : "+getcName()+"\t Hasar : "+getDamage()+"\t Sağlık : "+getHealthy()+"\t Para : "+getMoney());
		
	}
	public int characterMenu()
	{
		System.out.println("Lütfen bir karakter seçiniz : ");
		System.out.println("1 -> Samuray  \t Hasar : 5  \t Sağlık : 21  \t Para : 15");
		System.out.println("2 -> Okçu  \t Hasar : 7  \t Sağlık : 18  \t Para : 20");
		System.out.println("3 -> Şövalye  \t Hasar : 8  \t Sağlık : 24  \t Para : 5");
		System.out.println("Karakter Seçiminiz : ");
		
		int characterId=scan.nextInt();
		while(characterId<1 || characterId>3)
		{
			System.out.println("Lütfen geçerli bir karakter seçiniz !");	
			characterId=scan.nextInt();
		}
		return characterId;
	}
	
	public int getTotalDamage()
	{
		return this.getDamage()+this.getInv().getDamage();
	}
	public void initPlayer(String cName,int damage,int healthy,int money)
	{
		setcName(cName);
		setDamage(damage);
		setHealthy(healthy);
		setMoney(money);
		setrHealthy(healthy);
	}
	public int getDamage()
	{
		return damage;
	}
	public void setDamage(int damage)
	{
		this.damage=damage;
	}
	
	
	public int getHealthy()
	{
		return healthy;
	}
	public void setHealthy(int healthy)
	{
		this.healthy=healthy;
	}
	
	
	public int getMoney()
	{
		return money;
	}
	public void setMoney(int money)
	{
		this.money=money;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	public String getcName()
	{
		return cName;
	}
	public void setcName(String cName)
	{
		this.cName=cName;
	}
	
	public int getrHealthy()
	{
		return rHealthy;
	}
	public void setrHealthy(int rHealthy)
	{
		this.rHealthy=rHealthy;
	}

	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}
	
}
