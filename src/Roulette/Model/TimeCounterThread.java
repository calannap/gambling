package Model;

import java.awt.event.ActionEvent;
import java.io.InterruptedIOException;

import Vista.Finestra;
import Controlador.ListenerBotons;
import Model.inicia;




public class TimeCounterThread extends Thread{
	
	private boolean running;
	private ListenerBotons listener;
	
	private int secs;
	
	public TimeCounterThread(){
		
		running = false;
		secs = 10;
	}
	
	public  void resgisteListener(ListenerBotons l) {
		listener = l;
	}
	
	public void run() {
		
		while(true) {
			while (secs > 0) {
				running = true;
				secs--;
			
				listener.mostrasecs(secs);
				
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				
				}
				if (secs == 0){

					ActionEvent e = new ActionEvent(this, 100, "tirabola");
					listener.actionPerformed(e);
				}
			}
			secs = 10;
		}
			
			
		}

		
	
	
	public boolean isRunning() {
		return running;
	}
	
	public void setRunning(boolean status) {
		running = status;
	}

}
