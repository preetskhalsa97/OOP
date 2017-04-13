
public class SyncDemoTest {

	public static void main(String[] args) {
		Display d1= new Display(); 
		Display d2= new Display();
		MyThreadSync t1 = new MyThreadSync(d1,"Dhoni");
		MyThreadSync t2 = new MyThreadSync(d2,"Kohli");
		t1.start();
		t2.start();
		

	}

}
