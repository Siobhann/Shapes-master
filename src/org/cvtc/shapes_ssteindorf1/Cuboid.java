/**
 * 
 */
package org.cvtc.shapes_ssteindorf1;

import javax.swing.JOptionPane;

/**
 * @author steinsl
 *
 */
public class Cuboid extends Shape {
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


	// Constructor - pass the values from the main method - ShapesTest - to set these dimensions 
	public Cuboid(float width, float height, float depth) throws IllegalArgumentException {
		if(width <= 0 || height <=0 || depth <= 0.0) {
			throw new IllegalArgumentException("Number can not be less than or equal to 0");
		}
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}

	
	// Inherited methods from super - override used to accept the formulas from this class
	@Override
	public float surfaceArea() {
		return 2 * getDepth() * getWidth() + 2 * getDepth() * getHeight() + 2 * getHeight() * getWidth();
	}

	@Override
	public float volume() {
		return getDepth() *  getWidth() * getHeight();
	}

	// Error handling if any number is 0 or less it will return both surfaceArea and Volume to be 0 or less
	@Override
	public void render() {
		if (surfaceArea() <= 0 || volume() <= 0) {
			JOptionPane.showMessageDialog(null, 
			"Physics Violation! Unable to calculate. Your dimensions must be greater than 0. \n Height: " +
			getHeight() + 
			"\n Width: " + getWidth() + 
			"\n Depth: " + getDepth(), 
					"Cuboid Calulcation Error", JOptionPane.ERROR_MESSAGE);
		} else {
		JOptionPane.showMessageDialog(null, 
				"Height: " + getHeight() + 
				"\n Width: " + getWidth() + 
				"\n Depth: " + getDepth() +
				"\n \n Surface Area: " + surfaceArea() +
				"\n Volume: " + volume(), 
				"Cuboid", JOptionPane.PLAIN_MESSAGE);		
		}
	}
}
