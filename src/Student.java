
public class Student {
	String name;
	int rollNumber;
	String address;
	Student(String name,int rollNumber,String address){
		this.name=name;
		this.rollNumber=rollNumber;
		this.address=address;
	}
	
	void StudentInfo() {
		System.out.println("Name="+name);
		System.out.println("rollNumber="+rollNumber);
		System.out.println("address="+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ajay= new Student("Ajay",1001,"pune");
		ajay.StudentInfo();
		Student tom= new Student("tom",1032,"uk");
		tom.StudentInfo();
		
	}

}
