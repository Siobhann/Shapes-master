package edu.cvtc.java.shapes.Models;

import edu.cvtc.java.shapes.controllers.Dialog;
import edu.cvtc.java.shapes.controllers.Renderer;

public class Sphere extends Shape implements Renderer {

	// Variable declaration
	private float radius = 0.0f;
	
	// Getters and Setters
	public float getRadius() {
		return radius;
	}
	
	private void setRadius(float radius) {
		this.radius = radius;
	}
	
	public Sphere(float radius, Dialog messageBox) {
		super(messageBox);
		setRadius(radius);
	}


	@Override
	public float getSurfaceArea() {
		return (float) (4 * Math.PI * Math.pow(getRadius(), 2));
	}

	@Override
	public float getVolume() {
		return (float) ((4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3));
	}

	@Override
	public void render() {
		String message =
				"Radius: " + getRadius() + 
				"\n \n Surface Area: " + getSurfaceArea() +
				"\n Volume: " + getVolume();
		this.messageBox.show(message, "Sphere");
	}
}
