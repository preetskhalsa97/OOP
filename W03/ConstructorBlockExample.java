// constructor block is copied into each constructor of the class 
public class ConstructorBlockExample {

	{System.out.println("first constructor block"); }
	public ConstructorBlockExample(){
		System.out.println("this construct has no parameter");
	}
	public ConstructorBlockExample(String param1){
		System.out.println("this construct has one parameter");
	}
	{ System.out.println("This is second constructor block"); }
	public static void main(String[] args){
		ConstructorBlockExample constrBlockEx =new ConstructorBlockExample();
		ConstructorBlockExample constrBlockEx1 =new ConstructorBlockExample("param1");
	}
}