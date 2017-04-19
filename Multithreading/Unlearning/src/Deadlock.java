
public class Deadlock implements Runnable{

	A a = new A();
	B b = new B(); 
	
	Deadlock(){
		Thread.currentThread().setName("Main Thread");
		Thread t = new Thread(this,"Racing Thread"); 
		t.start();
		
		a.foo(b);// get a lock on a in this thread
		System.out.println("Back in main thread");
	}
	
	public void run(){
		b.bar(a); // get lock on b in another thread
		System.out.println("Back in other thread");
	}
	
	public static void main(String[] Args){
		new Deadlock(); 
	}	
}
