import java.io.*; 
class Example1{
	public static void main(String[] args) throws IOException{
		/*Instatiate InputStreamReader class and pass System.in to its constructor*/
		InputStreamReader isr=new InputStreamReader(System.in);
		/* instantiate BufferedReader class and pass the reference variable isr 
		 * which id of type InputStreamReader created in the previous line to the 
		 * constructor of BufferedReader */
		BufferedReader br= new BufferedReader(isr); 
		System.out.println("Enter Your First Name: ");
		String name = br.readLine();
		System.out.println("Your name is: " + name);
	}// end of main class
}//end of Example 1
