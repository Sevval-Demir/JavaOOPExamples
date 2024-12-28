package main;

public class Zombie extends Obstacle{

	public Zombie(String name, int damage, int health, int award, int maxNumber) {
		super(name, damage, health, award, maxNumber);
		// TODO Auto-generated constructor stub
	}
	
	public Zombie()
	{
		super("Zombie",3,10,4,3);
	}
	
	
}
