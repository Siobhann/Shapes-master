package edu.cvtc.java.shapes.Models;

import edu.cvtc.java.shapes.controllers.Dialog;
import edu.cvtc.java.shapes.controllers.Renderer;

public class Cuboid extends Shape implements Renderer {

	// Variable declaration
	private float width = 0.0f;
	private float height = 0.0f;
	private float depth = 0.0f;
	
	
	// Getters and Setters
	public float getWidth() {
		return width;
	}
	
	private void setWidth(float width) {
		this.width = width;
	}


	public float getHeight() {
		return height;
	}


	private void setHeight(float height) {
		this.height = height;
	}


	public float getDepth() {
		return depth;
	}


	private void setDepth(float depth) {
		this.depth = depth;
	}

	// constructor 
	public Cuboid(float width, float height, float depth, Dialog messageBox) {
		super(messageBox);
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	
	}

	@Override
	public float getSurfaceArea() {
		return 2 * getDepth() * getWidth() + 2 * getDepth() * getHeight() + 2 * getHeight() * getWidth();
	}

	@Override
	public float getVolume() {
		return getDepth() *  getWidth() * getHeight();
	}
	
	
	@Override
	public void render() {
		String message = "Height: " + getHeight() + 
				"\n Width: " + getWidth() + 
				"\n Depth: " + getDepth() +
				"\n \n Surface Area: " + getSurfaceArea() +
				"\n Volume: " + getVolume();
			
		this.messageBox.show(message, "Cuboid");
	}
}

