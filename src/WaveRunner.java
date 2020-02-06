import java.awt.Dimension;

import javax.swing.JFrame;

public class WaveRunner {
	GamePanel gp = new GamePanel();
	JFrame jf;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 500;

	public WaveRunner() {
		jf = new JFrame();
		jf.setVisible(true);
		jf.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		jf.pack();
		jf.addKeyListener(gp);

	}

	void setup() {
		jf.add(gp);
		int height = HEIGHT;
		int width = WIDTH;
	}

	public static void main(String[] args) {
		WaveRunner wr = new WaveRunner();
		wr.setup();
	}
}
