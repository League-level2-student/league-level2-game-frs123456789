import java.awt.Color;
import java.awt.Graphics;

public class GamePanel {
jp = new JPanel();
final int MENU = 0;
final int GAME = 1;
final int END = 2;



GamePanel(){
	
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
	g.
}

void drawGameState(Graphics g) {
	
	
	}

void drawEndState(Graphics g) {


}



}
