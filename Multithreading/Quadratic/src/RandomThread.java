import java.awt.Frame;
import java.util.Random;

import javax.swing.JTextField;

public class RandomThread extends Thread{
	public static JTextField t1;
	public static JTextField t2;
	public static JTextField t3;
	Frame f; 
	private boolean suspendFlag=false; 
	private int a;
	private int b; 
	private int c;
	
	RandomThread(JTextField t1,JTextField t2,JTextField t3,Frame f){
		this.t1=t1; 
		this.t2=t2;
		this.t3=t3;
		this.f=f; 
	}
	
	public synchronized void myResume(){
		suspendFlag=false;
		notifyAll(); 
	}
	
	public synchronized void mySuspend(){
		suspendFlag=true; 
		notifyAll(); 
	}
	
	public void run(){
		
		
			while (true){
				try{
				synchronized(this){
					while (suspendFlag){
					wait(); 
				}
				}
				//while (true){
				//synchronized(this){
					a = OnlineMain.r1.nextInt(20); 
					b = OnlineMain.r1.nextInt(20); 
					c=OnlineMain.r1.nextInt(20); 
					
					t1.setText(a + "");
					t2.setText(b + "");
					t3.setText(c + "");
					f.repaint();
					Thread.sleep(100);
				//}
				//}
				
			}catch (InterruptedException ex){}
			}
		
	}

}
