
public class MyStatic {
	
	int a; //initialized to 0
	static int b; //initialized to zero when the class is created, not when each obj is created 
	//constructor incrementing static variable b each time an object is created
	MyStatic(){
		b++; 
	}
	public void showData(){
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	/*
	 * public static void increment(){
	 *     a++; 
	 * 
	 * } //==> COMPILATION ERROR!!
	 */
	
}
class StaticDemo{
	public static void main(String[] args){
		MyStatic s1=new MyStatic();
		s1.showData();
		MyStatic s2=new MyStatic();
		s2.showData();
		MyStatic.b++; 
		s1.showData();
	}
}
