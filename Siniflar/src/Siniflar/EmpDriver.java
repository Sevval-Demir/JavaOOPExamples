package Siniflar;

public class EmpDriver {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("Kemal",2000.0,45,1985);
		
		System.out.println("Tax : "+emp1.tax());
		System.out.println("Bonus : "+emp1.bonus());
		System.out.println("Increase Salary : "+emp1.increase());
		double totalSalary=emp1.salary-emp1.tax()+emp1.bonus();
		System.out.println("Total Salary with tax and bonus: "+totalSalary);
		System.out.println("Total Salary with the raise of salary: "+(emp1.salary+emp1.increase()));

	}

}
