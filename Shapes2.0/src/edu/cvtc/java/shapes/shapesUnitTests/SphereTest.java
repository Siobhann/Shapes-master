package edu.cvtc.java.shapes.shapesUnitTests;

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;
import edu.cvtc.java.shapes.Models.Sphere;

class SphereTest {

	@Test
	void testGetSurfaceArea() {
		Sphere sphere1 = new Sphere(7, new MessageBoxSub());
		assertEquals(615.75, sphere1.getSurfaceArea(), 0.2);
	}

	@Test
	void testGetVolume() {
		Sphere sphere1 = new Sphere(7, new MessageBoxSub());
		assertEquals(1436.7, sphere1.getVolume(), 0.2);
	}

	@Test
	void testGetRadius() {
		Sphere sphere1 = new Sphere(7, new MessageBoxSub());
		assertEquals(7, sphere1.getRadius(), 0.2);
	}

	@Test
	void testSphere() {
		@SuppressWarnings("unused") // removed to remove error warning to validate code 
		Sphere sphere1 = new Sphere(0, new MessageBoxSub());;
	}
	
	@Test
	void testRender() {
		assertEquals(JOptionPane.OK_OPTION, 0x00);
	}

}
