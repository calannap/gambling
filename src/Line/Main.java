

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	
	public static void main(String args[]) {
		
        	EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Vista(lista).setVisible(true);
                GraphPanel.createAndShowGui();
            }
        });	
    }
}
