package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;









import Model.TimeCounterThread;
import Model.inicia;
import Vista.Finestra;


public class ListenerBotons implements ActionListener {
	
	private Finestra vista;
	private inicia model;
	private boolean flag = false;
	private int f = 0;
	
	 
	public ListenerBotons(Finestra vista, inicia model) {
		
		this.vista = vista;
		this.model = model;
		vista.Actualitzamoney(model.getBalance());
	}
		
	public void actionPerformed(ActionEvent event) {
		
		if (model.isRunning()){
		if(event.getActionCommand().equals("ficha5")){f = 0;vista.moveAposta(5);}
		if(event.getActionCommand().equals("ficha10")){f = 5;vista.moveAposta(10);}
		if(event.getActionCommand().equals("ficha15")){f = 10;vista.moveAposta(15);}
		if(event.getActionCommand().equals("ficha20")){f = 15;vista.moveAposta(20);}	
		
		
			for(int i = 0; i<38; i++){
				String b = Integer.toString(i);	
				if(event.getActionCommand().equals(b)){		
					if(flag == false){
					if(model.getBalance()>=5+f){
				vista.addAposta(i, 5+f);
				model.Apostar(5 + f,0,i,0);
				vista.Actualitzamoney(model.getBalance());
					}
					else{
						vista.NoMoney();
					}
					}else{ vista.notime();}
				}
			}		
			
		if(event.getActionCommand().equals("doc1")){if(flag == false){if(model.getBalance()>=5+f){vista.addAposta(40,5+f);model.Apostar(5+f,1,0,1);vista.Actualitzamoney(model.getBalance());}else{vista.NoMoney();}}else{vista.notime();}}
		if(event.getActionCommand().equals("doc2")){if(flag == false){if(model.getBalance()>=5+f){vista.addAposta(41,5+f);model.Apostar(5+f,1,0,2);vista.Actualitzamoney(model.getBalance());}else{vista.NoMoney();}}else{vista.notime();}}
		if(event.getActionCommand().equals("doc3")){if(flag == false){if(model.getBalance()>=5+f){vista.addAposta(42,5+f);model.Apostar(5+f,1,0,3);vista.Actualitzamoney(model.getBalance());}else{vista.NoMoney();}}else{vista.notime();}}
		if(event.getActionCommand().equals("pasa")){if(flag == false){if(model.getBalance()>=5+f){vista.addAposta(43,5+f);model.Apostar(5+f,3,0,0);vista.Actualitzamoney(model.getBalance());}else{vista.NoMoney();}}else{vista.notime();}}
		if(event.getActionCommand().equals("manca")){if(flag == false){if(model.getBalance()>=5+f){vista.addAposta(44,5+f);model.Apostar(5+f,2,0,0);vista.Actualitzamoney(model.getBalance());}else{vista.NoMoney();}}else{vista.notime();}}
		if(event.getActionCommand().equals("rojo")){if(flag == false){if(model.getBalance()>=5+f){vista.addAposta(45,5+f);model.Apostar(5+f,5,0,0);vista.Actualitzamoney(model.getBalance());}else{vista.NoMoney();}}else{vista.notime();}}
		if(event.getActionCommand().equals("negro")){if(flag == false){if(model.getBalance()>=5+f){vista.addAposta(46,5+f);model.Apostar(5+f,4,0,0);vista.Actualitzamoney(model.getBalance());}else{vista.NoMoney();}}else{vista.notime();}}
		if(event.getActionCommand().equals("par")){if(flag == false){if(model.getBalance()>=5+f){vista.addAposta(47,5+f);model.Apostar(5+f,6,0,0);vista.Actualitzamoney(model.getBalance());}else{vista.NoMoney();}}else{vista.notime();}}
		if(event.getActionCommand().equals("impar")){if(flag == false){if(model.getBalance()>=5+f){vista.addAposta(48,5+f);model.Apostar(5+f,7,0,0);vista.Actualitzamoney(model.getBalance());}else{vista.NoMoney();}}else{vista.notime();}}
			
			
		
		
	}
		if(event.getActionCommand().equals("tirabola")){
			
				
			
				int a = model.TiraBola();
				int b = model.Winner();
				vista.gifbola(a);
				vista.muestraganancia(b);
				vista.Actualitzamoney(model.getBalance());
				
				
				
			}
			
		}
	public void mostrasecs(int secs){
		vista.mostratemps(secs);
		if(secs == 0){flag = true;System.out.println(flag);}
		else{
			if(secs == 9){flag = false;}
		}
	}
	
}