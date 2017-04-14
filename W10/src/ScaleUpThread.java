import javax.swing.JFrame;

public class ScaleUpThread extends Thread {

	int max=50; 
	CircleIcon c; 
	JFrame f; 
	
	
	ScaleUpThread(JFrame f, CircleIcon c){
		this.f=f;
		this.c=c;
	}
	
	public void run(){
		while (true){
			synchronized(c){
				
				while (OnlineMain.scaleUpThreadRunning){
					if (c.getRadius()+1<=max && c.getX()+c.getRadius()+1<=600){
						c.setRadius(1+c.getRadius());
						f.repaint();
						try {
							c.wait(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
					}
					else{
						c.notifyAll();
						try {
							c.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
					}				
				}	
			}
		}		
	}
	}
}

