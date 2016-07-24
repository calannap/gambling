package Model;

import Controlador.ListenerBotons;
import Model.casella;
import Model.usuari;

import java.util.Random;
import java.util.Scanner;

public class inicia {
	
	usuari u;
	casella[] c;
	Random rand;
	private int win;
	private TimeCounterThread tcount;
	private boolean flag = true;
	
	public inicia() {
		
		tcount = new TimeCounterThread();
		u  = new usuari();		
		rand = new Random(System.nanoTime());
		
		c = new casella[37];

		for (int i = 0; i < 37; i++){
			c[i] = new casella(i);
		}	
		
	}
	
	public  void resgisteListener(ListenerBotons l) {
		tcount.resgisteListener(l);
	}
	
	public void juga(){
		tcount.start();
	}
	
	public void Apostar(int pasta, int cas, int casell, int doc){
		u.apostar(pasta, cas, casell, doc);
	}
	
	public int getBalance (){		
		return u.getDiners();
	}
	
	public int TiraBola(){
	
		win = 0;
		int resultat = rand.nextInt(36);
		win = u.recupera(c[resultat]);
		
		return resultat;
	}
	public int Winner(){return win;}
	
	public boolean isRunning(){
		return tcount.isRunning();
	}
	
}

