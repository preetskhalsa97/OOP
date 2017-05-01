
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape rect = new Shape(1,"Rectangle"); 
		Shape sq = new Shape(2,"Square"); 
		Shape c  = new Shape(3,"Circle"); 
		Shape t = new Shape(4,"Triangle"); 
		
		ShapeStorage shapeStorage = new ShapeStorage();
		
		shapeStorage.add(rect);  
		shapeStorage.add(sq);
		shapeStorage.add(c);
		shapeStorage.add(t);
		
		// creating an iterator to iterate through the collection shapeStorage
		
		ShapeIterator iterator = new ShapeIterator(shapeStorage.getShapes());
		
		while (iterator.hasNext()){
			System.out.println(iterator.next());
			iterator.remove();
		}
		
		
		
	}

}
