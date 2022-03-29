
public class VariableTypeInJava {
    int b=40;  //instance variable
	int c=70;
	static int d=50;   //static variable 
	
    public static void main(String[] args) {
    	VariableTypeInJava obj1=new VariableTypeInJava();  //object 
    	
    	obj1.add();
    	
    }	
	
	 void add() {
		System.out.println(b+c);
	}
	
	void display1() {
		int a=20;  //local variable 
		System.out.println(a);
		System.out.println(b);
	}
	void display2() {
		int a=20;  //local variable 
		System.out.println(a);
		System.out.println(b);
	}
	
	void print() {
	 System.out.println(b);
	}
	

}
