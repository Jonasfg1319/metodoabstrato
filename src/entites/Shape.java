package entites;

import enume.Collor;

public abstract class Shape {

	private Collor color;
	
	public Shape() 
	{
		
	}
	
	public Shape(Collor color) 
	{
		this.color = color;
	}
	
	public void setColor(Collor color) 
	{
		this.color = color;
	}
	
	public Collor getColor() 
	{
		return color;
	}
	
	
	public abstract Double Area(); 
	
		
	
	
	
}
