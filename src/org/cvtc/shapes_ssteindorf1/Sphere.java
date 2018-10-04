/**
 * 
 */
package org.cvtc.shapes_ssteindorf1;

import javax.swing.JOptionPane;

/**
 * @author steinsl
 *
 */
public class Sphere extends Shape {
	// Variable declaration
	private float radius = 0.0f;
	
	// Getters and Setters
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}

	// Constructor - pass the values from the main method - ShapesTest - to set these dimensions
	public Sphere(float radius) throws IllegalArgumentException {
		if(radius <= 0.0) {
			throw new IllegalArgumentException("Number can not be less than or equal to 0");
		}
		
		setRadius(radius);
	}

	// Inherited methods from super - override used to accept the formulas from this class
	@Override
	public float surfaceArea() {
		return (float) (4 * Math.PI * Math.pow(getRadius(), 2));
	}

	@Override
	public float volume() {
		return (float) ((4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3));
	}
	
	// Error handling if any number is 0 or less it will return both surfaceArea and Volume to be 0 or less
	@Override
	public void render() {
		if (surfaceArea() <= 0 || volume() <= 0) {
			JOptionPane.showMessageDialog(null, 
			"Physics Violation! Unable to calculate. Your radius must be greater than 0. \n Radius: " +
			getRadius(), 
			"Sphere Calulcation Error", JOptionPane.ERROR_MESSAGE);
		} else {
		JOptionPane.showMessageDialog(null, 
				"Radius: " + getRadius() + 
				"\n \n Surface Area: " + surfaceArea() +
				"\n Volume: " + volume(), 
				"Sphere", JOptionPane.PLAIN_MESSAGE);		
		}
	}
}