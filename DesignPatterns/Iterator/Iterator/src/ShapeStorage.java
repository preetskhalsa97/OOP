
public class ShapeStorage {

	private Shape[] shapes = new Shape[4]; 
	
	private int index = 0;
	
	public void add(Shape s){
		shapes[index++]=s; 
		
	}
	
	public Shape[] getShapes(){
		return this.shapes; 
	}
	
}