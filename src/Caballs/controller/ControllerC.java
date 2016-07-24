package controller;

import view.VistaC;

public class ControllerC {
	
	public static void iniciar(){
		 LogicaC.iniciar();
	}
	
	public static void setup(){
    	LogicaC.registrarCaballos();
    	VistaC.getLblCaballo1().setText(LogicaC.getLosCaballos(0).getNombre());
        VistaC.getLblCaballo2().setText(LogicaC.getLosCaballos(1).getNombre());
        VistaC.getLblCaballo3().setText(LogicaC.getLosCaballos(2).getNombre());
        VistaC.getLblCaballo4().setText(LogicaC.getLosCaballos(3).getNombre());
        VistaC.getLblCaballo5().setText(LogicaC.getLosCaballos(4).getNombre());
        VistaC.getLblCaballo6().setText(LogicaC.getLosCaballos(5).getNombre());
        VistaC.getLblCaballo7().setText(LogicaC.getLosCaballos(6).getNombre());
        VistaC.getLblCaballo8().setText(LogicaC.getLosCaballos(7).getNombre());
        VistaC.getLblCaballo9().setText(LogicaC.getLosCaballos(8).getNombre());
        VistaC.getLblCaballo10().setText(LogicaC.getLosCaballos(9).getNombre());
        VistaC.getLblCaballo11().setText(LogicaC.getLosCaballos(10).getNombre());
        VistaC.getLblCaballo12().setText(LogicaC.getLosCaballos(11).getNombre());
        LogicaC.reiniciar();
        LogicaC.iniciar();
	}
	
	public static void bet(String Money, String horse){
		LogicaC.bet(Money, horse);
	}
	
	public static String getHorseName(){
		 return VistaC.getTfHname().getText();
	}
	
	public static void setWinnerName(String name){
		VistaC.setWinnerName(name);
	}
	
	public static String getMoneyBet(){
		return VistaC.getTfMoney().getText();
	}
	
	public static String getMoneyTotal(){
		return VistaC.getLblMoney1().getText();
	}
	
	public static void setMoney(String string){
		VistaC.setMoney(string);
	}
	
	public static void setApostes(String t){
		VistaC.setApostes(t);
	}
	
	public static void setlocation(int caballo, int x, int y){
		switch(caballo){
		case 1: 
			VistaC.getLblCaballo1().setLocation(x, y);
			break;
		case 2:
			VistaC.getLblCaballo2().setLocation(x, y);
			break;
		case 3:
			VistaC.getLblCaballo3().setLocation(x, y);
			break;
		case 4:
			VistaC.getLblCaballo4().setLocation(x, y);
			break;
		case 5:
			VistaC.getLblCaballo5().setLocation(x, y);
			break;
		case 6:
			VistaC.getLblCaballo6().setLocation(x, y);
			break;
		case 7:
			VistaC.getLblCaballo7().setLocation(x, y);
			break;
		case 8:
			VistaC.getLblCaballo8().setLocation(x, y);
			break;
		case 9:
			VistaC.getLblCaballo9().setLocation(x, y);
			break;
		case 10:
			VistaC.getLblCaballo10().setLocation(x, y);
			break;
		case 11:
			VistaC.getLblCaballo11().setLocation(x, y);
			break;
		case 12:
			VistaC.getLblCaballo12().setLocation(x, y);
			break;
		}
	}
	
	public static int getLocationX(int caballo){
		int result = 0;
		switch(caballo){
		case 1: 
			result = VistaC.getLblCaballo1().getLocation().x;
			break;
		case 2:
			result = VistaC.getLblCaballo2().getLocation().x;
			break;
		case 3:
			result = VistaC.getLblCaballo3().getLocation().x;
			break;
		case 4:
			result = VistaC.getLblCaballo4().getLocation().x;
			break;
		case 5:
			result = VistaC.getLblCaballo5().getLocation().x;
			break;
		case 6:
			result = VistaC.getLblCaballo6().getLocation().x;
			break;
		case 7:
			result = VistaC.getLblCaballo7().getLocation().x;
			break;
		case 8:
			result = VistaC.getLblCaballo8().getLocation().x;
			break;
		case 9:
			result = VistaC.getLblCaballo9().getLocation().x;
			break;
		case 10:
			result = VistaC.getLblCaballo10().getLocation().x;
			break;
		case 11:
			result = VistaC.getLblCaballo11().getLocation().x;
			break;
		case 12:
			result = VistaC.getLblCaballo12().getLocation().x;
			break;
		}
		return result;
	}
		
	public static int getLocationY(int caballo){
		int result = 0;
		switch(caballo){
		case 1: 
			result = VistaC.getLblCaballo1().getLocation().y;
			break;
		case 2:
			result = VistaC.getLblCaballo2().getLocation().y;
			break;
		case 3:
			result = VistaC.getLblCaballo3().getLocation().y;
			break;
		case 4:
			result = VistaC.getLblCaballo4().getLocation().y;
			break;
		case 5:
			result = VistaC.getLblCaballo5().getLocation().y;
			break;
		case 6:
			result = VistaC.getLblCaballo6().getLocation().y;
			break;
		case 7:
			result = VistaC.getLblCaballo7().getLocation().y;
			break;
		case 8:
			result = VistaC.getLblCaballo8().getLocation().y;
			break;
		case 9:
			result = VistaC.getLblCaballo9().getLocation().y;
			break;
		case 10:
			result = VistaC.getLblCaballo10().getLocation().y;
			break;
		case 11:
			result = VistaC.getLblCaballo11().getLocation().y;
			break;
		case 12:
			result = VistaC.getLblCaballo12().getLocation().y;
			break;
		}
		return result;
		
	}
	
	public static int getLinea(){
		return VistaC.getLblLinea().getLocation().x;
	}
	
	public static void setButtonsActive(){
		VistaC.setButtonsActive();
	}
	
	public static void serButtonsDisabled(){
		VistaC.setButtonsDisabled();
	}
}

