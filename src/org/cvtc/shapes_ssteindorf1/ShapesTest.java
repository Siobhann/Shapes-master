/**
 * 
 */
package org.cvtc.shapes_ssteindorf1;

/**
 * @author steinsl
 *
 */
public class ShapesTest {
	// Main method
	public static void main(String[] args) {
		// Instantiating new object instances
		Cuboid cuboid = new Cuboid(7, 6, 1);
		Cylinder cylinder = new Cylinder(2, 10);
		Sphere sphere = new Sphere(7);
		
		// Calling the render method for each object
		cuboid.render();
		cylinder.render();
		sphere.render();
	}
}
