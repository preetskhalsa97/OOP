
public class StudentList {
	public static Student[] list = new Student[10]; 
	public static int count=0; 
	public static void addStudent(Student s){
		if (count>=20){
			return;
		}
		list[count]=s;
		count++; 
	}
	
	public static Student[] getStudentsWithAge(int age){
		int n=0; // number of students with that age 
		for (int i=0;i<list.length;i++){
			// count the number of students with the required age
			if (list[i].getAge()==age){
				n++; 
			}
		}
		if (n==0){
			return null; 
		}
		else{
			Student[] arr = new Student[n]; 
			int counter=0;
			int j=0; 
			while (counter<n){
				if (list[j].getAge()==age){
					arr[counter]=list[j];
					counter++; 
				}				
				j++; 
			}
			return arr; 
		}
	}
	
	public static Student[] getStudentsWithLastName(String lastName){
		int n=0; // number of students with that last name 
		for (int i=0;i<list.length;i++){
			if (list[i].getName().getLname()==lastName){
				n++; 
			}
		}
		if (n==0){
			return null; 
		}
		else{
			Student[] arr = new Student[n]; 
			int counter=0;
			int j=0; 
			while (counter<n){
				if (list[j].getName().getLname()==lastName){
					arr[counter]=list[j];
					counter++; 
				}				
				j++; 
			}
			return arr; 
		}		
	}
	
	public static Student[] getStudentsInRange(int minAge,int maxAge){
		int n=0; 
		for (int i=0;i<list.length;i++){
			if(list[i].getAge()>=minAge && list[i].getAge()<=maxAge){
				n++; 
			}
		}
		if (n==0){
			return null; 
		}
		else{
			int j=0;
			int counter=0; 
			Student[] arr = new Student[n]; 
			while (counter<n){
				if (list[j].getAge()>=minAge && list[j].getAge()<=maxAge){
					arr[counter]=list[j]; 
					counter++; 
				}				
				j++; 
			}
			return arr; 
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
