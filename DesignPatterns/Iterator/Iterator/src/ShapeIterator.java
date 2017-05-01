import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape>{

	private Shape[] shapes;
	private int index=0; 
	
	
	public  ShapeIterator(Shape[] shapes){
		this.shapes=shapes; 
	}

	@Override
	public boolean hasNext() {
		if (index>shapes.length-1 || shapes[index]==null){
			return false; 
		}
		else{
			return true; 
		}
	}

	@Override
	public Shape next() {
		// TODO Auto-generated method stub
		return shapes[index++];
	}
	
	public void remove(){
		for(int i=index-1;i<shapes.length-1;i++){ // SHOULDN'T THIS BE i=index instead of index-1?!
			shapes[i]=shapes[i+1];
		}
		shapes[shapes.length-1]= null; 
	}
	
}
