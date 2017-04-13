
public class ThreadB extends Thread{

	int total=0;
	public void run(){
		synchronized(this){
		System.out.println("child thread starts calculation");
		for (int i=1;i<=100;i++){
			total=total+i;
		}
		System.out.println("Child thread trying to notify main thread");
		this.notify();
		}
	}
}
