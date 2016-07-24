package controller;

import java.util.logging.Level;
import java.util.logging.Logger;



public class HorseThreadC extends Thread{
	private static boolean meta1 = false;
	private static boolean meta2 = false;
	private static boolean meta3 = false;
	private static boolean meta4 = false;
	private static boolean meta5 = false;
	private static boolean meta6 = false;
	private static boolean meta7 = false;
	private static boolean meta8 = false;
	private static boolean meta9 = false;
	private static boolean meta10 = false;
	private static boolean meta11 = false;
	private static boolean meta12 = false;
	int quin;
    public HorseThreadC(String name) {
        this.setName(name);
        
    }//constr
    
	public void run(){
    	
    	while(true) {
	        if(getName().equals("Horse 1")){
	            long ti=System.currentTimeMillis(); 

	            while(meta1 == false) {
	            	LogicaC.reiniciar();
	                try { 	                	
	                    ControllerC.setlocation(1, ControllerC.getLocationX(1)+LogicaC.getLosCaballos(0).getAvance(), ControllerC.getLocationY(1));
	                	sleep(LogicaC.getLosCaballos(0).getVelocidad());
	                    if(ControllerC.getLocationX(1) >= ControllerC.getLinea()){
	                    	ControllerC.setWinnerName("Horse 1");
	                    	quin = 1;
	                    	LogicaC.winner(quin);
	                    	meta1 = true;
	                        long tf=System.currentTimeMillis();
	                        long tt= tf-ti;
	                        LogicaC.getLosCaballos(0).setTiempo(tt);
	                        System.out.println("\n"+this.getName()+":"+LogicaC.getLosCaballos(0).getTiempo()+" ms");
	                        }
	                } 
	                catch (InterruptedException ex) {
	                    Logger.getLogger(HorseThreadC.class.getName()).log(Level.SEVERE, null, ex);
	                }    
	             
	        }
	            meta1 = false;
	            setInici();
	           
	             
	        }
	              
	        
	        if(getName().equals("Horse 2")){
	            long ti=System.currentTimeMillis();
	            while (meta2 == false) {
	            	LogicaC.reiniciar();
	                try {
	                	ControllerC.setlocation(2, ControllerC.getLocationX(2)+LogicaC.getLosCaballos(1).getAvance(), ControllerC.getLocationY(2));
	                    sleep(LogicaC.getLosCaballos(1).getVelocidad());
	                    
	                    if(ControllerC.getLocationX(2) >= ControllerC.getLinea()){
	                    	ControllerC.setWinnerName("Horse 2");
	                    	quin = 2;
	                    	LogicaC.winner(quin);
	                    	meta2 = true;
	                        long tf=System.currentTimeMillis();
	                        long tt= tf-ti;
	                        LogicaC.getLosCaballos(1).setTiempo(tt);
	                        System.out.println("\n"+this.getName()+":"+LogicaC.getLosCaballos(1).getTiempo()+" ms");
	                    }
	                } //for
	                catch (InterruptedException ex) {
	                    Logger.getLogger(HorseThreadC.class.getName()).log(Level.SEVERE, null, ex);
	                }
	              
	              
	             
	        }//for
	            meta2 = false;
	            setInici();
	             
	           
	        }//if
	        
	        if(getName().equals("Horse 3")){
	            long ti=System.currentTimeMillis();
	          while (meta3 == false) {
	        	  LogicaC.reiniciar();
	                try {
	                	ControllerC.setlocation(3, ControllerC.getLocationX(3)+LogicaC.getLosCaballos(2).getAvance(), ControllerC.getLocationY(3));
	                    sleep(LogicaC.getLosCaballos(2).getVelocidad());
	                    
	                    if(ControllerC.getLocationX(3) >= ControllerC.getLinea()){
	                    	ControllerC.setWinnerName("Horse 3");
	                    	quin = 3;
	                    	LogicaC.winner(quin);
	                    	meta3 = true;
	                        long tf=System.currentTimeMillis();
	                        long tt= tf-ti;
	                        LogicaC.getLosCaballos(2).setTiempo(tt);
	                        System.out.println("\n"+this.getName()+":"+LogicaC.getLosCaballos(2).getTiempo()+" ms");
	                    }
	                } //for
	                catch (InterruptedException ex) {
	                    Logger.getLogger(HorseThreadC.class.getName()).log(Level.SEVERE, null, ex);
	                }
	              
	              
	             
	        }//for
	          meta3 = false;
	          setInici();
	             
	        }//if
	        
	        if(getName().equals("Horse 4")){
	            long ti=System.currentTimeMillis();
	          while (meta4 == false) {
	        	  LogicaC.reiniciar();
	                try {
	                	ControllerC.setlocation(4, ControllerC.getLocationX(4)+LogicaC.getLosCaballos(3).getAvance(), ControllerC.getLocationY(4));
	                    sleep(LogicaC.getLosCaballos(3).getVelocidad());
	                    
	                    if(ControllerC.getLocationX(4) >= ControllerC.getLinea()){
	                    	ControllerC.setWinnerName("Horse 4");
	                    	quin = 4;
	                    	LogicaC.winner(quin);
	                    	meta4 = true;
	                        long tf=System.currentTimeMillis();
	                        long tt= tf-ti;
	                        LogicaC.getLosCaballos(3).setTiempo(tt);
	                        System.out.println("\n"+this.getName()+":"+LogicaC.getLosCaballos(3).getTiempo()+" ms");           
	                    }
	                } //for
	                catch (InterruptedException ex) {
	                    Logger.getLogger(HorseThreadC.class.getName()).log(Level.SEVERE, null, ex);
	                }
	              
	              
	             
	        }//for
	          meta4 = false;
	          setInici();
	              
	        }//if
	        
	        if(getName().equals("Horse 5")){
	            long ti=System.currentTimeMillis();
	          while (meta5 == false) {
	        	  LogicaC.reiniciar();
	                try {
	                	ControllerC.setlocation(5, ControllerC.getLocationX(5)+LogicaC.getLosCaballos(4).getAvance(), ControllerC.getLocationY(5));
	                    sleep(LogicaC.getLosCaballos(4).getVelocidad());
	                    
	                    if(ControllerC.getLocationX(5) >= ControllerC.getLinea()){
	                    	ControllerC.setWinnerName("Horse 5");
	                    	quin = 5;
	                    	LogicaC.winner(quin);
	                    	meta5 = true;
	                        long tf=System.currentTimeMillis();
	                        long tt= tf-ti;
	                        LogicaC.getLosCaballos(4).setTiempo(tt);
	                        System.out.println("\n"+this.getName()+":"+LogicaC.getLosCaballos(4).getTiempo()+" ms");
	                    }
	                } //for
	                catch (InterruptedException ex) {
	                    Logger.getLogger(HorseThreadC.class.getName()).log(Level.SEVERE, null, ex);
	                }
	              
	              
	             
	        }//for
	          meta5 = false;
	          setInici();
	                            
	        }//if
	        
	        if(getName().equals("Horse 6")){
	            long ti=System.currentTimeMillis();
	            while (meta6 == false) {
	            	LogicaC.reiniciar();
	                try {
	                	ControllerC.setlocation(6, ControllerC.getLocationX(6)+LogicaC.getLosCaballos(5).getAvance(), ControllerC.getLocationY(6));
	                    sleep(LogicaC.getLosCaballos(5).getVelocidad());
	                    
	                    if(ControllerC.getLocationX(6) >= ControllerC.getLinea()){
	                    	ControllerC.setWinnerName("Horse 6");
	                    	quin = 6;
	                    	LogicaC.winner(quin);
	                    	meta6 = true;
	                        long tf=System.currentTimeMillis();
	                        long tt= tf-ti;
	                        LogicaC.getLosCaballos(5).setTiempo(tt);
	                        System.out.println("\n"+this.getName()+":"+LogicaC.getLosCaballos(5).getTiempo()+" ms");
	                    }//else
	                } //for
	                catch (InterruptedException ex) {
	                    Logger.getLogger(HorseThreadC.class.getName()).log(Level.SEVERE, null, ex);
	                }
	              
	              
	             
	        }//for
	            meta6 = false;
	            setInici();
	                          
	        }//if
	        
	        if(getName().equals("Horse 7")){
	            long ti=System.currentTimeMillis();
	          while (meta7 == false) { 
	        	  LogicaC.reiniciar();
	                try {
	                	ControllerC.setlocation(7, ControllerC.getLocationX(7)+LogicaC.getLosCaballos(6).getAvance(), ControllerC.getLocationY(7));
	                    sleep(LogicaC.getLosCaballos(6).getVelocidad());
	                    
	                    if(ControllerC.getLocationX(7) >= ControllerC.getLinea()){
	                    	ControllerC.setWinnerName("Horse 7");
	                    	quin = 7;
	                    	LogicaC.winner(quin);
	                    	meta7 = true;
	                        long tf=System.currentTimeMillis();
	                        long tt= tf-ti;
	                        LogicaC.getLosCaballos(6).setTiempo(tt);
	                        System.out.println("\n"+this.getName()+":"+LogicaC.getLosCaballos(6).getTiempo()+" ms");
	                    }//else
	                } //for
	                catch (InterruptedException ex) {
	                    Logger.getLogger(HorseThreadC.class.getName()).log(Level.SEVERE, null, ex);
	                }
	              
	              
	             
	        }//for
	          meta7 = false;
	          setInici();
	             
	        }//if
	        
	        if(getName().equals("Horse 8")){
	            long ti=System.currentTimeMillis();
	          while (meta8 == false) {
	        	  LogicaC.reiniciar();
	                try {
	                	ControllerC.setlocation(8, ControllerC.getLocationX(8)+LogicaC.getLosCaballos(7).getAvance(), ControllerC.getLocationY(8));
	                    sleep(LogicaC.getLosCaballos(7).getVelocidad());
	                    
	                    if(ControllerC.getLocationX(8) >= ControllerC.getLinea()){
	                    	ControllerC.setWinnerName("Horse 8");
	                    	quin = 8;
	                    	LogicaC.winner(quin);
	                    	meta8 = true;
	                        long tf=System.currentTimeMillis();
	                        long tt= tf-ti;
	                        LogicaC.getLosCaballos(7).setTiempo(tt);
	                        System.out.println("\n"+this.getName()+":"+LogicaC.getLosCaballos(7).getTiempo()+" ms");
	                    }//else
	                } //for
	                catch (InterruptedException ex) {
	                    Logger.getLogger(HorseThreadC.class.getName()).log(Level.SEVERE, null, ex);
	                }
	              
	              
	             
	        }//for
	          meta8 = false;
	          setInici();
	                       
	        }//if
	        
	        if(getName().equals("Horse 9")){
	            long ti=System.currentTimeMillis();
	          while (meta9 == false) {
	        	  LogicaC.reiniciar();
	                try {
	                	ControllerC.setlocation(9, ControllerC.getLocationX(9)+LogicaC.getLosCaballos(8).getAvance(), ControllerC.getLocationY(9));
	                    sleep(LogicaC.getLosCaballos(8).getVelocidad());
	                    
	                    if(ControllerC.getLocationX(9) >= ControllerC.getLinea()){
	                    	ControllerC.setWinnerName("Horse 9");
	                    	quin = 9;
	                    	LogicaC.winner(quin);
	                    	meta9 = true;
	                        long tf=System.currentTimeMillis();
	                        long tt= tf-ti;
	                        LogicaC.getLosCaballos(8).setTiempo(tt);	                        
	                        System.out.println("\n"+this.getName()+":"+LogicaC.getLosCaballos(8).getTiempo()+" ms");
	                    }//else
	                } //for
	                catch (InterruptedException ex) {
	                    Logger.getLogger(HorseThreadC.class.getName()).log(Level.SEVERE, null, ex);
	                }
	              
	              
	             
	        }//for
	          meta9 = false;
	          setInici();
	                           
	        }//if
	        
	        if(getName().equals("Horse 10")){
	            long ti=System.currentTimeMillis();
	          while (meta10 == false) {
	        	  LogicaC.reiniciar();
	                try {
	                	ControllerC.setlocation(10, ControllerC.getLocationX(10)+LogicaC.getLosCaballos(9).getAvance(), ControllerC.getLocationY(10));
	                    sleep(LogicaC.getLosCaballos(9).getVelocidad());                    
	                    if(ControllerC.getLocationX(10) >= ControllerC.getLinea()){
	                    	ControllerC.setWinnerName("Horse 10");
	                    	quin = 10;
	                    	LogicaC.winner(quin);
	                    	meta10 = true;
	                        long tf=System.currentTimeMillis();
	                        long tt= tf-ti;
	                        LogicaC.getLosCaballos(9).setTiempo(tt);
	                        System.out.println("\n"+this.getName()+":"+LogicaC.getLosCaballos(9).getTiempo()+" ms");
	                    }//else
	                } //for
	                catch (InterruptedException ex) {
	                    Logger.getLogger(HorseThreadC.class.getName()).log(Level.SEVERE, null, ex);
	                }
	              
	              
	             
	        }//for
	          meta10 = false;
	          setInici();
	                          
	        }//if
	        
	        if(getName().equals("Horse 11")){
	            long ti=System.currentTimeMillis();
	          while (meta11 == false) {
	        	  LogicaC.reiniciar();
	                try {
	                	ControllerC.setlocation(11, ControllerC.getLocationX(11)+LogicaC.getLosCaballos(10).getAvance(), ControllerC.getLocationY(11));
	                    sleep(LogicaC.getLosCaballos(10).getVelocidad());             
	                    if(ControllerC.getLocationX(11) >= ControllerC.getLinea()){
	                    	ControllerC.setWinnerName("Horse 11");
	                    	quin = 11;
	                    	LogicaC.winner(quin);
	                    	meta11 = true;
	                        long tf=System.currentTimeMillis();
	                        long tt= tf-ti;
	                        LogicaC.getLosCaballos(10).setTiempo(tt);
	                        //System.out.println("\n"+this.getName()+":"+logica.losCaballos[10].getTiempo()+" ms");
	                    }//else
	                } //for
	                catch (InterruptedException ex) {
	                    Logger.getLogger(HorseThreadC.class.getName()).log(Level.SEVERE, null, ex);
	                }
	              
	              
	             
	        }//for
	          meta11 = false;
	          setInici();
	                           
	        }//if
	        
	        if(getName().equals("Horse 12")){
	            long ti=System.currentTimeMillis();
	          while (meta12 == false) {
	        	  	LogicaC.reiniciar();
	                try {
	                	ControllerC.setlocation(12, ControllerC.getLocationX(12)+LogicaC.getLosCaballos(11).getAvance(), ControllerC.getLocationY(12));
	                    sleep(LogicaC.getLosCaballos(11).getVelocidad());
	                    
	                    if(ControllerC.getLocationX(12) >= ControllerC.getLinea()){
	                    	ControllerC.setWinnerName("Horse 12");
	                    	quin = 12;
	                    	LogicaC.winner(quin);
	                    	meta12 = true;
	                        long tf=System.currentTimeMillis();
	                        long tt= tf-ti;
	                        LogicaC.getLosCaballos(11).setTiempo(tt);
	                        System.out.println("\n"+this.getName()+":"+LogicaC.getLosCaballos(11).getTiempo()+" ms");
	                    }//else
	                } //for
	                catch (InterruptedException ex) {
	                    Logger.getLogger(HorseThreadC.class.getName()).log(Level.SEVERE, null, ex);
	                }
	              
	             
	        }//for
	          meta12 = false;
	          setInici();    
	        }//if 
	        
	        pause();
	        LogicaC.reiniciar();
	    }//run
    }
    
    public void pause(){
    
    	meta1 = meta2 = meta3 = meta4 = meta5 = meta6 = meta7 = meta8 = meta9 = meta10 = meta11 = meta12 = true;
    	
    	try {
    		ControllerC.setButtonsActive();
			Thread.sleep(7000);
			ControllerC.serButtonsDisabled();		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	meta1 = meta2 = meta3 = meta4 = meta5 = meta6 = meta7 = meta8 = meta9 = meta10 = meta11 = meta12 = false;

    }
    public void setInici(){
    	ControllerC.setlocation(1, LogicaC.getLosCaballos(0).getCoorX(), LogicaC.getLosCaballos(0).getCoorY());
    	ControllerC.setlocation(2, LogicaC.getLosCaballos(1).getCoorX(), LogicaC.getLosCaballos(1).getCoorY());
    	ControllerC.setlocation(3, LogicaC.getLosCaballos(2).getCoorX(), LogicaC.getLosCaballos(2).getCoorY());
    	ControllerC.setlocation(4, LogicaC.getLosCaballos(3).getCoorX(), LogicaC.getLosCaballos(3).getCoorY());
    	ControllerC.setlocation(5, LogicaC.getLosCaballos(4).getCoorX(), LogicaC.getLosCaballos(4).getCoorY());
    	ControllerC.setlocation(6, LogicaC.getLosCaballos(5).getCoorX(), LogicaC.getLosCaballos(5).getCoorY());
    	ControllerC.setlocation(7, LogicaC.getLosCaballos(6).getCoorX(), LogicaC.getLosCaballos(6).getCoorY());
    	ControllerC.setlocation(8, LogicaC.getLosCaballos(7).getCoorX(), LogicaC.getLosCaballos(7).getCoorY());
    	ControllerC.setlocation(9, LogicaC.getLosCaballos(8).getCoorX(), LogicaC.getLosCaballos(8).getCoorY());
    	ControllerC.setlocation(10, LogicaC.getLosCaballos(9).getCoorX(), LogicaC.getLosCaballos(9).getCoorY());
    	ControllerC.setlocation(11, LogicaC.getLosCaballos(10).getCoorX(), LogicaC.getLosCaballos(10).getCoorY());
    	ControllerC.setlocation(12, LogicaC.getLosCaballos(11).getCoorX(), LogicaC.getLosCaballos(11).getCoorY()); 	
    	
    }
    
    }//class