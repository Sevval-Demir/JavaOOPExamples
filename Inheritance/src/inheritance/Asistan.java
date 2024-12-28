package inheritance;

public class Asistan extends Akademisyen{
	private String yuksekLisans;
	
	public Asistan(String adSoyad,String eposta,String telefon,String bolum,String gorev,String dersler,String yuksekLisans)
	{
		super(adSoyad,eposta,telefon,bolum,gorev,dersler);
		this.yuksekLisans=yuksekLisans;
	}
	
	@Override
	public String giris()
	{
		return "Asitan "+super.giris();
	}
	public String getYuksekLisans()
	{
		return this.yuksekLisans;
	}
	public void setYuksekLisans(String yuksekLisans)
	{
		this.yuksekLisans=yuksekLisans;
	}

	@Override
	public void derseGir(int dersSaati)
	{
		System.out.println(getadSoyad() +" "+getDersler()+" Dersine Asistan olarak girdi.");
	}
	
}
