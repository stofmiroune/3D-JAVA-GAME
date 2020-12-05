package engine;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Texture {
	public int[] pixels;
	private String loc;
	public final int SIZE;
	
	
	public Texture(String location, int size) {
		loc = location;
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		load();
		
	}
	
	private void load() {
		try {
			BufferedImage image = ImageIO.read(new File(loc));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Texture first = new Texture(Entry.S[0],64);
	public static Texture second = new Texture(Entry.S[1],64);
	public static Texture third = new Texture(Entry.S[2],64);
	public static Texture forth = new Texture(Entry.S[3],64);
}
