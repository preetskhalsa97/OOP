import javax.swing.JFrame;

public class ScaleDownThread extends Thread{
	
	int min=5;
	CircleIcon c;
	JFrame f; 
	ScaleDownThread(JFrame f,CircleIcon c){
		this.c=c; 
		this.f=f; 
	}
	
	public void run(){
		while (true){
			
			synchronized(c){
				while (OnlineMain.scaleDownThreadRunning){
					if (c.getRadius()-1>=min){
						c.setRadius(c.getRadius()-1);
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
