import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonListener implements ActionListener{

	JLabel l1; 
	
	ButtonListener(JLabel l1){
		this.l1=l1;  
	}
	
	public void actionPerformed(ActionEvent ae){
		String str = ae.getActionCommand();
		if (str.equals("Hello")){
			l1.setText("Hello, how are you?");
		}
		if (str.equals("Hi")){
			l1.setText("Hi, how are you?");
		}
		if (str.equals("RED")){
			l1.setForeground(Color.red);
		}
		if (str.equals("GREEN")){
			l1.setForeground(Color.green);
		}
		
	}
}// end of class
