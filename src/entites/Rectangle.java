package entites;

import enume.Collor;

public class Rectangle extends Shape {

	private Double height;
	private Double width;
	
	public Rectangle() 
	{
		super();
	}

	public Rectangle(Collor color,Double height, Double width) {
		super(color);
		this.height = height;
		this.width = width;
	}
	
	public void setHeight(Double height) 
	{
		this.height = height;
	}
	
	public Double getHeight() 
	{
		return height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}
	
	@Override
	public Double Area() 
	{
		return height * width;
	}
	
	
}
