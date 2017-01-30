/* Bicycle class */ 

class Bicycle{

    int speed=100; 
    int gears=5; 
    int cad=40; //cadence 

    public void printState(){
	System.out.println("Bicycle [cadence=" + cad + ",number of gears="+gears+",speed="+speed+"]");
    }

    public static void main(String[] args){
	/*Creating instance of Bicycle class*/
	Bicycle b1=new Bicycle(); 
	
	/*Invoking method object b1 of type bicycle*/
	b1.printState(); 
    }
}