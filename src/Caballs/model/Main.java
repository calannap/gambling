package model;

import java.awt.EventQueue;
import controller.ControllerC;
import view.VistaC;

public class Main {
	
	public static void main(String args[]) {
  
        	EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaC().setVisible(true);
                ControllerC.serButtonsDisabled();
            }
        });	
    }
}
