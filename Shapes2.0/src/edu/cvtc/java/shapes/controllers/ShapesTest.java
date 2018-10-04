package edu.cvtc.java.shapes.controllers;


import edu.cvtc.java.shapes.Models.Cuboid;
import edu.cvtc.java.shapes.Models.Cylinder;
import edu.cvtc.java.shapes.Models.Sphere;


public class ShapesTest {
	public static void main(String[] args) {

	ShapeFactory shapeFactory = new ShapeFactory(new MessageBox());
	
	Cuboid cuboid = (Cuboid) shapeFactory.make(ShapeType.Cuboid);
	Cylinder cylinder = (Cylinder) shapeFactory.make(ShapeType.Cylinder);
	Sphere sphere = (Sphere) shapeFactory.make(ShapeType.Sphere);
	
	cuboid.render();
	cylinder.render();
	sphere.render();
	
	}
}
