
public class Caller implements Runnable{

	String msg; 
	Thread t; 
	Callme target; 
	
	Caller(Callme target,String msg){
		
		this.target=target; 
		this.msg=msg; 
		this.t = new Thread(this); 
		t.start();
	}
	
	public void run(){
		target.call(msg);
	}
	
}
