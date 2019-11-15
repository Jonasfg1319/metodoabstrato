package entites;

import enume.Collor;

public class Circle extends Shape {

	private Double radius;
	
	
	public Circle() 
	{
		super();
	}
	
	public Circle(Collor color, Double radius) 
	{
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double Area() 
	{
		return Math.PI * radius * radius;
	}
	
	
	
	
	
	
}
