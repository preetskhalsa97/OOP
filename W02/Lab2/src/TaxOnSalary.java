import java.util.Scanner;

public class TaxOnSalary {
	private boolean isPanSubmitted;
	private double salary;
	TaxOnSalary(boolean variable_pan){
		this.isPanSubmitted=variable_pan;
		this.salary=1000.0;				
	}
	TaxOnSalary(){
		this.isPanSubmitted=false; 
		this.salary=0.0;
	}
	public boolean getPan(){
		return this.isPanSubmitted;
	}
	public double getSalary(){
		return this.salary;
	}
	public double calculateTax(){
		if (this.salary<180000 && this.isPanSubmitted==true){
			return 0.0; 
		}
		if (this.salary<180000 && this.isPanSubmitted==false){
			return (0.05*this.salary); 
		}
		if (this.salary>180000 && this.salary<500000){
			return (0.1*this.salary);
		}
		if (this.salary>500000 && this.salary<1000000){
			return (0.2*this.salary); 
		}
		else {
			return (0.3*this.salary); 
		}		
	}
	public void inputSalary(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter salary");
		double salary_input=in.nextDouble();
		this.salary=salary_input; 
		in.close();
	}
}
