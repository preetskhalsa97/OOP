package ls5;

public class Ex3Test {
	
	
}

class A { public int a =100;} // End of class A
class B extends A { public int a =80; } // End of class B
class C extends B { public int a =60; } // End of class C
class D extends C { public int a =40; } // End of class D
// NOTE : The variable named ‘a’ is used in above classes is the instance field of each class
class E extends D
{
public int a =10;
public void show()
{
int a =0;
// Write Java statements to display the values of
// all a’s used in this file on System.out
	System.out.println("Class A, a = "+new A().a+"\nClass B, a ="+new B().a+"\nClass C, a ="+new C().a+"\nClass D, a ="+new D().a);
} // End of show() Method
// We can also use ((A)this).a instead of new A().a 
}// End of class E