import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//nesneleri gruplar halinde temsil eden bir yapı
		//collectionda liste içinde birden farklı türde nesneler tutulabilir
		//HashSet<E>
		//LinkedHashSet<E>
		//TreeSet<E> elemanlar artarak sıralanır
		
		/*LinkedHashSet gunler=new LinkedHashSet();
		gunler.add("Pazartesi");
		gunler.add("Salı");
		gunler.add("Çarşamba");
		gunler.add("Perşembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		gunler.add(null);
		gunler.remove("Pazar");
		//ilk giren ilk çıkar
		gunler.add("Pazartesi");
		gunler.forEach(item->System.out.print(item+","));*/
		
		/*TreeSet tree =new TreeSet();
		tree.add(10);
		tree.add(1);
		tree.add(2);
		tree.add(6);
		//tree.add(null);
		//küçükten büyüğe doğru sıralanıyor
		try
		{
			tree.add(null);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		tree.forEach(item->System.out.println(item));*/
		
		//sette tekrarlanan verilere izin verilmiyordu,listte izin veriliyor
		
		/*ArrayList country=new ArrayList();
		country.add("İstanbul");
		country.add("Ankara");
		country.add("Roma");
		country.add("Madrid");
		country.add("Roma"); //tekrar eden değeri yazdı
		
		country.add(5, "İstanbul");
		country.remove(1);
		//country.forEach(item-> System.out.println(item));
		
		Iterator itr=country.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		*/
		//dinamik yapı boyut vermeye gerek yok
		
		//LinkedList bir eleman birden fazla eklenebilir,null kabul edilir,array list ile aynıdır
		//Linked ve arraylerin arama algoritmaları ve hızları farklı 
		//arama kısmında arraylist daha iyi,eleman silmede linkedlist daha iyi
		
		/*LinkedList linkedlist=new LinkedList();
		linkedlist.add("Çilek");
		linkedlist.add("Armut");
		linkedlist.add("Elma");
		linkedlist.add("Çilek");
		linkedlist.add(1,"Karpuz");
		
		linkedlist.forEach(item->System.out.println(item));
		*/
		
		
		//Vector<E>
		//senkronize collection yapısı,
		
		/*Vector v=new Vector();
		v.add(1);
		v.add("Bilgisayar");
		v.add("+20");
		v.forEach(i->System.out.println(i));
		System.out.println(v.size()); //boyut
		System.out.println(v.capacity()); //kapasite
		
		//vektör kapasitesi değiştirilebilir
		
		Vector v =new Vector(4);
		//varsayılan başlangıç boyut değeri 4,her boyutu aştığımızda 4er 4er artar
		
		Vector v =new Vector(4,2);
		//Boyutum 4,kapsitem de 2 2 artacak
		v.remove(1);//1.eleman silinir
		v.firstElement(); //ilk elemanı verir
		*/
		
		
		
	}

}
