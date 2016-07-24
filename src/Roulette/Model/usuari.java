package Model;
import java.util.Scanner;


public class usuari {
	private int diners;
	private aposta a;
	
	public usuari(){
		this.diners = 100;
		a = new aposta();
	}

	public int getDiners() {
		return diners;
	}

	public void setDiners(int diners) {
		this.diners = diners;
	}
	public void apostar(int num, int cas, int casell, int doc){
		if(num <= diners){
			diners  = diners - num;
		
			switch(cas){
				case 0:
					a.setNum(casell, num);
					break;
				case 1:
					a.setDotzena(doc, num);
					break;
				case 2:				
					a.setManca(num);
					break;
				case 3:
					a.setPassa(num);
					break;
				case  4:
					a.setNegre(num);
					break;
				case 5:
					a.setVermell(num);
					break;
				case 6:
					a.setParell(num);
					break;
				case 7:
					a.setSenar(num);
					break;
			}
		}
		
		
	}
	public int recupera(casella c){
		int num = 0;
		num = num + 36*a.getNum(c.getNumero());
		if (c.getNumero()!= 0){
			num = num + 3*a.getDotzena(c.getDotzena());
		
			if ( c.isManca()){
				num = num + 2*a.getManca();
			}
			else{
				num = num + 2*a.getPassa();
			}
			if (c.isNegre()){
				num = num + 2*a.getNegre();
			}
			else{
				num = num + 2*a.getVermell();
			}
			if (c.isParell()){
				num = num + 2*a.getParell();
			}
			if (!c.isParell()){
					
				num= num + 2*a.getSenar();
			}	
		}
		diners = diners + num;
		a.reseteja();
		return num;
	}
}
