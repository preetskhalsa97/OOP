import java.awt.*;
import javax.swing.*;
import java.awt.geom.*; 

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f1 = new JFrame("My Frame"); 
		f1.setLayout(new BorderLayout());
		RectComponent r1 = new RectComponent(); 
		f1.setSize(300, 400);
		f1.add(r1,BorderLayout.CENTER); 
		//f1.show();
		f1.setVisible(true);

	}

}
