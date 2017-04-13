
public class ThreadA {

	public static void main(String[] Args) throws InterruptedException{
		ThreadB b = new ThreadB();
		b.start();
		synchronized(b){
		System.out.println("Main thread trying to call wait method");
		b.wait();
		System.out.println("Main thread got notified");
		System.out.println(b.total);
		}
		
		// now, main thread is expecting updation, child thread has to perform updation
		}
}