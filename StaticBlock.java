
public class StaticBlock {

	//DEFINING AN ARRAY IN JAVA 
	static int values[]=initializeArray(10); 
	private static int[] initializeArray(int n){
		int[]arr=new int[n]; 
		for (int i = 0; i < arr.length; i++) {
			arr [i] = i;
		}
		return arr;
	}
	
	void listValues(){
		for (int value:values){
			System.out.println(value);
		}
	}
	
	public static void main(String[] args){
		StaticBlock example=new StaticBlock();
		System.out.println("\nFirst object:");
		example.listValues();
		values[0]=values[4]=100;
		example = new StaticBlock();
		System.out.println("\nSecond object:");
		example.listValues();
	}
}