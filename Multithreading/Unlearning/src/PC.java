
public class PC {
	
	public static void main(String[] Args){
		
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		
		}
	
}