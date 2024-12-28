package Siniflar;

public class Employee 
{
	private String name;
	public double salary;
	private double workHours;
	private double hireYear;
	
	Employee(String name,double salary,double workHours,double hireYear)
	{
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	
	public double tax()
	{
		if(this.salary>=1000)
		{
			return salary*0.03;
		}
		
		
		return 0.0;

	}
	
	public double bonus()
	{
		double extraHours=this.workHours-40;
		if(extraHours>0)
		{
			return 30*extraHours;
		}
		return 0.0;
	}
	
	public double increase()
	{
		double year=2020-this.hireYear;
		if(year<10)
		{
			return salary*0.05;
		}
		else if(year>=10 && year<20)
		{
			return salary*0.1;
		}
		else
		{
			return salary*0.15;
		}
	}
}
