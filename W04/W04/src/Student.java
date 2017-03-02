
public class Student {
	private Name name; 
	private int age; 
	Student (Name n,int a){
		this.name=n;
		this.age=a; 
	}
	public Name getName(){
		return this.name; 
	}
	public int getAge(){
		return this.age; 
	}
	public String toString(){
		return this.name.getName()+" "+this.age; 
	}
	

}