package edu.cvtc.java.shapes.controllers;


import edu.cvtc.java.shapes.Models.Cuboid;
import edu.cvtc.java.shapes.Models.Cylinder;
import edu.cvtc.java.shapes.Models.Sphere;


public class ShapesTest {
	public static void main(String[] args) {
	// Instantiating new object instances
	Cuboid cuboid = new Cuboid(7.0f, 6.0f, 1.0f, new MessageBox());
	Cylinder cylinder = new Cylinder(2, 10, new MessageBox());
	Sphere sphere = new Sphere(7, new MessageBox());
			
	cuboid.render();
	cylinder.render();
	sphere.render();
	
	}
}
