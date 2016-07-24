package Vista;



import Model.casella;
import Model.usuari;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import Controlador.ListenerBotons;



public class Finestra extends JFrame {
	
		
	
	private JButton imatge1;private JButton imatge2;private JLabel lcero;
	private JButton imatge3;private JButton imatge4;private JLabel luno;
	private JButton imatge5;private JButton imatge6;private JLabel ldos;
	private JButton imatge7;private JButton imatge8;private JLabel ltres;
	private JButton imatge9;private JButton imatge10;private JLabel lcuatro;
	private JButton imatge11;private JButton imatge12;private JLabel lcinco;
	private JButton imatge13;private JButton imatge14;private JLabel lseis;
	private JButton imatge15;private JButton imatge16;private JLabel lsiete;
	private JButton imatge17;private JButton imatge18;private JLabel locho;
	private JButton imatge19;private JButton imatge20;private JLabel lnueve;
	private JButton imatge21;private JButton imatge22;private JLabel ganancia;
	private JButton imatge23;private JButton imatge24;private JLabel temps;
	private JButton imatge25;private JButton imatge26;private JLabel up;
	private JButton imatge27;private JButton imatge28;private JLabel down;
	private JButton imatge29;private JButton imatge30;private JLabel left;
	private JButton imatge31;private JButton imatge32;private JLabel right;
	private JButton imatge33;private JButton imatge34;private JLabel nobets;
	private JButton imatge35;private JButton imatge36;
	private JButton docena1;private JButton docena2;
	private JButton docena3;private JButton falta;
	private JButton par;private JButton impar;
	private JButton pasa;private JButton red;
	private JButton black;private JButton cero;
	private JPanel jpTaulell;private JTextArea jtaApostes; private JTextArea jtaOthers;
	private JLabel numerito; private JScrollPane scrollA; JScrollPane scrollB;
	private JLabel passa; private JLabel senyal;
	private JLabel parr;private JButton ficha5;
	private JLabel dotzzena;private JButton ficha10;
	private static JButton tirabola; private JButton ficha15;
	private JLabel gifrulet;private JButton ficha20;
	private JLabel balance;private String cadAposta = "";
	private int money = 0;
	private int x;
	private int[] recorregut;

	public Finestra() {
		
		recorregut = new int[11];
		for(int e=0;e<11;e++){recorregut[e]=-1;}
		
		jpTaulell = new ImgFons();
		//jpTaulell = new JPanel();
		jpTaulell.setLayout(null);
		
		
		ImageIcon ruletgif = new ImageIcon ("ruletagif.gif");
		gifrulet = new JLabel (ruletgif);
		jpTaulell.add(gifrulet);
		
		ImageIcon img1 = new ImageIcon ("1.png"); imatge1 = new JButton (img1);		
		ImageIcon img2 = new ImageIcon ("2.png"); imatge2 = new JButton (img2);		
		ImageIcon img3 = new ImageIcon ("3.png"); imatge3 = new JButton (img3);		
		ImageIcon img4 = new ImageIcon ("4.png"); imatge4 = new JButton (img4);		
		ImageIcon img5 = new ImageIcon ("5.png"); imatge5 = new JButton (img5);		
		ImageIcon img6 = new ImageIcon ("6.png"); imatge6 = new JButton (img6);		
		ImageIcon img7 = new ImageIcon ("7.png"); imatge7 = new JButton (img7);		
		ImageIcon img8 = new ImageIcon ("8.png"); imatge8 = new JButton(img8);
		ImageIcon img9 = new ImageIcon ("9.png"); imatge9 = new JButton (img9);
		ImageIcon img10 = new ImageIcon ("10.png"); imatge10 = new JButton (img10);
		ImageIcon img11 = new ImageIcon ("11.png"); imatge11 = new JButton (img11);
		ImageIcon img12 = new ImageIcon ("12.png"); imatge12 = new JButton (img12);
		ImageIcon img13 = new ImageIcon ("13.png"); imatge13 = new JButton (img13);
		ImageIcon img14 = new ImageIcon ("14.png"); imatge14 = new JButton (img14);
		ImageIcon img15 = new ImageIcon ("15.png"); imatge15 = new JButton (img15);
		ImageIcon img16 = new ImageIcon ("16.png"); imatge16 = new JButton (img16);
		ImageIcon img17 = new ImageIcon ("17.png"); imatge17 = new JButton (img17);
		ImageIcon img18 = new ImageIcon ("18.png"); imatge18 = new JButton (img18);
		ImageIcon img19 = new ImageIcon ("19.png"); imatge19 = new JButton (img19);
		ImageIcon img20 = new ImageIcon ("20.png"); imatge20 = new JButton (img20);
		ImageIcon img21 = new ImageIcon ("21.png"); imatge21 = new JButton (img21);
		ImageIcon img22 = new ImageIcon ("22.png"); imatge22 = new JButton (img22);
		ImageIcon img23 = new ImageIcon ("23.png"); imatge23 = new JButton (img23);
		ImageIcon img24 = new ImageIcon ("24.png"); imatge24 = new JButton (img24);
		ImageIcon img25 = new ImageIcon ("25.png"); imatge25 = new JButton (img25);
		ImageIcon img26 = new ImageIcon ("26.png"); imatge26 = new JButton (img26);
		ImageIcon img27 = new ImageIcon ("27.png"); imatge27 = new JButton (img27);
		ImageIcon img28 = new ImageIcon ("28.png"); imatge28 = new JButton (img28);
		ImageIcon img29 = new ImageIcon ("29.png"); imatge29 = new JButton (img29);
		ImageIcon img30 = new ImageIcon ("30.png"); imatge30 = new JButton (img30);
		ImageIcon img31 = new ImageIcon ("31.png"); imatge31 = new JButton (img31);
		ImageIcon img32 = new ImageIcon ("32.png"); imatge32 = new JButton (img32);
		ImageIcon img33 = new ImageIcon ("33.png"); imatge33 = new JButton (img33);
		ImageIcon img34 = new ImageIcon ("34.png"); imatge34 = new JButton (img34);
		ImageIcon img35 = new ImageIcon ("35.png"); imatge35 = new JButton (img35);
		ImageIcon img36 = new ImageIcon ("36.png"); imatge36 = new JButton (img36);	
		
		ImageIcon img1st12 = new ImageIcon ("1st12.png");  docena1 = new JButton (img1st12);
		ImageIcon img2nd12 = new ImageIcon ("2nd12.png");  docena2 = new JButton(img2nd12);
		ImageIcon img3rd12 = new ImageIcon ("3rd12.png");  docena3 = new JButton (img3rd12);
		ImageIcon p18 = new ImageIcon ("1-18.png");  falta = new JButton (p18);
		ImageIcon even = new ImageIcon ("evenn.png");  par = new JButton (even);
		ImageIcon odd = new ImageIcon ("odd.png");   impar = new JButton (odd);
		ImageIcon p36 = new ImageIcon ("19-36.png");  pasa = new JButton (p36);
		ImageIcon negro = new ImageIcon ("black.png");  black = new JButton (negro);
		ImageIcon rojo = new ImageIcon ("red.png");  red = new JButton (rojo);	
		ImageIcon zero = new ImageIcon ("0.png");  cero = new JButton (zero);		
		
		imatge1.setBounds(88,210,65,81);imatge2.setBounds(88, 127,65,81);imatge3.setBounds(88, 44,65,81);imatge4.setBounds(156, 210,65,81);
		imatge5.setBounds(156, 127,65,81);imatge6.setBounds(156, 44,65,81);imatge7.setBounds(224, 210,65,81);imatge8.setBounds(224, 127,65,81);
		imatge9.setBounds(224, 44,65,81);imatge10.setBounds(292, 210,65,81);imatge11.setBounds(292, 127,65,81);imatge12.setBounds(292, 44,65,81);
		imatge13.setBounds(360, 210,65,81);imatge14.setBounds(360, 127,65,81);imatge15.setBounds(360, 44,65,81);imatge16.setBounds(428, 210,65,81);
		imatge17.setBounds(428, 127,65,81);imatge18.setBounds(428, 44,65,81);imatge19.setBounds(496, 210,65,81);imatge20.setBounds(496, 127,65,81);
		imatge21.setBounds(496, 44,65,81);imatge22.setBounds(564, 210,65,81);imatge23.setBounds(564, 127,65,81);imatge24.setBounds(564, 44,65,81);
		imatge25.setBounds(632, 210,65,81);imatge26.setBounds(632, 127,65,81);imatge27.setBounds(632, 44,65,81);imatge28.setBounds(700, 210,65,81);
		imatge29.setBounds(700, 127,65,81);imatge30.setBounds(700, 44,65,81);imatge31.setBounds(768, 210,65,81);imatge32.setBounds(768, 127,65,81);
		imatge33.setBounds(768, 44,65,81);imatge34.setBounds(836, 210,65,81);imatge35.setBounds(836, 127,65,81);imatge36.setBounds(836, 44,65,81);
		
		docena1.setBounds(88,290,269,52);
		docena2.setBounds(360,290,269,52);
		docena3.setBounds(632,290,269,52);
		falta.setBounds(88,343,133,51);
		par.setBounds(224,343,133,51);
		impar.setBounds(632,343,133,51);
		pasa.setBounds(768,343,133,51);
		red.setBounds(360,343,133,51);
		black.setBounds(496,343,133,51);
		cero.setBounds(-5,42,91,250);
		
		
		lcero = new JLabel();lcero.setFont(new java.awt.Font("Courier", Font.BOLD,18));lcero.setForeground(Color.WHITE);lcero.setBackground(Color.WHITE);
		lcero.setOpaque(true);jpTaulell.add(lcero);	
		luno = new JLabel();luno.setFont(new java.awt.Font("Courier", Font.BOLD,18));luno.setForeground(Color.WHITE);luno.setBackground(Color.WHITE);
		luno.setOpaque(true);jpTaulell.add(luno);	
		ldos = new JLabel();ldos.setFont(new java.awt.Font("Courier", Font.BOLD,18));ldos.setForeground(Color.WHITE);ldos.setBackground(Color.WHITE);
		ldos.setOpaque(true);jpTaulell.add(ldos);	
		ltres = new JLabel();ltres.setFont(new java.awt.Font("Courier", Font.BOLD,18));ltres.setForeground(Color.WHITE);ltres.setBackground(Color.WHITE);
		ltres.setOpaque(true);jpTaulell.add(ltres);	
		lcuatro = new JLabel();lcuatro.setFont(new java.awt.Font("Courier", Font.BOLD,18));lcuatro.setForeground(Color.WHITE);lcuatro.setBackground(Color.WHITE);
		lcuatro.setOpaque(true);jpTaulell.add(lcuatro);	
		lcinco = new JLabel();lcinco.setFont(new java.awt.Font("Courier", Font.BOLD,18));lcinco.setForeground(Color.WHITE);lcinco.setBackground(Color.WHITE);
		lcinco.setOpaque(true);jpTaulell.add(lcinco);
		lseis = new JLabel();lseis.setFont(new java.awt.Font("Courier", Font.BOLD,18));lseis.setForeground(Color.WHITE);lseis.setBackground(Color.WHITE);
		lseis.setOpaque(true);jpTaulell.add(lseis);	
		lsiete = new JLabel();lsiete.setFont(new java.awt.Font("Courier", Font.BOLD,18));lsiete.setForeground(Color.WHITE);lsiete.setBackground(Color.WHITE);
		lsiete.setOpaque(true);jpTaulell.add(lsiete);	
		locho = new JLabel();locho.setFont(new java.awt.Font("Courier", Font.BOLD,18));locho.setForeground(Color.WHITE);locho.setBackground(Color.WHITE);
		locho.setOpaque(true);jpTaulell.add(locho);	
		lnueve = new JLabel();lnueve.setFont(new java.awt.Font("Courier", Font.BOLD,18));lnueve.setForeground(Color.WHITE);lnueve.setBackground(Color.WHITE);
		lnueve.setOpaque(true);jpTaulell.add(lnueve);	
		
		jtaApostes = new JTextArea();
		jtaApostes.setEditable(false);
		jtaApostes.setBorder(BorderFactory.createLineBorder(Color.BLACK));	
		scrollA = new JScrollPane(jtaApostes);
		scrollA.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollA.setBounds(90, 460, 400, 200);
		jpTaulell.add(scrollA);
		
		jtaOthers = new JTextArea();
		jtaOthers.setEditable(false);
		jtaOthers.setBorder(BorderFactory.createLineBorder(Color.BLACK));	
		scrollB = new JScrollPane(jtaOthers);
		scrollB.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollB.setBounds(495, 460, 400, 200);
		jpTaulell.add(scrollB);
		
		tirabola = new JButton();
		tirabola.setBounds(10,350,50,50);
	
		
		ImageIcon fitxa5 = new ImageIcon ("ficha.png"); 
		ficha5 = new JButton (fitxa5);
		ficha5.setBounds(1000,380,40,40);
		jpTaulell.add(ficha5);
		ImageIcon fitxa10 = new ImageIcon ("ficha10.png"); 
		ficha10 = new JButton (fitxa10);
		ficha10.setBounds(1050,380,40,40);
		jpTaulell.add(ficha10);
		ImageIcon fitxa15 = new ImageIcon ("ficha15.png"); 
		ficha15 = new JButton (fitxa15);
		ficha15.setBounds(1100,380,40,40);
		jpTaulell.add(ficha15);
		ImageIcon fitxa20 = new ImageIcon ("ficha20.png"); 
		ficha20 = new JButton (fitxa20);
		ficha20.setBounds(1150,380,40,40);
		jpTaulell.add(ficha20);
		ImageIcon senyall = new ImageIcon ("senyal.png"); 
		senyal = new JLabel (senyall);
		senyal.setBounds(1000,420,40,40);
		jpTaulell.add(senyal);		
		
		
		jpTaulell.add(imatge1);
		jpTaulell.add(imatge2);
		jpTaulell.add(imatge3);
		jpTaulell.add(imatge4);
		jpTaulell.add(imatge5);
		jpTaulell.add(imatge6);
		jpTaulell.add(imatge7);
		jpTaulell.add(imatge8);
		jpTaulell.add(imatge9);
		jpTaulell.add(imatge10);
		jpTaulell.add(imatge11);
		jpTaulell.add(imatge12);
		jpTaulell.add(imatge13);
		jpTaulell.add(imatge14);
		jpTaulell.add(imatge15);
		jpTaulell.add(imatge16);
		jpTaulell.add(imatge17);
		jpTaulell.add(imatge18);
		jpTaulell.add(imatge19);
		jpTaulell.add(imatge20);
		jpTaulell.add(imatge21);
		jpTaulell.add(imatge22);
		jpTaulell.add(imatge23);
		jpTaulell.add(imatge24);
		jpTaulell.add(imatge25);
		jpTaulell.add(imatge26);
		jpTaulell.add(imatge27);
		jpTaulell.add(imatge28);
		jpTaulell.add(imatge29);
		jpTaulell.add(imatge30);
		jpTaulell.add(imatge31);
		jpTaulell.add(imatge32);
		jpTaulell.add(imatge33);
		jpTaulell.add(imatge34);
		jpTaulell.add(imatge35);
		jpTaulell.add(imatge36);
		
		jpTaulell.add(docena1);
		jpTaulell.add(docena2);
		jpTaulell.add(docena3);
		jpTaulell.add(falta);
		jpTaulell.add(par);
		jpTaulell.add(impar);
		jpTaulell.add(pasa);
		jpTaulell.add(red);
		jpTaulell.add(black);
		jpTaulell.add(cero);
		
		
		
		numerito = new JLabel ("");
		numerito.setBounds(1030,265,92,70);
		numerito.setFont(new java.awt.Font("Courier", Font.BOLD,70));
		numerito.setForeground(Color.WHITE);
		numerito.setBackground(Color.WHITE);
		numerito.setOpaque(true);		
		jpTaulell.add(numerito);		
		
		ganancia = new JLabel("");		
		ganancia.setFont(new java.awt.Font("Courier", Font.BOLD,25));
		jpTaulell.add(ganancia);	
		
		temps = new JLabel("");		
		temps.setFont(new java.awt.Font("Courier", Font.BOLD,85));
		temps.setBounds(1045,500,200,100);
		jpTaulell.add(temps);
		
		up = new JLabel();down = new JLabel();left = new JLabel();right = new JLabel();
		up.setBackground(Color.BLACK);down.setBackground(Color.BLACK);left.setBackground(Color.BLACK);right.setBackground(Color.BLACK);
		up.setOpaque(true);down.setOpaque(true);left.setOpaque(true);right.setOpaque(true);	
		left.setBounds(1040,512,6,80);right.setBounds(1150,512,6,84);down.setBounds(1040,590,110,6);up.setBounds(1040,512,110,6);
		jpTaulell.add(left);jpTaulell.add(right);jpTaulell.add(down);jpTaulell.add(up);
		
		JLabel barrera = new JLabel ("");
		barrera.setBackground(Color.BLACK);
		barrera.setOpaque(true);
		barrera.setBounds(901,0,10,1000);	
		jpTaulell.add(barrera);
		
		passa = new JLabel ("");
		passa.setBounds(1150,247,100,100);
		passa.setFont(new java.awt.Font("Courier", Font.BOLD,15));
		jpTaulell.add(passa);
		
		parr = new JLabel ("");
		parr.setBounds(1150,267,100,100);
		parr.setFont(new java.awt.Font("Courier", Font.BOLD,15));
		jpTaulell.add(parr);
		
		dotzzena = new JLabel ("");
		dotzzena.setBounds(1150,227,100,100);
		dotzzena.setFont(new java.awt.Font("Courier", Font.BOLD,15));
		jpTaulell.add(dotzzena);
		
		balance = new JLabel ("Balance:  " + money + " �");
		balance.setBounds(88,-30,500,100);
		balance.setFont(new java.awt.Font("Courier", Font.BOLD,25));
		jpTaulell.add(balance);	
		
		JLabel mybet = new JLabel ("Your bet: ");
		mybet.setBounds(88,390,500,100);
		mybet.setFont(new java.awt.Font("Courier", Font.BOLD,25));
		jpTaulell.add(mybet);	
		
		JLabel theirbet = new JLabel ("Guest's Bets: ");
		theirbet.setBounds(495,390,500,100);
		theirbet.setFont(new java.awt.Font("Courier", Font.BOLD,25));
		jpTaulell.add(theirbet);	
		
		nobets = new JLabel ("End of time, no more bets! ");
		nobets.setFont(new java.awt.Font("Courier", Font.BOLD,20));
		jpTaulell.add(nobets);	
		
		ImageIcon rulett = new ImageIcon ("rulett.png");
		JLabel rulet = new JLabel (rulett);
		rulet.setBounds(1000,55,185,185);
		jpTaulell.add(rulet);
		
		ImageIcon fonss = new ImageIcon ("fons.jpg");
		JLabel fons = new JLabel (fonss);
		fons.setBounds(-98, 0, 1000,1000);
		jpTaulell.add(fons);
		
		jpTaulell.setBackground(Color.WHITE);		
		getContentPane().add(jpTaulell);		
		
		
		
		setSize(1300,750);
		setTitle("Roulette");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	
	}
	
public void registreControladorBoto(ListenerBotons controlador){
	
	
	
		imatge1.addActionListener(controlador);imatge19.addActionListener(controlador);
		imatge2.addActionListener(controlador);imatge20.addActionListener(controlador);
		imatge3.addActionListener(controlador);imatge21.addActionListener(controlador);
		imatge4.addActionListener(controlador);imatge22.addActionListener(controlador);
		imatge5.addActionListener(controlador);imatge23.addActionListener(controlador);
		imatge6.addActionListener(controlador);imatge24.addActionListener(controlador);
		imatge7.addActionListener(controlador);imatge25.addActionListener(controlador);
		imatge8.addActionListener(controlador);imatge26.addActionListener(controlador);
		imatge9.addActionListener(controlador);imatge27.addActionListener(controlador);
		imatge10.addActionListener(controlador);imatge28.addActionListener(controlador);
		imatge11.addActionListener(controlador);imatge29.addActionListener(controlador);
		imatge12.addActionListener(controlador);imatge30.addActionListener(controlador);
		imatge13.addActionListener(controlador);imatge31.addActionListener(controlador);
		imatge14.addActionListener(controlador);imatge32.addActionListener(controlador);
		imatge15.addActionListener(controlador);imatge33.addActionListener(controlador);
		imatge16.addActionListener(controlador);imatge34.addActionListener(controlador);
		imatge17.addActionListener(controlador);imatge35.addActionListener(controlador);
		imatge18.addActionListener(controlador);imatge36.addActionListener(controlador);
		cero.addActionListener(controlador);
		
		imatge1.setActionCommand("1");imatge19.setActionCommand("19");
		imatge2.setActionCommand("2");imatge20.setActionCommand("20");
		imatge3.setActionCommand("3");imatge21.setActionCommand("21");
		imatge4.setActionCommand("4");imatge22.setActionCommand("22");
		imatge5.setActionCommand("5");imatge23.setActionCommand("23");
		imatge6.setActionCommand("6");imatge24.setActionCommand("24");
		imatge7.setActionCommand("7");imatge25.setActionCommand("25");
		imatge8.setActionCommand("8");imatge26.setActionCommand("26");
		imatge9.setActionCommand("9");imatge27.setActionCommand("27");
		imatge10.setActionCommand("10");imatge28.setActionCommand("28");
		imatge11.setActionCommand("11");imatge29.setActionCommand("29");
		imatge12.setActionCommand("12");imatge30.setActionCommand("30");
		imatge13.setActionCommand("13");imatge31.setActionCommand("31");
		imatge14.setActionCommand("14");imatge32.setActionCommand("32");
		imatge15.setActionCommand("15");imatge33.setActionCommand("33");
		imatge16.setActionCommand("16");imatge34.setActionCommand("34");
		imatge17.setActionCommand("17");imatge35.setActionCommand("35");
		imatge18.setActionCommand("18");imatge36.setActionCommand("36");
		cero.setActionCommand("0");
		
		tirabola.addActionListener(controlador);tirabola.setActionCommand("tirabola");
		docena1.addActionListener(controlador);docena1.setActionCommand("doc1");
		docena2.addActionListener(controlador);docena2.setActionCommand("doc2");
		docena3.addActionListener(controlador);docena3.setActionCommand("doc3");
		par.addActionListener(controlador);par.setActionCommand("par");
		impar.addActionListener(controlador);impar.setActionCommand("impar");
		falta.addActionListener(controlador);falta.setActionCommand("manca");
		pasa.addActionListener(controlador);pasa.setActionCommand("pasa");
		red.addActionListener(controlador);red.setActionCommand("rojo");
		black.addActionListener(controlador);black.setActionCommand("negro");
		
		ficha5.addActionListener(controlador);ficha5.setActionCommand("ficha5");
		ficha10.addActionListener(controlador);ficha10.setActionCommand("ficha10");
		ficha15.addActionListener(controlador);ficha15.setActionCommand("ficha15");
		ficha20.addActionListener(controlador);ficha20.setActionCommand("ficha20");
	
		
	
	}
	//--------------------------------------inutil-------------------------------
	public int GiveRow(int i){		
			if(i%3 == 0){
				return 1;}
			if(i==2||i==5||i==8||i==11||i==14||i==17||i==20||i==23||i==26||i==29||i==32||i==35){
				return 2;}
			else{
			return 3;}
	}
	public int GiveColumn(int i){
			if(i==1||i==2||i==3){return 1;}
			if(i==4||i==5||i==6){return 2;}
			if(i==7||i==8||i==9){return 3;}
			if(i==10||i==11||i==12){return 4;}
			if(i==13||i==14||i==15){return 5;}
			if(i==16||i==17||i==18){return 6;}
			if(i==19||i==20||i==21){return 7;}
			if(i==22||i==23||i==24){return 8;}
			if(i==25||i==26||i==27){return 9;}
			if(i==28||i==29||i==30){return 10;}
			if(i==31||i==32||i==33){return 11;}
			if(i==34||i==35||i==36){return 12;}
			else{return 0;}	
	}
	public int GiveBoundX (int i){
		if (i == 1){return 92;}if (i == 2){return 160;}if (i == 3){return 228;}if (i == 4){return 296;}if (i == 5){return 366;}if (i == 6){return 434;}
		if (i == 7){return 500;}if (i == 8){return 568;}if (i == 9){return 638;}if (i == 10){return 704;}if (i == 11){return 772;}if (i == 12){return 840;}
		else{return 0;}
	}
	public int GiveBoundY (int i){
		if (i == 1){return 92;}if (i == 2){return 160;}if (i == 3){return 228;}
		else{return 0;}
	}

	public void Posafitxa(int i){
		

		int a = GiveBoundX(GiveColumn(i));
		int b = GiveBoundY(GiveRow(i));
		
		ficha5.setBounds(a, b,30,30);		
	}
	
	//---------------------------------------end inutil-------------------------
	public void gifbola(int a){
		
		jtaApostes.setText("");
		cadAposta = "";
		gifrulet.setBounds(1000,55,185,185);	
		
		
		try {
			Thread.sleep(5000);			
		} catch (InterruptedException e) {
			e.printStackTrace();		
		}
		gifrulet.setBounds(1530,55,185,185);	
		Recorregut(a);
		String b = Integer.toString(a);	
		numerito.setText(b);
		
		if(a!=0){
			if(a<19){passa.setText("1-18");}else{passa.setText("19-36");}		
			if(a%2==0){parr.setText("EVEN");}else{parr.setText("ODD");}
			if(a==1||a==3||a==5||a==7||a==9||a==12||a==14||a==16||a==18||a==21||a==23||a==25||a==27||a==28||a==30||a==32||a==34||a==36){numerito.setBackground(Color.RED);}
			else{numerito.setBackground(Color.BLACK);}
			if(a<13&&a>0){dotzzena.setText("1st 12");}
			if(a<25&&a>12){dotzzena.setText("2nd 12");}
			if(a<37&&a>24){dotzzena.setText("3rd 12");}		
		}else{
			numerito.setBackground(Color.GREEN);passa.setText("---");parr.setText("---");dotzzena.setText("---");
		}
			
	}
		
	public void Actualitzamoney (int t){balance.setText("Balance:  " + t + " �");}
	
	public void NoMoney(){
		JDialog arruinat = new JDialog(this,"�NO MONEY!",true);		
		arruinat.setSize(380,80);
		arruinat.setLayout(new FlowLayout());
        arruinat.add(new JLabel("You don't have enough money!"));   
        arruinat.setLocationRelativeTo(null);
        arruinat.setVisible(true);
	}
	
	public void notime(){
		JDialog notime = new JDialog(this,"�!",true);		
		notime.setSize(380,80);
		notime.setLayout(new FlowLayout());
        notime.add(new JLabel("No more bets!! Ball is rolling!!"));  
        notime.setLocationRelativeTo(null);
        notime.setVisible(true);
	}
	
	public void moveAposta(int b){
		switch (b){
		case 5:		senyal.setBounds(1000,420,40,40);
			break;
		case 10:	senyal.setBounds(1050,420,40,40);
			break;
		case 15:	senyal.setBounds(1100,420,40,40);
			break;
		case 20:	senyal.setBounds(1150,420,40,40);
			break;		
		}
	}
	
	public void muestraganancia(int a){
		if(a!=0){
		
			ganancia.setText("+" + a + "�");
			ganancia.setBounds(400,-30,500,100);
			
			try {
				Thread.sleep(1000);				
			} catch (InterruptedException e) {
				e.printStackTrace();			
			}
			ganancia.setBounds(2000,2000,500,100);			
		}     
	}
	
	
	public Boolean getColor(int a){
		if(a==1||a==3||a==5||a==7||a==9||a==12||a==14||a==16||a==18||a==21||a==23||a==25||a==27||a==28||a==30||a==32||a==34||a==36){return true;}
		else{return false;}
	}
	
	public void addAposta(int a, int b){
		
		for(int x=0;x<38;x++){
			if(x == a){
				cadAposta = "Number "+a+"--> " + b+"�"+ "\n" + cadAposta;
			}
		}		
		
		if(a==40){String c = Integer.toString(b);cadAposta = "1st 12 --> " + b+"€"+ "\n" + cadAposta;}
		if(a==41){String c = Integer.toString(b);cadAposta = "2nd 12 --> " + b+"€"+ "\n" + cadAposta;}
		if(a==42){String c = Integer.toString(b);cadAposta = "3rd 12 --> " + b+"€"+ "\n" + cadAposta;}
		if(a==43){String c = Integer.toString(b);cadAposta = "18-36  --> " + b+"€"+ "\n" + cadAposta;}
		if(a==44){String c = Integer.toString(b);cadAposta = "1-18   --> " + b+"€"+ "\n" + cadAposta;}
		if(a==45){String c = Integer.toString(b);cadAposta = "RED    --> " + b+"€"+ "\n" + cadAposta;}
		if(a==46){String c = Integer.toString(b);cadAposta = "BLACK  --> " + b+"€"+ "\n" + cadAposta;}
		if(a==47){String c = Integer.toString(b);cadAposta = "EVEN   --> " + b+"€"+ "\n" + cadAposta;}
		if(a==48){String c = Integer.toString(b);cadAposta = "ODD    --> " + b+"€"+ "\n" + cadAposta;}
		jtaApostes.setText(cadAposta);
	}
	
	public void Recorregut(int a){
		
		
		int[] aux = new int[11];		
		recorregut[0] = a;		
		for (int f=0;f<11;f++){	aux[f] = recorregut[f];	}
		
		recorregut[1] = aux[0];recorregut[2] = aux[1];recorregut[3] = aux[2];recorregut[4] = aux[3];recorregut[5] = aux[4];recorregut[6] = aux[5];
		recorregut[7] = aux[6];recorregut[8] = aux[7];recorregut[9] = aux[8];recorregut[10]= aux[9];

	
		String b = Integer.toString(recorregut[1]);lcero.setText(b);lcero.setBounds(945,20,24,20);
		if(recorregut[1]!=-1){if(recorregut[1]!=0){if(getColor(recorregut[1]) == true){lcero.setBackground(Color.RED);}else{lcero.setBackground(Color.BLACK);}}else{lcero.setBackground(Color.GREEN);}}	
		String c = Integer.toString(recorregut[2]);luno.setText(c);luno.setBounds(974,20,24,20);
		if(recorregut[2]!=-1){if(recorregut[2]!=0){if(getColor(recorregut[2]) == true){luno.setBackground(Color.RED);}else{luno.setBackground(Color.BLACK);}}else{luno.setBackground(Color.GREEN);}}				
		String d = Integer.toString(recorregut[3]);ldos.setText(d);ldos.setBounds(1003,20,24,20);
		if(recorregut[3]!=-1){if(recorregut[3]!=0){if(getColor(recorregut[3]) == true){ldos.setBackground(Color.RED);}else{ldos.setBackground(Color.BLACK);}}else{ldos.setBackground(Color.GREEN);}}		
		String e = Integer.toString(recorregut[4]);ltres.setText(e);ltres.setBounds(1032,20,24,20);
		if(recorregut[4]!=-1){if(recorregut[4]!=0){if(getColor(recorregut[4]) == true){ltres.setBackground(Color.RED);}else{ltres.setBackground(Color.BLACK);}}else{ltres.setBackground(Color.GREEN);}}			
		String f = Integer.toString(recorregut[5]);lcuatro.setText(f);lcuatro.setBounds(1061,20,24,20);
		if(recorregut[5]!=-1){if(recorregut[5]!=0){if(getColor(recorregut[5]) == true){lcuatro.setBackground(Color.RED);}else{lcuatro.setBackground(Color.BLACK);}}else{lcuatro.setBackground(Color.GREEN);}}				
		String g = Integer.toString(recorregut[6]);	lcinco.setText(g);lcinco.setBounds(1090,20,24,20);
		if(recorregut[6]!=-1){if(recorregut[6]!=0){if(getColor(recorregut[6]) == true){lcinco.setBackground(Color.RED);}else{lcinco.setBackground(Color.BLACK);}}else{lcinco.setBackground(Color.GREEN);}}			
		String h = Integer.toString(recorregut[7]);	lseis.setText(h);lseis.setBounds(1119,20,24,20);
		if(recorregut[7]!=-1){if(recorregut[7]!=0){if(getColor(recorregut[7]) == true){lseis.setBackground(Color.RED);}else{lseis.setBackground(Color.BLACK);}}else{lseis.setBackground(Color.GREEN);}}	
		String i = Integer.toString(recorregut[8]);	lsiete.setText(i);lsiete.setBounds(1148,20,24,20);
		if(recorregut[8]!=-1){if(recorregut[8]!=0){if(getColor(recorregut[8]) == true){lsiete.setBackground(Color.RED);}else{lsiete.setBackground(Color.BLACK);}}else{lsiete.setBackground(Color.GREEN);}}	
		String j = Integer.toString(recorregut[9]);	locho.setText(j);locho.setBounds(1177,20,24,20);
		if(recorregut[9]!=-1){if(recorregut[9]!=0){if(getColor(recorregut[9]) == true){locho.setBackground(Color.RED);}else{locho.setBackground(Color.BLACK);}}else{locho.setBackground(Color.GREEN);}}	
		String k = Integer.toString(recorregut[10]);lnueve.setText(k);lnueve.setBounds(1206,20,24,20);
		if(recorregut[10]!=-1){if(recorregut[10]!=0){if(getColor(recorregut[10]) == true){lnueve.setBackground(Color.RED);}else{lnueve.setBackground(Color.BLACK);}}else{lnueve.setBackground(Color.GREEN);}}	
	
	}
	public void mostratemps(int secs){
	
		String b = Integer.toString(secs);
		if(secs == 10){up.setBackground(Color.RED);down.setBackground(Color.RED);left.setBackground(Color.RED);right.setBackground(Color.RED);}
		if(secs == 9){up.setBackground(Color.BLACK);down.setBackground(Color.BLACK);left.setBackground(Color.BLACK);right.setBackground(Color.BLACK);}
		if(secs == 8){up.setBackground(Color.RED);down.setBackground(Color.RED);left.setBackground(Color.RED);right.setBackground(Color.RED);}
		if(secs == 7){up.setBackground(Color.BLACK);down.setBackground(Color.BLACK);left.setBackground(Color.BLACK);right.setBackground(Color.BLACK);}
		if(secs == 6){up.setBackground(Color.RED);down.setBackground(Color.RED);left.setBackground(Color.RED);right.setBackground(Color.RED);}
		if(secs == 5){up.setBackground(Color.BLACK);down.setBackground(Color.BLACK);left.setBackground(Color.BLACK);right.setBackground(Color.BLACK);}
		if(secs == 4){up.setBackground(Color.RED);down.setBackground(Color.RED);left.setBackground(Color.RED);right.setBackground(Color.RED);}
		if(secs == 3){up.setBackground(Color.BLACK);down.setBackground(Color.BLACK);left.setBackground(Color.BLACK);right.setBackground(Color.BLACK);}
		if(secs == 2){up.setBackground(Color.RED);down.setBackground(Color.RED);left.setBackground(Color.RED);right.setBackground(Color.RED);}
		if(secs == 1){up.setBackground(Color.BLACK);down.setBackground(Color.BLACK);left.setBackground(Color.BLACK);right.setBackground(Color.BLACK);}
		if(secs == 0){
			up.setBackground(Color.RED);down.setBackground(Color.RED);left.setBackground(Color.RED);right.setBackground(Color.RED);
			nobets.setBounds(950,600,500,100);	}
		if(secs == 9){up.setBackground(Color.BLACK);down.setBackground(Color.BLACK);left.setBackground(Color.BLACK);right.setBackground(Color.BLACK);
		nobets.setBounds(950,800,500,100);	}
		temps.setText(b);
		
	}
}

	
	
	
	

