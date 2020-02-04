import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener, ActionListener {

final int MENU = 0;
final int GAME = 1;
final int END = 2;
Font titleFont;
int currentState = MENU;
Timer frameDraw; 
public static BufferedImage image;
public static boolean needImage = true;
public static boolean gotImage = false;	



void loadImage(String imageFile) {
    if (needImage) {
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
	    gotImage = true;
        } catch (Exception e) {
            
        }
        needImage = false;
    }
}



GamePanel(){
	titleFont = new Font("Brush Script MT", Font.PLAIN, 48);
	
	frameDraw = new Timer(1000 / 60, this);
	frameDraw.start();
	if (needImage) {
	    loadImage ("anchor.png");
	    System.out.println("working");
	}
}

public void paintComponent(Graphics g) {
	if (currentState == MENU) {
		drawMenuState(g);
	} else if (currentState == GAME) {
		drawGameState(g);
	} else if (currentState == END) {
		drawEndState(g);
	}
}

void updateMenuState() {

}

void updateGameState() {

}

void updateEndState() {

}

void drawMenuState(Graphics g) {
	g.setColor(new Color(198,248,255));
	g.fillRect(0, 0, WaveRunner.WIDTH, WaveRunner.HEIGHT);
	g.setFont(titleFont);
	g.setColor(new Color(0,40,108));
	g.drawString("Press 'enter' to start!", 90, 200);
	g.drawString("Wave Runner", 150, 100);
	g.setFont(titleFont);
	g.drawImage(image,115,400,250,322,null);
}

void drawGameState(Graphics g) {
	
	
	}

void drawEndState(Graphics g) {
	g.setColor(new Color(198,248,255));
	g.fillRect(0, 0, WaveRunner.WIDTH, WaveRunner.HEIGHT);
	g.setFont(titleFont);
	g.setColor(new Color(0,40,108));
	g.drawString("GAME OVER :(", 15, 150);

}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}



}
