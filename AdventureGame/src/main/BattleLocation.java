package main;
import java.util.Scanner;
public abstract class BattleLocation extends Location{
	Scanner scan=new Scanner(System.in);
	protected Obstacle obstacle;
	protected String award;
	public BattleLocation(Player player,String name,Obstacle obstacle,String award)
	{
		super(player);
		this.obstacle=obstacle;
		this.name=name;
		this.award=award;
	}
	
	public boolean getLocation()

	{
		int obsCount=obstacle.obstacleCount();
		System.out.println("Şu an buradasınız : "+this.getname());
		System.out.println("Dikkatli ol!Burada "+obsCount+" tane "+obstacle.getName()+" yaşıyor!");
		System.out.println("<S>avaş ya da <K>aç");
		String selCase=scan.nextLine();
		selCase=selCase.toUpperCase();
		if(selCase.equals("S"))
		{
			if(combat(obsCount))
			{
				System.out.println(this.getname()+" Bölgesindeki tüm düşmanları temizlediniz");
				if(this.award.equals("Food") && player.getInv().isFood()==false)
				{
					System.out.println(this.award+" Kazandınız! ");
					player.getInv().setFood(true);
				}
				else if(this.award.equals("Water")&&player.getInv().isWater()==false)
				{
					System.out.println(this.award+" Kazandınız! ");
					player.getInv().setWater(true);
				}
				else if(this.award.equals("Firewood")&&player.getInv().isFireWood()==false)
				{
					System.out.println(this.award+" Kazandınız! ");
					player.getInv().setfireWood(true);
				}
				return true;
			}
			if(player.getHealthy()<=0)
			{
				System.out.println("Öldünüz !");
				return false;
			}
		}
		return true;
	}
	
	public boolean combat(int obsCount)
	{
		for(int i=0;i<obsCount;i++)
		{
			int defObsHealth=obstacle.getHealth();
			playerStats();
			enemyStats();
		
		while(player.getHealthy()>0 && obstacle.getHealth()>0)
		{
			System.out.println("<V>ur veya <K>aç");
			String selCase=scan.next();
			selCase=selCase.toUpperCase();
			if(selCase.equals("V"))
			{
				System.out.println("Oyuncu vurdu !");
				obstacle.setHealth(obstacle.getHealth()-player.getTotalDamage());
				afterHit();
				if(obstacle.getHealth()>0)
				{
					System.out.println();
					System.out.println(obstacle.getName()+" size vurdu !");
					player.setHealthy(player.getHealthy()-(obstacle.getDamage()-player.getInv().getArmor()));
					afterHit();
				}
			}
			else
			{
				return false;
			}
		}
			
			if(obstacle.getHealth()<player.getHealthy())
			{
				System.out.println("Düşmanı yendiniz !");
				player.setMoney(player.getMoney()+obstacle.getAward());
				System.out.println("Güncel paranız : "+player.getMoney());
				obstacle.setHealth(defObsHealth);
				
			}
			else
			{
				return false;
			}
			System.out.println("*******************************");
		}
		return true;
	}
	
	public void playerStats()
	{
		System.out.println("Oyuncu Değerleri\n**************");
		System.out.println("Can : "+player.getHealthy());
		System.out.println("Hasar : "+player.getTotalDamage());
		System.out.println("Para : "+player.getMoney());
		if(player.getInv().getDamage()>0)
		{
			System.out.println("Silah : "+player.getInv().getwName());
		}
		if(player.getInv().getArmor()>0)
		{
			System.out.println("Zırh : "+player.getInv().getaName());
			
		}
	}
	
	public void enemyStats()
	{
		System.out.println("\n"+obstacle.getName()+" Değerleri\n***************");
		System.out.println("Can : "+obstacle.getHealth());
		System.out.println("Hasar : "+obstacle.getDamage());
		System.out.println("Odül : "+obstacle.getAward());
	}
	
	public void afterHit()
	{
		System.out.println("Oyuncu Canı : "+player.getHealthy());
		System.out.println(obstacle.getName()+" Canı : "+obstacle.getHealth());
		System.out.println();
	}
}
