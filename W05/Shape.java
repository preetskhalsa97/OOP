package ls5;

public class Shape {

	private String color; 
	
	public Shape(String color){
		this.color = color; 
	}
	
	public String toString(){
		return "Shape of color=\"" + color + "\"";
	}
	
	public double getArea() { 
		System.err.println("Shape unknown! Cannot compute area!"); 
		return 0; 
		// Need a return to compile the program 
	}
}