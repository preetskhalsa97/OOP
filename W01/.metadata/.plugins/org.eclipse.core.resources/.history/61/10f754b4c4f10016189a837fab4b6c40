
public class Circle {

	static double PI; 
	public double radius; 
	Circle(double radius){
		this.radius=radius; 
	}
	//accessor method 
	public double getRadius(){
		return this.radius;
	}
	public void setRadius(double radius){
		this.radius=radius; 
	}
	//method to find area
	public void area(){
		System.out.println(PI*this.radius*this.radius);
	}
	//static methods aren't instance specific
	public static void circumference(double radius){
		System.out.println(2*PI*radius); //here radius-> local variable
	}
}

class TestCircle{
	public static void main(String[] args){
		Circle c1= new Circle(2.3); 
		c1.area();
		Circle c2 = new Circle(3.45);
		c2.area();
		Circle.circumference (3.45);
		
	}
}
