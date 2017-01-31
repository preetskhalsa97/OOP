
public class Exercise1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int i,sum=0; 
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr); 
		for (i=0;i<10;i++){
			System.out.println("Enter "+(i+1)+"th number");
			String input=br.readLine();
			int num=Integer.parseInt(input); 
			sum+=num; 
		}
		System.out.println("Sum="+sum);
	}
}
