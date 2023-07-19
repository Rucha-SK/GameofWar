//package GameOfWar;

import java.util.*;
import java.awt.Graphics2D;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class DeckImage {
	final int width = 100;
	final int height = 147;

	JLabel l;
	
		BufferedImage deckImage;
		DeckImage(){
			InputStream stream = getClass().getResourceAsStream("cards.png");
            
			
			try {
				deckImage = ImageIO.read(stream);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		
		
		BufferedImage getImage(int row, int column){
			//super.getImage(row,column);
			int x = column*width;
			int y = row*height;
			BufferedImage image = new BufferedImage(width,height, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.createGraphics();
			
			g.drawImage(deckImage,0,0,width,height,x,y,x+ width, y+ height, null);
			
		    return image;
			
		}
	
}

//code ends

