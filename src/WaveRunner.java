import java.awt.Dimension;

import javax.swing.JFrame;

public class WaveRunner {


	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	
	WaveRunner(){
		
		jf = new JFrame();
		jf.setVisible(true);
		jf.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		jf.pack();

	}
	
	public static void main(String[] args) {
		WaveRunner wr = new WaveRunner();
		wr.setup();
	}
	void setup() {
		
		int height = HEIGHT;
		int width = WIDTH;

	}}


