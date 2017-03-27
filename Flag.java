package ls09;
import java.awt.*;
import javax.swing.*;
import java.math.*; 

public class Flag extends JFrame{

	
	Flag()
	{
	super();
	setSize(500,500) ;
	setDefaultCloseOperation(EXIT_ON_CLOSE) ;
	show();
	}
	public void paint(Graphics g){
		g.fillRect(100,100 ,10 ,350); //(xPos,yPos,width,height)
		g.setColor(Color.red);
		g.fillRect(110,120 ,200 ,40);
		g.setColor(Color.white);
		g.fillRect(110,160, 200, 40);
		g.setColor(Color.green);
		g.fillRect(110,200, 200, 40);
		g.setColor(Color.blue);
		g.drawOval(190, 160, 40, 40); // circle ==> center = (210,180)
		double totalAngle=2*Math.PI; 
		double angle= totalAngle/(2*24.0); 
		int i=0; // i=current angle 
		while (i<24){
			double currentAngle=i*angle; 
			double x1 =210-20*Math.cos(currentAngle) ; 
			double x2 = 210+20*Math.cos(currentAngle); 
			double y1 = 180-20*Math.sin(currentAngle); 
			double y2=180+20*Math.sin(currentAngle);
			int a1=(int)x1;
			int a2=(int)x2; 
			int b1=(int)y1; 
			int b2=(int)y2; 
			g.drawLine(a1, b1, a2, b2);
			i++; 
		}
	}
	
	public static void main(String[] Args){
		Flag graphics=new Flag();
		
	}
}


