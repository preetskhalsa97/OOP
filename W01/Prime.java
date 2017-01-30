import java.lang.*;

class Prime{
	public static void main (String[] args){
		int n=Integer.parseInt(args[0]);// assuming n>1
		int i=2,count=0,j,test; 
		while (count<n){
			test=1;
			for (j=2;j<=(int)Math.sqrt(i);j++){
				if (i%j==0){
					test=0;
					break;
				}
			}
			if (test==1){
				count++;
			}
			i++; 
		}
	System.out.println(i-1);
	}
}