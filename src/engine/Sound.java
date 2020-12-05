package engine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound  implements KeyListener{
	
	public boolean press=false;
	
public static	File f=new File("move3.wav");
public static	File r=new File("rr.wav");

	public static void main(String[] args) {
	
	}
	
	public static void playsound(File x) {
		try {
			Clip cl=AudioSystem.getClip();
			cl.open(AudioSystem.getAudioInputStream(x));
			
			cl.start();
			

			Thread.sleep(cl.getMicrosecondLength()/1000);
		}
			
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
		public static void stopsound(File f) {
			try {
				Clip cl=AudioSystem.getClip();
				cl.open(AudioSystem.getAudioInputStream(f));
				
				
				cl.stop();

				
			}
				
			catch (Exception e) {
				// TODO: handle exception
			}
		
	
	}

		Sound(){
			
		}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent key) {
		if((key.getKeyCode() == KeyEvent.VK_LEFT))
			playsound(r);
			
		if((key.getKeyCode() == KeyEvent.VK_RIGHT))
			playsound(r);

		if((key.getKeyCode() == KeyEvent.VK_UP))
			playsound(f);

		if((key.getKeyCode() == KeyEvent.VK_DOWN))
			playsound(f);

			
	}

	@Override
	public void keyReleased(KeyEvent e) {
//stopsound();		
	}

	
	
		

}

