package controller;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import model.CaballoC;
import model.EnviaCaballC;

public class LogicaC {
    
    private static CaballoC[] losCaballos;
	static Random rnd;
    static int[] vel;
    static boolean temps = false;
    boolean endrace = false;
    private static boolean ready = false;
    
    public static void reiniciar(){
    int[] avan={6,8,10,12,14,16,18,20,22,24,26,28,30,32,33,35,37};
     //Vel	
        for(int i = 0; i<=11; i++){
        	losCaballos[i].setVelocidad(500);
        }
    	
        //avances
        losCaballos[0].setAvance(avan[rnd.nextInt(16)]);
        losCaballos[1].setAvance(avan[rnd.nextInt(16)]);
        losCaballos[2].setAvance(avan[rnd.nextInt(16)]);
        losCaballos[3].setAvance(avan[rnd.nextInt(16)]);
        losCaballos[4].setAvance(avan[rnd.nextInt(16)]);
        losCaballos[5].setAvance(avan[rnd.nextInt(16)]);
        losCaballos[6].setAvance(avan[rnd.nextInt(16)]);
        losCaballos[7].setAvance(avan[rnd.nextInt(16)]);
        losCaballos[8].setAvance(avan[rnd.nextInt(16)]);
        losCaballos[9].setAvance(avan[rnd.nextInt(16)]);
        losCaballos[10].setAvance(avan[rnd.nextInt(16)]);
        losCaballos[11].setAvance(avan[rnd.nextInt(16)]);
    	
    }//
    
    static public void registrarCaballos(){
        rnd= new Random();
        losCaballos = new CaballoC[12];
        losCaballos[0] = new CaballoC(0,0,0,0,0,"-");
        losCaballos[1] = new CaballoC(0,0,0,0,0,"-");
        losCaballos[2] = new CaballoC(0,0,0,0,0,"-");
        losCaballos[3] = new CaballoC(0,0,0,0,0,"-");
        losCaballos[4] = new CaballoC(0,0,0,0,0,"-");
        losCaballos[5] = new CaballoC(0,0,0,0,0,"-");
        losCaballos[6] = new CaballoC(0,0,0,0,0,"-");
        losCaballos[7] = new CaballoC(0,0,0,0,0,"-");
        losCaballos[8] = new CaballoC(0,0,0,0,0,"-");
        losCaballos[9] = new CaballoC(0,0,0,0,0,"-");
        losCaballos[10] = new CaballoC(0,0,0,0,0,"-");
        losCaballos[11] = new CaballoC(0,0,0,0,0,"-");
        //ingreso de datos
        //codigos
        losCaballos[0].setCodigo(101);
        losCaballos[1].setCodigo(102);
        losCaballos[2].setCodigo(103);
        losCaballos[3].setCodigo(104);
        losCaballos[4].setCodigo(105);
        losCaballos[5].setCodigo(106);
        losCaballos[6].setCodigo(107);
        losCaballos[7].setCodigo(108);
        losCaballos[8].setCodigo(109);
        losCaballos[9].setCodigo(110);
        losCaballos[10].setCodigo(111);
        losCaballos[11].setCodigo(112);
        //nombres
        losCaballos[0].setNombre("Horse 1");
        losCaballos[1].setNombre("Horse 2");
        losCaballos[2].setNombre("Horse 3");
        losCaballos[3].setNombre("Horse 4");
        losCaballos[4].setNombre("Horse 5");
        losCaballos[5].setNombre("Horse 6");
        losCaballos[6].setNombre("Horse 7");
        losCaballos[7].setNombre("Horse 8");
        losCaballos[8].setNombre("Horse 9");
        losCaballos[9].setNombre("Horse 10");
        losCaballos[10].setNombre("Horse 11");
        losCaballos[11].setNombre("Horse 12");
        //CoordX
        losCaballos[0].setCoorX(ControllerC.getLocationX(1));
        losCaballos[1].setCoorX(ControllerC.getLocationX(2));
        losCaballos[2].setCoorX(ControllerC.getLocationX(3));
        losCaballos[3].setCoorX(ControllerC.getLocationX(4));
        losCaballos[4].setCoorX(ControllerC.getLocationX(5));
        losCaballos[5].setCoorX(ControllerC.getLocationX(6));
        losCaballos[6].setCoorX(ControllerC.getLocationX(7));
        losCaballos[7].setCoorX(ControllerC.getLocationX(8));
        losCaballos[8].setCoorX(ControllerC.getLocationX(9));
        losCaballos[9].setCoorX(ControllerC.getLocationX(10));
        losCaballos[10].setCoorX(ControllerC.getLocationX(11));
        losCaballos[11].setCoorX(ControllerC.getLocationX(12));
        //CoordX
        losCaballos[0].setCoorY(ControllerC.getLocationY(1));
        losCaballos[1].setCoorY(ControllerC.getLocationY(2));
        losCaballos[2].setCoorY(ControllerC.getLocationY(3));
        losCaballos[3].setCoorY(ControllerC.getLocationY(4));
        losCaballos[4].setCoorY(ControllerC.getLocationY(5));
        losCaballos[5].setCoorY(ControllerC.getLocationY(6));
        losCaballos[6].setCoorY(ControllerC.getLocationY(7));
        losCaballos[7].setCoorY(ControllerC.getLocationY(8));
        losCaballos[8].setCoorY(ControllerC.getLocationY(9));
        losCaballos[9].setCoorY(ControllerC.getLocationY(10));
        losCaballos[10].setCoorY(ControllerC.getLocationY(11));
        losCaballos[11].setCoorY(ControllerC.getLocationY(12));
        
        losCaballos[0].setTiempo(0);
        losCaballos[1].setTiempo(0);
        losCaballos[2].setTiempo(0);
        losCaballos[3].setTiempo(0);
        losCaballos[4].setTiempo(0);
        losCaballos[5].setTiempo(0);
        losCaballos[6].setTiempo(0);
        losCaballos[7].setTiempo(0);
        losCaballos[8].setTiempo(0);
        losCaballos[9].setTiempo(0);
        losCaballos[10].setTiempo(0);
        losCaballos[11].setTiempo(0);
        
      //Posem les velocitats y els temps davançada
        reiniciar();
        
    }//
     
    public static void iniciar(){
    	
        HorseThreadC h1= new HorseThreadC(losCaballos[0].getNombre());
        h1.start();
        
        HorseThreadC h2= new HorseThreadC(losCaballos[1].getNombre());
        h2.start();
        
        HorseThreadC h3= new HorseThreadC(losCaballos[2].getNombre());
        h3.start();
        
        HorseThreadC h4= new HorseThreadC(losCaballos[3].getNombre());
        h4.start();
        
        HorseThreadC h5= new HorseThreadC(losCaballos[4].getNombre());
        h5.start();
        
        HorseThreadC h6= new HorseThreadC(losCaballos[5].getNombre());
        h6.start();
       
        HorseThreadC h7= new HorseThreadC(losCaballos[6].getNombre());
        h7.start();
        
        HorseThreadC h8= new HorseThreadC(losCaballos[7].getNombre());
        h8.start();
        
        HorseThreadC h9= new HorseThreadC(losCaballos[8].getNombre());
        h9.start();
        
        HorseThreadC h10= new HorseThreadC(losCaballos[9].getNombre());
        h10.start();
        
        HorseThreadC h11= new HorseThreadC(losCaballos[10].getNombre());
        h11.start();
        
        HorseThreadC h12= new HorseThreadC(losCaballos[11].getNombre());
        h12.start();
        
    }//iniciar           
 
	public static void winner(int quin){
    	Thread win = new Thread(new Runnable(){
            public void run(){
            	JOptionPane.showMessageDialog(null, "You won !", "LsCavalls", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    	
    	Thread lose = new Thread(new Runnable(){
            public void run(){
            	JOptionPane.showMessageDialog(null, "You lose !", "LsCavalls", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    	String userHorse = ControllerC.getHorseName();
    	if(((userHorse.equals("Horse 1"))|| (userHorse.equals("Horse1")) || (userHorse.equals("horse 1")) || (userHorse.equals("horse1"))) && ((quin == 1) && (ready == true))){
    		int y = Integer.parseInt(ControllerC.getMoneyBet()) + Integer.parseInt(ControllerC.getMoneyTotal());	
    		ControllerC.setMoney(String.valueOf(y));
    		win.start();
    	}else{
    		if(((userHorse.equals("Horse 1"))|| (userHorse.equals("Horse1")) || (userHorse.equals("horse 1")) || (userHorse.equals("horse1")))&& (ready == true)){
	    		int y =  Integer.parseInt(ControllerC.getMoneyTotal()) - Integer.parseInt(ControllerC.getMoneyBet());	
	    		ControllerC.setMoney(String.valueOf(y));
	    		lose.start();
    		}
    	}
    	
    	if(((userHorse.equals("Horse 2"))|| (userHorse.equals("Horse2")) || (userHorse.equals("horse 2")) || (userHorse.equals("horse2"))) && ((quin == 2) && (ready == true))){
    		int y = Integer.parseInt(ControllerC.getMoneyBet()) + Integer.parseInt(ControllerC.getMoneyTotal());	
    		ControllerC.setMoney(String.valueOf(y));
    		win.start();
    	}else{
    		if(((userHorse.equals("Horse 2"))|| (userHorse.equals("Horse2")) || (userHorse.equals("horse 2")) || (userHorse.equals("horse2")))&& (ready == true)){
	    		int y =  Integer.parseInt(ControllerC.getMoneyTotal()) - Integer.parseInt(ControllerC.getMoneyBet());	
	    		ControllerC.setMoney(String.valueOf(y));
	    		lose.start();
    		}
    	}
    	
    	if(((userHorse.equals("Horse 3"))|| (userHorse.equals("Horse3")) || (userHorse.equals("horse 3")) || (userHorse.equals("horse3"))) && ((quin == 3) && (ready == true))){
    		int y = Integer.parseInt(ControllerC.getMoneyBet()) + Integer.parseInt(ControllerC.getMoneyTotal());	
    		ControllerC.setMoney(String.valueOf(y));
    		win.start();
    	}else{
    		if(((userHorse.equals("Horse 3"))|| (userHorse.equals("Horse3")) || (userHorse.equals("horse 3")) || (userHorse.equals("horse3")))&& (ready == true)){
	    		int y =  Integer.parseInt(ControllerC.getMoneyTotal()) - Integer.parseInt(ControllerC.getMoneyBet());	
	    		ControllerC.setMoney(String.valueOf(y));
	    		lose.start();
    		}
    	}
    	
    	if(((userHorse.equals("Horse 4"))|| (userHorse.equals("Horse4")) || (userHorse.equals("horse 4")) || (userHorse.equals("horse4"))) && ((quin == 4) && (ready == true))){
    		int y = Integer.parseInt(ControllerC.getMoneyBet()) + Integer.parseInt(ControllerC.getMoneyTotal());	
    		ControllerC.setMoney(String.valueOf(y));
    		win.start();
    	}else{
    		if(((userHorse.equals("Horse 4"))|| (userHorse.equals("Horse4")) || (userHorse.equals("horse 4")) || (userHorse.equals("horse4")))&& (ready == true)){
	    		int y =  Integer.parseInt(ControllerC.getMoneyTotal()) - Integer.parseInt(ControllerC.getMoneyBet());	
	    		ControllerC.setMoney(String.valueOf(y));
	    		lose.start();
    		}
    	}
    	
    	if(((userHorse.equals("Horse 5"))|| (userHorse.equals("Horse5")) || (userHorse.equals("horse 5")) || (userHorse.equals("horse5"))) && ((quin == 5) && (ready == true))){
    		int y = Integer.parseInt(ControllerC.getMoneyBet()) + Integer.parseInt(ControllerC.getMoneyTotal());	
    		ControllerC.setMoney(String.valueOf(y));
    		win.start();
    	}else{
    		if(((userHorse.equals("Horse 5"))|| (userHorse.equals("Horse5")) || (userHorse.equals("horse 5")) || (userHorse.equals("horse5")))&& (ready == true)){
	    		int y =  Integer.parseInt(ControllerC.getMoneyTotal()) - Integer.parseInt(ControllerC.getMoneyBet());	
	    		ControllerC.setMoney(String.valueOf(y));
	    		lose.start();
    		}
    	}
    	
    	if(((userHorse.equals("Horse 6"))|| (userHorse.equals("Horse6")) || (userHorse.equals("horse 6")) || (userHorse.equals("horse6"))) && ((quin == 6) && (ready == true))){
    		int y = Integer.parseInt(ControllerC.getMoneyBet()) + Integer.parseInt(ControllerC.getMoneyTotal());	
    		ControllerC.setMoney(String.valueOf(y));
    		win.start();
    	}else{
    		if(((userHorse.equals("Horse 6"))|| (userHorse.equals("Horse6")) || (userHorse.equals("horse 6")) || (userHorse.equals("horse6")))&& (ready == true)){
	    		int y =  Integer.parseInt(ControllerC.getMoneyTotal()) - Integer.parseInt(ControllerC.getMoneyBet());	
	    		ControllerC.setMoney(String.valueOf(y));
	    		lose.start();
    		}
    	}
    	
    	if(((userHorse.equals("Horse 7"))|| (userHorse.equals("Horse7")) || (userHorse.equals("horse 7")) || (userHorse.equals("horse7"))) && ((quin == 7) && (ready == true))){
    		int y = Integer.parseInt(ControllerC.getMoneyBet()) + Integer.parseInt(ControllerC.getMoneyTotal());	
    		ControllerC.setMoney(String.valueOf(y));
    		win.start();
    	}else{
    		if(((userHorse.equals("Horse 7"))|| (userHorse.equals("Horse7")) || (userHorse.equals("horse 7")) || (userHorse.equals("horse7")))&& (ready == true)){
	    		int y =  Integer.parseInt(ControllerC.getMoneyTotal()) - Integer.parseInt(ControllerC.getMoneyBet());	
	    		ControllerC.setMoney(String.valueOf(y));
	    		lose.start();
    		}
    	}
    	
    	if(((userHorse.equals("Horse 8"))|| (userHorse.equals("Horse8")) || (userHorse.equals("horse 8")) || (userHorse.equals("horse8"))) && ((quin == 8) && (ready == true))){
    		int y = Integer.parseInt(ControllerC.getMoneyBet()) + Integer.parseInt(ControllerC.getMoneyTotal());	
    		ControllerC.setMoney(String.valueOf(y));
    		win.start();
    	}else{
    		if(((userHorse.equals("Horse 8"))|| (userHorse.equals("Horse8")) || (userHorse.equals("horse 8")) || (userHorse.equals("horse8")))&& (ready == true)){
	    		int y =  Integer.parseInt(ControllerC.getMoneyTotal()) - Integer.parseInt(ControllerC.getMoneyBet());	
	    		ControllerC.setMoney(String.valueOf(y));
	    		lose.start();
    		}
    	}
    	
    	if(((userHorse.equals("Horse 9"))|| (userHorse.equals("Horse9")) || (userHorse.equals("horse 9")) || (userHorse.equals("horse9"))) && ((quin == 9) && (ready == true))){
    		int y = Integer.parseInt(ControllerC.getMoneyBet()) + Integer.parseInt(ControllerC.getMoneyTotal());	
    		ControllerC.setMoney(String.valueOf(y));
    		JOptionPane.showMessageDialog(null, "You won !", "LsCavalls", JOptionPane.INFORMATION_MESSAGE);
    	}else{
    		if(((userHorse.equals("Horse 9"))|| (userHorse.equals("Horse9")) || (userHorse.equals("horse 9")) || (userHorse.equals("horse9")))&& (ready == true)){
	    		int y =  Integer.parseInt(ControllerC.getMoneyTotal()) - Integer.parseInt(ControllerC.getMoneyBet());	
	    		ControllerC.setMoney(String.valueOf(y));
	    		lose.start();
    		}
    	}
    	
    	if(((userHorse.equals("Horse 10"))|| (userHorse.equals("Horse10")) || (userHorse.equals("horse 10")) || (userHorse.equals("horse10"))) && ((quin == 10) && (ready == true))){
    		int y = Integer.parseInt(ControllerC.getMoneyBet()) + Integer.parseInt(ControllerC.getMoneyTotal());	
    		ControllerC.setMoney(String.valueOf(y));
    		win.start();
    	}else{
    		if(((userHorse.equals("Horse 10"))|| (userHorse.equals("Horse10")) || (userHorse.equals("horse 10")) || (userHorse.equals("horse10")))&& (ready == true)){
	    		int y =  Integer.parseInt(ControllerC.getMoneyTotal()) - Integer.parseInt(ControllerC.getMoneyBet());	
	    		ControllerC.setMoney(String.valueOf(y));
	    		lose.start();
    		}
    	}
    	
    	if(((userHorse.equals("Horse 11"))|| (userHorse.equals("Horse11")) || (userHorse.equals("horse 11")) || (userHorse.equals("horse11"))) && ((quin == 11) && (ready == true))){
    		int y = Integer.parseInt(ControllerC.getMoneyBet()) + Integer.parseInt(ControllerC.getMoneyTotal());	
    		ControllerC.setMoney(String.valueOf(y));
    		win.start();
    	}else{
    		if(((userHorse.equals("Horse 11"))|| (userHorse.equals("Horse11")) || (userHorse.equals("horse 11")) || (userHorse.equals("horse11")))&& (ready == true)){
	    		int y =  Integer.parseInt(ControllerC.getMoneyTotal()) - Integer.parseInt(ControllerC.getMoneyBet());	
	    		ControllerC.setMoney(String.valueOf(y));
	    		lose.start();
    		}
    	}
    	
    	if(((userHorse.equals("Horse 12"))|| (userHorse.equals("Horse12")) || (userHorse.equals("horse 12")) || (userHorse.equals("horse12"))) && ((quin == 12) && (ready == true))){
    		int y = Integer.parseInt(ControllerC.getMoneyBet()) + Integer.parseInt(ControllerC.getMoneyTotal());	
    		ControllerC.setMoney(String.valueOf(y));
    		win.start();
    	}else{
    		if(((userHorse.equals("Horse 12"))|| (userHorse.equals("Horse12")) || (userHorse.equals("horse 12")) || (userHorse.equals("horse12")))&& (ready == true)){
	    		int y =  Integer.parseInt(ControllerC.getMoneyTotal()) - Integer.parseInt(ControllerC.getMoneyBet());	
	    		ControllerC.setMoney(String.valueOf(y));
	    		lose.start();
    		}
    	}
    	
      	ready = false;
   }
   
    public static void bet(String Money, String horse){
		String t;
		int intMoney = Integer.parseInt(Money);
		t = horse + " Money: " + intMoney + "\n";
		ControllerC.setApostes(t);
		EnviaCaballC ec = new EnviaCaballC(intMoney, horse); //username not horse1	
		ready = true;
	}
    
    public static CaballoC getLosCaballos(int pos) {
		return losCaballos[pos];
	}
    
}//class
