package edu.cvtc.java.shapes.shapesUnitTests;

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

import edu.cvtc.java.shapes.Models.Cylinder;


class CylinderTest  {


	@Test
	void testGetSurfaceArea() {
		Cylinder cylinder1 = new Cylinder(2, 10, new MessageBoxSub());
		assertEquals(150.796, cylinder1.getSurfaceArea(), 0.5);
	}

	@Test
	void testGetVolume() {
		Cylinder cylinder1 = new Cylinder(2, 10, new MessageBoxSub());
		assertEquals(125.6637, cylinder1.getVolume(), 0.5);
	}

	@Test
	void testGetRadius() {
		Cylinder cylinder1 = new Cylinder(2, 10, new MessageBoxSub());
		assertEquals(2, cylinder1.getRadius(), 0.5);
	}

	@Test
	void testGetHeight() {
		Cylinder cylinder1 = new Cylinder(2, 10, new MessageBoxSub());
		assertEquals(10, cylinder1.getHeight(), 0.5);
	}

	@Test
	void testCylinder() {
		@SuppressWarnings("unused") // removed to fix and check for errors this would normally not be done
		Cylinder cylinder1 = new Cylinder(0, 1, new MessageBoxSub());
	}
	
	@Test
	void testRender() {
	assertEquals(JOptionPane.OK_OPTION, 0x00);
	}
}
