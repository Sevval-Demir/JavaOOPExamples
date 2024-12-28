package inheritance;

public class Ogretmen extends Akademisyen{
	String unvan;
	public Ogretmen(String adSoyad,String eposta,String telefon,String bolum,String gorev,String dersler,String unvan)
	{
		super(adSoyad,eposta,telefon,bolum,gorev,dersler);
		this.unvan=unvan;
	}
	
	public String giris()
	{
		return this.unvan+" "+super.giris();
	}
	public String getUnvan()
	{
		return this.unvan;
	}
	public void setUnvan(String unvan)
	{
		this.unvan=unvan;
	}
	
	@Override
	public void derseGir(int dersSaati)
	{
		System.out.println(getUnvan()+" "+getadSoyad() +" "+getDersler()+" Dersine Asistan olarak girdi.");
	}
}
