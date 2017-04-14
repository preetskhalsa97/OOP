import java.awt.*;
import javax.swing.*;

public class MainFrameTest {

	@SuppressWarnings("deprecation")
	public static void main (String[] Args){
		JFrame f1 = new JFrame("Main Frame"); 
		JPanel p1 = new JPanel(); 
		p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
		
		JPanel p2 = new JPanel(); 
		
		JPanel p3 = new JPanel();
		
		p3.setLayout(new BorderLayout());
		
		JButton b1 = new JButton("RED");
		JButton b2 = new JButton("GREEN");
		JButton b3 = new JButton("Hello");
		JButton b4 = new JButton("Hi");
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		
		JLabel l1 = new JLabel("Hello, how are you?");
		p3.add(l1, BorderLayout.CENTER);
		
		b1.addActionListener(new ButtonListener(l1));
		b2.addActionListener(new ButtonListener(l1));
		b3.addActionListener(new ButtonListener(l1));
		b4.addActionListener(new ButtonListener(l1));
		
		f1.add(p1,BorderLayout.EAST); 
		f1.add(p2,BorderLayout.SOUTH); 
		f1.add(p3,BorderLayout.CENTER);
		
		f1.setSize(400,600);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.show();
	}
}
