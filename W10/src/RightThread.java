import javax.swing.JFrame;

public class RightThread extends Thread{
	CircleIcon c;
	
	JFrame f; 
	
	RightThread(JFrame f,CircleIcon c){
		this.c=c;
		
		this.f=f;
	}
	
	public void run(){
		synchronized(c){
			while (true){
				while (OnlineMain.rightThreadRunning){
					if ((c.getX()+c.getRadius()+1<=600)){
						c.setX(c.getX()+1);
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
