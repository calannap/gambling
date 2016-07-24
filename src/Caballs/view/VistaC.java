package view;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import controller.ControllerC;
import model.CaballoC;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Color;

@SuppressWarnings("serial")
public class VistaC extends JFrame {
    private JLabel jLabelsize;
    private static JLabel lblCaballo1, lblCaballo2, lblCaballo3, lblCaballo4, lblCaballo5, lblCaballo6, lblCaballo7, lblCaballo8, lblCaballo9,
    lblCaballo10, lblCaballo11, lblCaballo12;
    private static JLabel lblLinea;
    private static JTextField tfHname;
  	private static JTextField tfMoney;
    private static JLabel lblWinnerName1;
    private static JTextArea taAposta_1;
    private static JButton jbBet;
    private static JLabel lblMoney1;
    
    public VistaC() {
    	setResizable(false);
        initComponents();
    }
  
    private void initComponents() {
    	
    	JPanelBackground jPanel1 = new JPanelBackground();
        lblLinea = new JLabel();
        lblCaballo1 = new JLabel();
        lblCaballo2 = new JLabel();
        lblCaballo3 = new JLabel();
        lblCaballo4 = new JLabel();
        lblCaballo5 = new JLabel();
        lblCaballo6 = new JLabel();
        lblCaballo7 = new JLabel();
        lblCaballo8 = new JLabel();
        lblCaballo9 = new JLabel();
        lblCaballo10 = new JLabel();
        lblCaballo11 = new JLabel();
        lblCaballo12 = new JLabel();
        jLabelsize = new JLabel();

        lblCaballo1.setFont(new Font("Tahoma",Font.BOLD, 13)); 
        lblCaballo1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/horse.gif"))); 

        lblCaballo2.setFont(new Font("Tahoma", Font.BOLD, 13)); 
        lblCaballo2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/horse.gif"))); 

        lblCaballo3.setFont(new Font("Tahoma", Font.BOLD, 13)); 
        lblCaballo3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/horse.gif"))); 

        lblCaballo4.setFont(new Font("Tahoma",Font.BOLD, 13)); 
        lblCaballo4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/horse.gif"))); 
        
        lblCaballo5.setFont(new Font("Tahoma", Font.BOLD, 13)); 
        lblCaballo5.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/horse.gif"))); 
        
        lblCaballo6.setFont(new Font("Tahoma", Font.BOLD, 13)); 
        lblCaballo6.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/horse.gif"))); 
        
        lblCaballo7.setFont(new Font("Tahoma", Font.BOLD, 13)); 
        lblCaballo7.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/horse.gif"))); 
        
        lblCaballo8.setFont(new Font("Tahoma", Font.BOLD, 13)); 
        lblCaballo8.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/horse.gif"))); 
        
        lblCaballo9.setFont(new Font("Tahoma", Font.BOLD, 13)); 
        lblCaballo9.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/horse.gif"))); 
        
        lblCaballo10.setFont(new Font("Tahoma", Font.BOLD, 13)); 
        lblCaballo10.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/horse.gif"))); 
        
        lblCaballo11.setFont(new Font("Tahoma", Font.BOLD, 13)); 
        lblCaballo11.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/horse.gif"))); 
        
        lblCaballo12.setFont(new Font("Tahoma", Font.BOLD, 13)); 
        lblCaballo12.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/horse.gif"))); 

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

       // jPanel1.setBackgroundimg("Resources/fondo.png");

        lblLinea.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/linea.png")));
        
        tfHname = new JTextField();
        tfHname.setBackground(new Color(204, 153, 102));
        tfHname.setColumns(10);
        
        jbBet = new JButton("Bet");
        jbBet.setBackground(new Color(255, 255, 224));
        jbBet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	jbBetActionPerformed(evt);
            }
        });
        JLabel lblHorseName = new JLabel("Horse Name");
        lblHorseName.setFont(new Font("Apple Chancery", Font.PLAIN, 16));
        
        tfMoney = new JTextField();
        tfMoney.setBackground(new Color(204, 153, 102));
        tfMoney.setColumns(10);
        
        JLabel lblMoney2 = new JLabel("Money");
        lblMoney2.setFont(new Font("Apple Chancery", Font.PLAIN, 16));
        
        lblWinnerName1 = new JLabel("Winner Name");
        lblWinnerName1.setForeground(new Color(255, 255, 0));
        lblWinnerName1.setFont(new Font("Apple Chancery", Font.PLAIN, 28));
        
        taAposta_1 = new JTextArea();
        taAposta_1.setBackground(new Color(255, 250, 205));
        taAposta_1.setEditable(false);
        
        JLabel lblMny = new JLabel("Money $ : ");
        lblMny.setFont(new Font("Apple Chancery", Font.PLAIN, 30));
        lblMny.setForeground(Color.GREEN);
        
        lblMoney1 = new JLabel("0");
        lblMoney1.setForeground(Color.GREEN);
        lblMoney1.setFont(new Font("Apple Chancery", Font.PLAIN, 30));
        
        JLabel lblWinnerName2 = new JLabel("");
        lblWinnerName2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/Trophy.png")));
        lblWinnerName2.setForeground(Color.YELLOW);
        lblWinnerName2.setFont(new Font("Apple Chancery", Font.PLAIN, 28));
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabelsize, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        							.addGap(62))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblCaballo7)
        								.addComponent(lblCaballo8)
        								.addComponent(lblCaballo9)
        								.addComponent(lblCaballo10)
        								.addComponent(lblCaballo11))
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGap(29))
        				.addComponent(lblCaballo4)
        				.addComponent(lblCaballo5)
        				.addComponent(lblCaballo6)
        				.addComponent(lblCaballo3)
        				.addComponent(lblCaballo2)
        				.addComponent(lblCaballo1)
        				.addComponent(lblCaballo12))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblLinea, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        			.addGap(2)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(58)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(lblMny)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(lblMoney1))
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        							.addGroup(jPanel1Layout.createSequentialGroup()
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(lblHorseName)
        									.addComponent(lblMoney2))
        								.addGap(18)
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(tfMoney, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addComponent(tfHname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        							.addComponent(jbBet, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(taAposta_1, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(128)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(6)
        							.addComponent(lblWinnerName1))
        						.addComponent(lblWinnerName2))))
        			.addGap(91))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(lblMoney1)
        							.addComponent(lblMny))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblHorseName)
        							.addComponent(tfHname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(tfMoney, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblMoney2))
        						.addGap(18)
        						.addComponent(taAposta_1, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(jbBet)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(lblWinnerName2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(lblWinnerName1)
        						.addGap(97))
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addComponent(jLabelsize)
        						.addGap(38)
        						.addComponent(lblCaballo1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(lblCaballo2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addGap(12)
        						.addComponent(lblCaballo3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.UNRELATED)
        						.addComponent(lblCaballo4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addGap(12)
        						.addComponent(lblCaballo5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.UNRELATED)
        						.addComponent(lblCaballo6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addGap(10)
        						.addComponent(lblCaballo7, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addGap(16)
        						.addComponent(lblCaballo8, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addGap(16)
        						.addComponent(lblCaballo9, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addGap(16)
        						.addComponent(lblCaballo10, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addGap(16)
        						.addComponent(lblCaballo11, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(lblCaballo12, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addGap(68)))
        				.addComponent(lblLinea, GroupLayout.PREFERRED_SIZE, 752, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        try {
			ImageIO.read(getClass().getClassLoader().getResource(""));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        jPanel1.setLayout(jPanel1Layout);

        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1137, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 758, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(132, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
     
    }
    
    private void jbBetActionPerformed(ActionEvent evt) {
    	ControllerC.bet(tfMoney.getText(),tfHname.getText());
    	jbBet.setEnabled(false);
	}
    
    public static void setWinners(ArrayList<CaballoC> c){
    	
    }
    
    public static void setButtonsActive(){
    		jbBet.setEnabled(true);
    		tfMoney.setEditable(true);
    		tfHname.setEditable(true);
    }
    
    public static void setButtonsDisabled(){
    		jbBet.setEnabled(false);
    		tfMoney.setEditable(false);
    		tfHname.setEditable(false);
    }
    
    
    private void formWindowOpened(WindowEvent evt) {
    	ControllerC.setup();
    }
    
   public static JTextArea getTaAposta_1() {
		return taAposta_1;
	}

	public static void setTaAposta_1(JTextArea taAposta_1) {
		VistaC.taAposta_1 = taAposta_1;
	}

public static void setApostes(String t){
	   String aux;
	   aux = taAposta_1.getText()+ "\n" + t;
	   taAposta_1.setText(aux);
   }
   
   public static void borrarApostes(){
	   taAposta_1.setText("");
   }
   public static void setWinnerName(String name){
	    lblWinnerName1.setText(name);
   }
   public static void setMoney(String string){ 
	   lblMoney1.setText(string);
   }

public static JLabel getLblCaballo1() {
	return lblCaballo1;
}

public static void setLblCaballo1(JLabel lblCaballo1) {
	VistaC.lblCaballo1 = lblCaballo1;
}

public static JLabel getLblCaballo2() {
	return lblCaballo2;
}

public static void setLblCaballo2(JLabel lblCaballo2) {
	VistaC.lblCaballo2 = lblCaballo2;
}

public static JLabel getLblCaballo3() {
	return lblCaballo3;
}

public static void setLblCaballo3(JLabel lblCaballo3) {
	VistaC.lblCaballo3 = lblCaballo3;
}

public static JLabel getLblCaballo4() {
	return lblCaballo4;
}

public static void setLblCaballo4(JLabel lblCaballo4) {
	VistaC.lblCaballo4 = lblCaballo4;
}

public static JLabel getLblCaballo5() {
	return lblCaballo5;
}

public static void setLblCaballo5(JLabel lblCaballo5) {
	VistaC.lblCaballo5 = lblCaballo5;
}

public static JLabel getLblCaballo6() {
	return lblCaballo6;
}

public static void setLblCaballo6(JLabel lblCaballo6) {
	VistaC.lblCaballo6 = lblCaballo6;
}

public static JLabel getLblCaballo7() {
	return lblCaballo7;
}

public static void setLblCaballo7(JLabel lblCaballo7) {
	VistaC.lblCaballo7 = lblCaballo7;
}

public static JLabel getLblCaballo8() {
	return lblCaballo8;
}

public static void setLblCaballo8(JLabel lblCaballo8) {
	VistaC.lblCaballo8 = lblCaballo8;
}

public static JLabel getLblCaballo9() {
	return lblCaballo9;
}

public static void setLblCaballo9(JLabel lblCaballo9) {
	VistaC.lblCaballo9 = lblCaballo9;
}

public static JLabel getLblCaballo10() {
	return lblCaballo10;
}

public static void setLblCaballo10(JLabel lblCaballo10) {
	VistaC.lblCaballo10 = lblCaballo10;
}

public static JLabel getLblCaballo11() {
	return lblCaballo11;
}

public static void setLblCaballo11(JLabel lblCaballo11) {
	VistaC.lblCaballo11 = lblCaballo11;
}

public static JLabel getLblCaballo12() {
	return lblCaballo12;
}

public static void setLblCaballo12(JLabel lblCaballo12) {
	VistaC.lblCaballo12 = lblCaballo12;
}

public static JLabel getLblLinea() {
	return lblLinea;
}

public static void setLblLinea(JLabel lblLinea) {
	VistaC.lblLinea = lblLinea;
}

public static JTextField getTfHname() {
	return tfHname;
}

public static void setTfHname(JTextField tfHname) {
	VistaC.tfHname = tfHname;
}

public static JTextField getTfMoney() {
	return tfMoney;
}

public static void setTfMoney(JTextField tfMoney) {
	VistaC.tfMoney = tfMoney;
}

public static JLabel getLblMoney1() {
	return lblMoney1;
}

public static void setLblMoney1(JLabel lblMoney1) {
	VistaC.lblMoney1 = lblMoney1;
}

   
}

