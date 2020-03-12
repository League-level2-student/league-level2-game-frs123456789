import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

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
	public static BufferedImage ankr;
	public static BufferedImage oshen;
	public static BufferedImage beaut;
	public static boolean needImage = true;
	public static boolean gotImage = false;

	BufferedImage loadImage(String imageFile) {
		BufferedImage imaj = null;

		try {
			imaj = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return imaj;
	}

	GamePanel() {
		titleFont = new Font("Brush Script MT", Font.PLAIN, 48);

		frameDraw = new Timer(1000 / 60, this);
		frameDraw.start();
		if (needImage) {
			ankr = loadImage("anchor.png");
			oshen = loadImage("oceanbackground.jpg");
			beaut = loadImage("boat.png");
			gotImage = true;
			needImage = false;
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
		g.setColor(new Color(198, 248, 255));
		g.fillRect(0, 0, WaveRunner.WIDTH, WaveRunner.HEIGHT);
		g.setFont(titleFont);
		g.setColor(new Color(0, 40, 108));
		g.drawString("Press 'enter' to start!", 10, 200);
		g.drawString("Wave Runner", 50, 100);
		g.setFont(titleFont);
		g.drawImage(ankr, 500, 150, 250, 322, null);
	}

	void drawGameState(Graphics g) {
		if (gotImage) {
			g.drawImage(oshen, 0, 0, WaveRunner.WIDTH, WaveRunner.HEIGHT, null);
			g.drawImage(beaut, 500, 150, 250, 322, null);
		} else {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, WaveRunner.WIDTH, WaveRunner.HEIGHT);
		}

	}

	void drawEndState(Graphics g) {
		g.setColor(new Color(198, 248, 255));
		g.fillRect(0, 0, WaveRunner.WIDTH, WaveRunner.HEIGHT);
		g.setFont(titleFont);
		g.setColor(new Color(0, 40, 108));
		g.drawString("GAME OVER :(", 15, 150);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == END) {

				currentState = MENU;
			} else {
				currentState++;
				if (currentState == GAME) {
					startGame();
				}
			}
		}
	}

	private void startGame() {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
if (currentState == MENU) {
			
			updateMenuState();
		} else if (currentState == GAME) {
			updateGameState();
		} else if (currentState == END) {
			updateEndState();

		}
		repaint();
	}

}
