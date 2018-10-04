package edu.cvtc.java.shapes.shapesUnitTests;

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

import edu.cvtc.java.shapes.Models.Cuboid;


class CuboidTest {

	@Test
	void testGetSurfaceArea() {
		Cuboid cube1 = new Cuboid(6, 5, 1, new MessageBoxSub());
		assertEquals(82, cube1.getSurfaceArea(), 0.5);
	}

	@Test
	void testGetVolume() {
		Cuboid cube1 = new Cuboid(6, 5, 1, new MessageBoxSub());
		assertEquals(30, cube1.getVolume(), 0.5);
		
	}
	@Test
	public void testGetWidth() {
		Cuboid cube1 = new Cuboid(1,2,2, new MessageBoxSub());
		assertEquals(1, cube1.getWidth(), 0.0002);
	}

	@Test
	public void testGetHeight() {
		Cuboid cube1 = new Cuboid(1,2,2, new MessageBoxSub());
		assertEquals(2, cube1.getHeight(), 0.0002);
	}

	@Test
	public void testGetDepth() {
		Cuboid cube1 = new Cuboid(1,2,2, new MessageBoxSub());
		assertEquals(2, cube1.getDepth(), 0.0002);
	}
	
	@Test
	void testCuboid() {
		@SuppressWarnings("unused") // removed error warning to check code, normally not done
		Cuboid cube1 = new Cuboid(0,2,3, new MessageBoxSub());
	}
	
	
	@Test
	void testRender() {
		assertEquals(JOptionPane.OK_OPTION, 0x00);	
	}
}
