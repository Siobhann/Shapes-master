package edu.cvtc.java.shapes.Models;

import edu.cvtc.java.shapes.controllers.Dialog;

public abstract class Shape {
	protected Dialog messageBox;
	
	protected Dialog getMessageBox() {
		return messageBox;
	}

	public void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	public Shape(Dialog messageBox) {
		this.messageBox = messageBox;
	};
	
	public abstract float getSurfaceArea();
	public abstract float getVolume();
}
