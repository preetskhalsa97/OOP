
public class RetailStore {
	private int[] itemId={1001,1002,1003,1004,1005};
	private double[] price={13.50, 18.00, 19.50, 25.50};
	private double computePrice(int value){
		int i; 
		for (i=0;i<(itemId.length);i++){
			if (itemId[i]==value){
				break;
			}
		}
		return price[i]; 
	}
	
	
	public static void main (String[] args){
		RetailStore retailOne=new RetailStore(); 
		// print out price of various ids using computePrice method of retailOne object
	
	}
	
}
