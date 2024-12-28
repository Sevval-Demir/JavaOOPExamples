package inheritance;

public class GuvenlikGorevlisi extends Memur{
	String belge;
	public GuvenlikGorevlisi(String adSoyad,String eposta,String telefon,String departman,String mesai,String belge)
	{
		super(adSoyad,eposta,telefon,departman,mesai);
		this.belge=belge;
	}
	
	public String getBelge()
	{
		return this.belge=belge;
	}
	public void setBelge(String belge)
	{
		this.belge=belge;
	}
}
