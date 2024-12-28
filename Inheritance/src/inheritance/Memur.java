package inheritance;

public class Memur extends Calisan{
	String departman,mesai;
	public Memur(String adSoyad,String eposta,String telefon,String departman,String mesai)
	{
		super(adSoyad,eposta,telefon);
		this.departman=departman;
		this.mesai=mesai;
	}
	
	public String getDepartman()
	{
		return this.departman;
	}
	public void setDepartman(String Departman)
	{
		this.departman=departman;
	}
	
	public String getMesai()
	{
		return this.mesai;
	}
	public void setMesai(String mesai)
	{
		this.mesai=mesai;
	}
}
