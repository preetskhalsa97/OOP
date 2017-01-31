
public class Item {
	private String itemName;
	private String itemidNo;
	private int itemQuantity;
	private double itemPrice;
	//Constructors
	Item(String name,String no,int q,double p){
		this.itemName=name; 
		this.itemidNo=no; 
		this.itemQuantity=q;
		this.itemPrice=p; 
	}
	Item(String name,String no,int q){
		this.itemName=name; 
		this.itemidNo=no; 
		this.itemQuantity=q;
		this.itemPrice=500;
	}	
	Item(String name,String no){
		this.itemName=name; 
		this.itemidNo=no;
		this.itemQuantity=1;
		this.itemPrice=500; 
	}
	//Accessor Methods 
	public String getName(){
		return (this.itemName);
	}
	public String getId(){
		return (this.itemidNo);
	}
	public int getQuantity(){
		return (this.itemQuantity);
	}
	public double getPrice(){
		return (this.itemPrice);
	}
	//Mutator Methods 
	public void setName(String name){
		this.itemName=name; 
	}
	public void setId(String id){
		this.itemidNo=id; 
	}
	public void setQuantity(int q){
		this.itemQuantity=q;
	}
	public void setPrice(double p){
		this.itemPrice=p; 
	}
}