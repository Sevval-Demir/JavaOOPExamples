
public class Main {

	public static void main(String[] args) {
		// Nested Class(İç İçe Sınıflar)
		// -Inner Class(İç Sınıflar)
		// Static
		// Non-Static
		//Local Class(Yerel Sınıflar)
		//Anonymous Class(Anonim Sınıflar)
		
		NonStatic n=new NonStatic();
		NonStatic.Inner inner=n.new Inner();
		//inner.run();
		Static.Inner s=new Static.Inner();
		//s.run();
		Local l=new Local();
		//l.run();
		Anonim anonim=new Anonim() {
			public void run()
			{
				System.out.println("Anonim sınıfına ait run methodu");
			}
			public void print()
			{
				System.out.println("Print");
			}
			//yeni method yazamam ancak override edebilirim
		};
		anonim.run();
		anonim.print();
		
	}


}
