package edu.cvtc.java.shapes.Models;

import edu.cvtc.java.shapes.controllers.Dialog;
import edu.cvtc.java.shapes.controllers.Renderer;

public class Cylinder extends Shape implements Renderer {

	// Variable declaration
	private float radius = 0.0f;
	private float height = 0.0f;
	
	// Getters and Setters 
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}


	public Cylinder(float radius, float height, Dialog messageBox) {
		super(messageBox);
		setRadius(radius);
		setHeight(height);
		
	}

	@Override
	public void render(){
		String message = 
				"Height: " + getHeight() + 
				"\n Radius: " + getRadius() + 
				"\n \n Surface Area: " + getSurfaceArea() +
				"\n Volume: " + getVolume();
		
		this.messageBox.show(message, "Cylinder");
	
	} 
		
	@Override
	public float getSurfaceArea() {
		return (float) (2 * Math.PI * getRadius() * getHeight() + 2 * Math.PI * Math.pow(getRadius(), 2));
	}

	@Override
	public float getVolume() {
		return (float) (Math.PI * Math.pow(getRadius(), 2) * getHeight());
	}

}
