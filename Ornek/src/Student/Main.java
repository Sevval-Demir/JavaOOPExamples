package Student;

public class Main {
	public static void main(String[] args)
	{
		System.out.println("Online öğrenci : "+Student.howStudent());
		Student s1=new Student("Ali",220,100);
		Student s2=new Student("Ayşe",330,50);
		Student s3=new Student("Mehmet",440,75);
		System.out.println("Online öğrenci : "+Student.howStudent());
		s1.exit();
		System.out.println("Online öğrenci : "+Student.howStudent());
		
		int[] notlar=new int[3];
		notlar[0]=s1.point;
		notlar[1]=s2.point;
		notlar[2]=s3.point;
		
		System.out.println(Student.calcOverall(notlar));
	}
	
}
