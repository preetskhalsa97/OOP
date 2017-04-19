
public class DemoJoin {

	public static void main(String[] Args){
		
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		NewThread ob3 = new NewThread("Three");
		
		System.out.println("Thread One is alive? "+ob1.t.isAlive());
		System.out.println("Thread Two is alive? "+ob2.t.isAlive());
		System.out.println("Thread Three is alive? "+ob3.t.isAlive());
		
		//wait for threads to finish
		
		try{
			System.out.println("waiting for threads to finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch (InterruptedException e){
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Thread One is alive? "+ob1.t.isAlive());
		System.out.println("Thread Two is alive? "+ob2.t.isAlive());
		System.out.println("Thread Three is alive? "+ob3.t.isAlive());
		
		System.out.println("Main Thread Exiting");	
	}
}