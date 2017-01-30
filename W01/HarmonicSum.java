public class HarmonicSum{
	public static void main(String[] args){
		int max_number=50000,i; 
		double l2r=0.0,r2l=0.0,diff;
		//computing l2r 
		for (i=1;i<=max_number;i++){
			l2r+=(double)1/(double)i;
		}
		//computing r2l
		for (i=max_number;i>0;i++){
			r2l+=(double)1/(double)i;
		}
		diff=r2l-l2r; 
		if (diff>0){
			System.out.println("r2l>l2r; diff="+diff); 
		}		
		else{
			System.out.println("r2l<l2r; diff="+((-1)*diff); 
		}
		//WHY IS THERE A DIFFERENCE THOUGH?! 
		// use BigDecimal for absolute accuracy- http://stackoverflow.com/questions/322749/retain-precision-with-double-in-java
	}
}