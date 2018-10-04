package edu.cvtc.java.shapes.controllers;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog {

	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
		return JOptionPane.OK_OPTION;
	}
}
