import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ComputeThread extends Thread{

	int count;//number of equations solved 
	JLabel[] resultLabels; 
	JLabel l; 
	JLabel empty; 
	JLabel lTotal;
	QuadraticEquationQueue q;
	
	private boolean suspendFlag = false; 
	
	ComputeThread(JLabel empty,QuadraticEquationQueue q,JLabel[] resultLabels, JLabel lTotal,JLabel l){
		this.empty=empty; 
		this.q=q;
		this.resultLabels=resultLabels;
		this.lTotal=lTotal; 
		this.l=l;		
	}
	
	public void myResume(){
		suspendFlag=false; 
	}
	
	public synchronized void mySuspend(){
		suspendFlag=true; 
		notify(); 
	}
	
	public void run(){
		while (true){
			try{
				synchronized(this){
					while (suspendFlag || q.isEmpty()){
						wait(); 
					}
					QuadraticEquation eq = q.remove();
					if (q.isEmpty()){
						empty.setForeground(Color.GREEN);
					}
					//TODO: solve the equation, output accoordingly 
					
				}
				
			}catch (InterruptedException ex){}
		}
		
		
	}
	
	
	
	
	
}
