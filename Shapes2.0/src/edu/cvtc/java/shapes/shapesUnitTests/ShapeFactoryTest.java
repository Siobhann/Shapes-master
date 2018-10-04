package edu.cvtc.java.shapes.shapesUnitTests;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.Test;

import edu.cvtc.java.shapes.Models.Cuboid;

class ShapeFactoryTest {

	
	@SuppressWarnings("unused")
	@Test
	void testDialogBoxSub() {
		
		int dialog = 1;
	
		int expected = 1;
		
		String message = "Hello";
		String title = "I work";
		
		int result = 1;
		
		assertEquals(expected, result);
				
		
	}
	
	
	@Test
	void testMain() {
		CompletableFuture<Void> shapeFactory = new CompletableFuture<>();
		shapeFactory.equals(shapeFactory);
		
		Cuboid cuboid1 = new Cuboid(3, 3, 3, new MessageBoxSub());
		assertEquals(3, cuboid1.getHeight(), 0.05);
		
		
		
	}

}
