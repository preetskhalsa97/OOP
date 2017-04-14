import javax.swing.JFrame;

public class LeftThread extends Thread{
	
	CircleIcon c; 
	JFrame f; 
	
	LeftThread(CircleIcon c,JFrame f){
		this.c=c; 
		this.f=f; 
	}
	
	private boolean suspendFlag = false; 
	
	public void mySuspend(){
		suspendFlag=true; 
	}
	
	public synchronized void myResume(){
		suspendFlag=false; 
		notify(); 
	}
	
	public void run(){
		while (true){
			synchronized(this){
				while (suspendFlag)
					try {
						wait();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
				if (c.getX()-1>=0){
					c.setX(c.getX()-1);
					f.repaint();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else{
					mySuspend(); 
					
				}
			}
		}
	}

}
