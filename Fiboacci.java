class Fiboacci{
    public static void main(String[] args){
	int n=Integer.parseInt(args[0]); //Assuming n>0
	int start=1,add=0,sum=0,temp; 
	System.out.println("The first "+n+" Fibonacci numbers are:"); 
	for (int i=1;i<=n;i++){
	    System.out.print(start+" "); 
	    sum+=start; 
	    temp=start; 
            start+=add; 
	    add=temp; 
	}
	System.out.print("\n");
	float avg=(float)sum/n;
	System.out.println("The average is "+avg);
    }
}