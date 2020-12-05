package engine;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


public class Entry {
	public static	File entry=new File("entry2.wav");
	public static String[] S = new String[4] ;
	public static boolean start = false;

	JFrame frame;
	JPanel pan;
	JButton but;
	PanelImage jp;
	 ButtonGroup gr;
	JRadioButton nazi,ensah;
	

	Entry(){
		
		frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		pan=new JPanel();
		
		but=new JButton("resize me then click to start!");
		
		gr = new ButtonGroup();
		
		nazi=new JRadioButton("Nazi");
		ensah=new JRadioButton("Ensah");
		
		gr.add(ensah);
		gr.add(nazi);
		
		 jp= new PanelImage(new ImageIcon("Ensah.jpg").getImage().getScaledInstance(800,800, Image.SCALE_SMOOTH));
		 jp.setBounds(0, 0, 200, 300);
		pan.add(jp);
		
		
		jp.add(ensah);
		jp.add(nazi);
		
		ensah.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			start=true;
				S[0]="4.png";
				S[1]="l2.png";
				S[2]="5.png";
				S[3]="l1.png";
			
			
				
			}
		});
		
		nazi.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				start=true;
				S[0]="22.png";
				S[1]="44.png";
				S[2]="8.png";
				S[3]="33.png";
			
			}
		});
		
		frame.setContentPane(jp);
		jp.add(but);
		
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			if(start) {
		         		frame.dispose();
		         		new Game();
			            }
				
              
				
			}
		});
		
		
		
		but.setBounds(400, 300, 50, 50);
		
		
		frame.setTitle("Robot GI2 3D");
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE );
		frame.setVisible(true);
		frame.pack();
		frame.setSize(800,300);
		frame.setLocation(300, 300);
		Sound.playsound(entry);
		
	}
	public static void main(String[] args) {
Entry a=new Entry();
a.frame.setSize(800, 300);
	}

}
