package inheritance;

public class BilgiIslem extends Memur{
	String gorev;
	
	public BilgiIslem(String adSoyad,String eposta,String telefon,String departman,String mesai,String gorev)
	{
		super(adSoyad,eposta,telefon,departman,mesai);
		this.gorev=gorev;
	}
	
	public String getGorev()
	{
		return this.gorev;
	}
	public void setGorev(String gorev)
	{
		this.gorev=gorev;
	}
}
