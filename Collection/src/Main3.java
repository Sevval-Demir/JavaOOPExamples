import java.util.*;
public class Main3 {

	public static void main(String[] args) {
		// clear() Map içinde bulunan bütün değerleri siler
		// get(Object key) Anahtara karşılık gelen objeyi döndürür
		//put(Object Key,Object Value) Anahtar-değer ikilisini kaydeder
		
		//Mapler sayesinde indisler ile oynanabilir,tek şart aynı adresten iki tane olamaz
		
		/*HashMap b=new HashMap();
		b.put("Türkiye", "Ankara");
		b.put("İtalya", "Roma");
		b.put("İspanya", "Madrid");
		//Object keyler benzersiz olmalı
		b.put("Türkiye", "Paris");
		//Türkiyenin son valuesunu yazdırır
		Set s=b.entrySet();
		Iterator i=s.iterator();
		//Iterator set döndürüyor
		while(i.hasNext())
		{
			Map.Entry item=(Map.Entry) i.next();
			System.out.println(item.getKey()+" -> "+item.getValue());
		}
		
		//Sırayla tutmadı
		
		System.out.println(b.get("İspanya"));
		*/
		
		/*LinkedHashMap ogr=new LinkedHashMap();
		ogr.put("Ali", 90);
		ogr.put("Vei", 80);
		ogr.put("Veli", 75);
		
		Set set=ogr.entrySet();
		Iterator i=set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry item=(Map.Entry) i.next();
			System.out.println(item.getKey()+" -> "+item.getValue());
		}
		//Bu sıra neyse o sırada çıkar
		*/
		
		
		TreeMap ogr=new TreeMap();
		ogr.put("Ali", 90);
		ogr.put("Veli", 80);
		ogr.put("Ahmet", 75);
		
		Set set=ogr.entrySet();
		Iterator i=set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry item=(Map.Entry) i.next();
			System.out.println(item.getKey()+" -> "+item.getValue());
		}
		
		//Stringlere göre sıralama yaptı
		
		
		TreeMap ogr=new TreeMap();
		ogr.put(10, "Ali");
		ogr.put(5, "Veli");
		ogr.put(6, "Ahmet");
		
		Set set=ogr.entrySet();
		Iterator i=set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry item=(Map.Entry) i.next();
			System.out.println(item.getKey()+" -> "+item.getValue());
		}
		
		//keye göre sıralama yapar,küçükten büyüğe doğru
		
		
		
		
		
		
		
	}

}
