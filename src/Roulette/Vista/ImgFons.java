package Vista;

import java.awt.image.BufferedImage;
import java.io.IOException;


import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImgFons extends JPanel{
 
	private BufferedImage image;
	
	public ImgFons(){
		
		URL resource = getClass().getResource("fons.jpg");
	/*try{
			image = ImageIO.read(resource);
		}catch (IOException e){
			e.printStackTrace();
		}*/
	}
	
}
