package com.hellokitty;

import javax.swing.JOptionPane;

public class MessageBox {
	public static void showMessage(String message){
		JOptionPane.showMessageDialog(null, message,"",JOptionPane.OK_OPTION);
	}
}
