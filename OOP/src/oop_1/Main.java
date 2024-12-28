package oop_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sınıflar arası ilişkiler
		//Bağımlılık(Dependency) "uses a" "A uses B"
		//Birleştirme(Composition) "has a"
		//Kalıtım(İnheritance) "is a"
		
		A a=new A();
		B b=new B();
		//a.run(b);
		//A sınıfı B'ye bağımlı
		
		a.b=b; //composition
	}

}
