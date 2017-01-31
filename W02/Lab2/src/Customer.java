
public class Customer {
	private String name;
	private String idNo;
	private double balance;
	private Item iTem;
	public Customer(String name,String idNo,double balance){
		this.name=name;
		this.idNo=idNo;
		this.balance=balance;
	}
	Customer(String name,String idNo){
		this.name=name;
		this.idNo=idNo;
		this.balance=5000;
	}
	public String getName(){
		return (this.name);
	}
	public String getId(){
		return (this.idNo);
	}
	public double getBalance(){
		return (this.balance); 
	}
	public void setName(String name){
		this.name=name; 
	}
	public void setId(String id){
		this.idNo=id; 
	}
	
	public void buyItem(Item item){
		this.iTem=item;
		if (this.balance<this.iTem.getPrice()){
			System.out.println("Insufficient Balance");
		}
		else if (this.iTem.getQuantity()<1){
			System.out.println("Invalid Order");
		}
		else{
			this.balance-=this.iTem.getPrice(); 
			item.setQuantity(this.iTem.getQuantity()-1);	
			System.out.println("Current Balance="+this.balance);
			System.out.println(" Name of item= "+this.iTem.getName()+" id= "+this.iTem.getId()+" updated quantity= "+this.iTem.getQuantity()+" Price= "+this.iTem.getPrice());
		}		
	}
}
