package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape{

	private Double radius;
	
	public Circle() {
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public Double area() {
		return Math.PI * (radius * radius);
	}

	public Double getRadius() {
		return radius;
	}
	
}
