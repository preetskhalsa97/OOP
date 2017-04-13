
public class RunnableDemo {

	public static void main(){
		MyRunnable r = new MyRunnable(); 
		Thread t = new Thread(r); 
		t.start(); 
	}
}

