import java.util.ArrayList;
import java.util.List; 


interface Component{
	public void showPrice(); 	
}


class Leaf implements Component{
	
	int price; 
	String name; 
	
	public Leaf(int price,String name){
		super();
		this.price = price; 
		this.name = name; 
	}
	
	
	public void showPrice(){
	
		System.out.println(name + " costs  $"+price);
	}
	
}

class Composite implements Component{
	
	List<Component>  components = new ArrayList<Component>();   
	String name; 
	
	public Composite(String name){
		this.name=name; 
	}
	
	public void addComponent(Component c){
		components.add(c); 
		
	}
	
	public void showPrice(){
		
		System.out.println(name);
		for (Component c: components){
			c.showPrice(); 
		}
		
	}
	
}