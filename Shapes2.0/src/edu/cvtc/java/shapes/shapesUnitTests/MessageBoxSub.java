package edu.cvtc.java.shapes.shapesUnitTests;

import edu.cvtc.java.shapes.controllers.Dialog;

public class MessageBoxSub implements Dialog {

	@Override
	public int show(String message, String title) {
		return 0x00;
	}

}
