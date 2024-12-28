package oop_1;

public class Book {
	private String name,author,publisher;
	private int numberOfPage;
	
	Book(String name,String author,String publisher,int numberOfPage)
	{
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.numberOfPage=numberOfPage;
		if(numberOfPage<1)
		{
			this.numberOfPage=10;
		}
		else
		{
			this.numberOfPage=numberOfPage;
		}
	}
	
	public int getNumberOfPage()
	{
		return this.numberOfPage;
	}
	public void setNumberOfPage(int numberOfPage)
	{
		if(numberOfPage<1)
		{
			System.out.println("Sayfa sayısı megatif olamaz!");
			this.numberOfPage=20;
		}
		else
		{
			this.numberOfPage=numberOfPage;
		}
		
	}
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public String getPublisher()
	{
		return this.publisher;
	}
	public void setPublisher(String publisher)
	{
		this.publisher=publisher;
	}
	
	public void disPlay()
	{
		System.out.println("Name : "+getName());
		System.out.println("Author : "+getAuthor());
		System.out.println("Publisher : "+getPublisher());
		System.out.println("Number of Page : "+getNumberOfPage());
	}
}
