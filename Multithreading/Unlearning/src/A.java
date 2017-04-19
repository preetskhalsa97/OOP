
public class A {

	synchronized void foo(B b){
		String name = Thread.currentThread().getName(); 
		System.out.println(name+" entered A.foo");
		
		try{
			Thread.sleep(1000);
		}catch (Exception e){
			
		}
	}
	
	synchronized void last(){
		System.out.println("Inside A.last()");
	}
}
