import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		// element() kuyruğun başındaki öğeyi verir,ama onu kuyruktan atmaz
		// offer(E o) Mümkünse verilen öğeyi kuyruğa ekler
		// peek() kuyruğun başındaki öğeyi verir,ama onu kuyruktan atmaz.Kuyruk boşsa null verir
		// poll() kuyruğun başındaki öğeyi verir ve onu kuyruktan atar.Kuyruk boşsa null verir
		// remove() kuyruğun başındaki öğeyi verir ve onu kuyruktan atar
		
		/*Queue q=new LinkedList();
		q.add("Deniz");
		q.add("Mehmet");
		q.offer("Ali");
		q.offer("Damla");
		
		System.out.println("q.remove() : "+q.remove());
		System.out.println("q.element() : "+q.element());
		System.out.println("q.peek() : "+q.peek());
		System.out.println("q.poll() : "+q.poll());


		q.forEach(i->System.out.println(i));
		*/
		
		PriorityQueue q=new PriorityQueue();
		q.add(80);
		q.add(20);
		q.add(10);
		q.add(50);
		
		while(!q.isEmpty())
		{
			System.out.println(q.remove());
		}
		//küçükten büyüğe doğru sıralandı
		//tek farkı özelleşitirilebilir olması
		
		
		
		
		

	}

}
