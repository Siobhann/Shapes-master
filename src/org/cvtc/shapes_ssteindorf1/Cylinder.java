/**
 * 
 */
package org.cvtc.shapes_ssteindorf1;

import javax.swing.JOptionPane;

/**
 * @author steinsl
 *
 */
public class Cylinder extends Shape {
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

	// Constructor
	public Cylinder(float height, float radius) throws IllegalArgumentException {
		if(height <=0 || radius <= 0.0) {
			throw new IllegalArgumentException("Number can not be less than or equal to 0");
		}
		
		setHeight(height);
		setRadius(radius);
	}

	// Inherited methods from super - override used to accept the formulas from this class
	@Override
	public float surfaceArea() {
		// TODO Auto-generated method stub
		return (float) (2 * Math.PI * getRadius() * getHeight() + 2 * Math.PI * Math.pow(getRadius(), 2));
	}

	@Override
	public float volume() {
		// TODO Auto-generated method stub
		return (float) (Math.PI * Math.pow(getRadius(), 2) * getHeight());
	}

	// Error handling if any number is 0 or less it will return both surfaceArea and Volume to be 0 or less
	@Override
	public void render() {
		if (surfaceArea() <= 0 || volume() <= 0) {
			JOptionPane.showMessageDialog(null, 
			"Physics Violation! Unable to calculate. Your dimensions must be greater than 0. \n Radius: " +
			getRadius() + 
			"\n Height: " + getHeight(), 
			"Cylinder Calulcation Error", JOptionPane.ERROR_MESSAGE);
		} else {
		JOptionPane.showMessageDialog(null, 
				"Height: " + getHeight() + 
				"\n Radius: " + getRadius() + 
				"\n \n Surface Area: " + surfaceArea() +
				"\n Volume: " + volume(), 
				"Cylinder", JOptionPane.PLAIN_MESSAGE);	
		}
	}
}
