// static implementation should not exceed 64K
public class StaticExample {
	
	static{
		System.out.println("first static block");
	}
	public StaticExample(){
		System.out.println("This is the constructor"); 
	}
	public static String staticString="Static Variable"; 
	static{
		System.out.println("This is the second static block and "+staticString); 
	}
	public static void main(String[] args){
		StaticExample statEx=new StaticExample(); 
		StaticExample.staticMethod2(); 
	}
	static{
		staticMethod();
		System.out.println("This is third static block");
	}
	public static void staticMethod() {
		System.out.println("This is static method");
	}
	public static void staticMethod2() {
		System.out.println("This is static method2");
	}	
}