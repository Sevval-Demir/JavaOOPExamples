package inheritance;

public class Calisan {
	protected String adSoyad,eposta;
	protected String telefon;
	
	public Calisan(String adSoyad,String eposta,String telefon)
	{
		this.adSoyad=adSoyad;
		this.eposta=eposta;
		this.telefon=telefon;
	}
	
	/*protected void giris()
	{
		System.out.println(this.adSoyad+" giriş yaptı !");
	}*/
	
	public static void listele(Calisan[] girisYapanlar)
	{
		for(Calisan calisan:girisYapanlar)
		{
			System.out.println(calisan.giris());
		}
	}
	
	public String giris()
	{
		return this.adSoyad+" giriş yaptı!";
	}
	
	public String getadSoyad()
	{
		return this.adSoyad;
	}
	public void setadSoyad(String adSoyad)
	{
		this.adSoyad=adSoyad;
	}
	
	public String geteposta()
	{
		return this.eposta=eposta;
	}
	public void seteposta(String eposta)
	{
		this.eposta=eposta;
	}
	
	public String getTelefon()
	{
		return this.telefon=telefon;
	}
	public void setTelefon(String telefon)
	{
		this.telefon=telefon;
	}
	
	
	/*protected void giris()
	{
		System.out.println("Çalışan giriş yaptı");
		
	}*/

}
