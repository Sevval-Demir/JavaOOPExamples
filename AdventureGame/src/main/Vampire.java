package main;

public class Vampire extends Obstacle {
	public Vampire(String name,int damage,int health,int award,int maxNumber)
	{
		super(name,damage,award,health,maxNumber);
	}
	public Vampire()
	{
		super("Vampir",4,14,7,3);
	}
}
