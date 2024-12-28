package inheritance;

public abstract class Akademisyen extends Calisan {
	String bolum,gorev;
	String dersler;
	
	public Akademisyen(String adSoyad,String eposta,String telefon,String bolum,String gorev,String dersler)
	{
		super(adSoyad,eposta,telefon);
		this.bolum=bolum;
		this.gorev=gorev;
		this.dersler=dersler;
	}
	
	/*public void giris()
	{
		System.out.println(this.adSoyad+" giriş yaptı A kapısından !");
	}*/
	
	/*public String giris()
	{
		return this.adSoyad+" giriş yaptı A kapısından !";
	}*/
	
	public abstract void derseGir(int dersSaati);
	public String giris()
	{
		return super.giris()+"A kapısından !";
	}
	public String getBolum()
	{
		return this.bolum;
	}
	public void setBolum(String bolum)
	{
		this.bolum=bolum;
	}
	
	public String getGorev()
	{
		return this.gorev;
	}
	public void setGorev(String gorev)
	{
		this.gorev=gorev;
	}
	
	public String getDersler()
	{
		return this.dersler;
	}
	public void setDersler(String dersler)
	{
		this.dersler=dersler;
	}
	public void derseGir()
	
	{
		System.out.println("Derse girildi.");
	}

}
