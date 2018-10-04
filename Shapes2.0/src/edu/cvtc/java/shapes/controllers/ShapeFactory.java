package edu.cvtc.java.shapes.controllers;

import edu.cvtc.java.shapes.Models.Cuboid;
import edu.cvtc.java.shapes.Models.Cylinder;
import edu.cvtc.java.shapes.Models.Shape;
import edu.cvtc.java.shapes.Models.Sphere;

public class ShapeFactory {
	private Dialog dialog;
	
	// getter and setter
	public Dialog getDialog() {
		return dialog;
	}

	public void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}

	
	// constructor
	public ShapeFactory(Dialog dialog) {
		this.dialog = dialog;
	}

	public Shape make(ShapeType type) {
		if (type == null) {
			return null;
		} 
		
		if (type == ShapeType.Cuboid) {
			return new Cuboid(2, 3, 10, dialog);
		} else if (type == ShapeType.Sphere) {
			return new Sphere(7, dialog);
		} else if (type == ShapeType.Cylinder) {
			return new Cylinder(5, 3, dialog);
		}
		return null;
	}

}
