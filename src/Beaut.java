

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.image.BufferedImage;
	import javax.imageio.ImageIO;
	public class Beaut {
		
	
	

	int speed = 0;
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
		Beaut(int x, int y, int width, int height) {
			if (needImage) {
			    loadImage ("boat.png");
			}
			
}
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
	
	
	
	}
