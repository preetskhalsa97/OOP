import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1; 
		double double1; 
		String numStr1,numStr2;
		/* Instantiate scanner class by passing System.in to its construct. */ 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		num1=in.nextInt(); //reads int from keyboard 
		System.out.println("You entered: " + num1);
		System.out.println("Enter a double: ");
		double1=in.nextDouble();//reads an int from keyboard
		System.out.println("You entered: " + double1);
		System.out.println("Enter your first name ");
		numStr1 = in.next();
		System.out.println("Your name is " + numStr1);
		in.nextLine(); //to consume enter
		System.out.println("Enter your surname");
		numStr2 = in.nextLine();
		System.out.println("Your surname is " + numStr2);
		in.close();		
	} //end of main method
}
