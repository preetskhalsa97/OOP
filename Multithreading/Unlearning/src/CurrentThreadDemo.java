
public class CurrentThreadDemo {

	public static void main(String[] Args){
		Thread t = Thread.currentThread();
		System.out.println("Current Thread: "+t);
		
		// change the name 
		
		t.setName("MyThread");
		
		System.out.println("Name changed to "+t);
		
		try{
			for (int n=5;n>0;n--){
				System.out.println(n);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e){
			System.out.println("Main thread interrupted");
		}
	
	
	}
}
