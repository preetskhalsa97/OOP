import java.lang.*;

class SumDigits{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		int sum=0,temp=n,i=1,k,j; 
		// finding number of digits 
		while (true){
			if ((n/((int)Math.pow(10,i))==0)){
				break; 
			}
			else{
				i++;
			}
		}
		j=i-1; 
		System.out.print("The sum of digits= "); 
		while (j>=0){
			if (j!=i-1){
				System.out.print("+");
			}
			k=n/(int)Math.pow(10,j); 
			n=n%(int)Math.pow(10,j);
			System.out.print(k);
			sum+=k; 
			j-=1;
		}
		System.out.print("="+sum+"\n");
	}
}