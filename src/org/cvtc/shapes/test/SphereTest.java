package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes_ssteindorf1.Sphere;
import org.junit.Test;

public class SphereTest {

	@Test
	public void testSurfaceArea() {
		Sphere sphere1 = new Sphere(7);
		assertEquals(615.75, sphere1.surfaceArea(), 0.2);
	}

	@Test
	public void testVolume() {
		Sphere sphere1 = new Sphere(7);
		assertEquals(1436.7, sphere1.volume(), 0.2);
	}

	@Test
	public void testGetRadius() {
		Sphere sphere1 = new Sphere(7);
		assertEquals(7, sphere1.getRadius(), 0.2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSphere() {
		Sphere sphere1 = new Sphere(0);
	}

}
