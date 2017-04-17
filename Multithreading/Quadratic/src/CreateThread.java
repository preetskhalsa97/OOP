import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CreateThread extends Thread{
	
	
	JLabel l; 
	JLabel lq; 
	JFrame f; 
	private int a;
	private int b; 
	private int c;
	QuadraticEquationQueue q;
	private boolean suspendFlag = false; 
	
	CreateThread(QuadraticEquationQueue q,JLabel l, JFrame f,JLabel lq){
		
		this.q=q; 		
		this.l=l; 
		this.f=f; 
		this.lq=lq; 
		
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
				String str1 = RandomThread.t1.getText(); 
				String str2 = RandomThread.t2.getText();
				String str3 = RandomThread.t3.getText();
				
				if (str1==""||str2==""||str3==""||str1==null||str2==null||str3==null){
					// do nothing
					 
				}
				
				else{
					System.out.println(str1);
					System.out.println(str2);
					System.out.println(str3);
					a = Integer.parseInt(str1); //WHY ERROR?!!!??!! ==> CHECK STRING POINTING TO NULL!!
					b = Integer.parseInt(str2); 
					c = Integer.parseInt(str3); 
					 
					if (a==0){
						// do nothing 
					}
					
					else{
						QuadraticEquation eq = new QuadraticEquation(a,b,c); 
						synchronized(this){
							if (!q.isEmpty()){
								while (q.isFull()){
									wait(); 
								}
							}
						}
							
						
							q.add(eq);
							l.setText("No of QuadraticEquations Created:"+eq.getNoofObjects());
							if (q.isFull()){
								lq.setForeground(Color.GREEN);
							}
							else{
								lq.setForeground(Color.BLACK);
							}
							f.repaint();
						//}
					}
				}
				Thread.sleep(150);
			//}
			//}
			
		}catch (InterruptedException ex){}
		}
		
	}
	
	
	

}
