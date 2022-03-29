
public class VariableType {
    int a=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableDemo.m1();
		//VariableDemo.m2();
		System.out.println(VariableDemo.b);

	}
    
    void m3() {
    	
    }

}

class VariableDemo{
    int a=20;
	static int b=30;
	static void m1() {
		//System.out.println(a);
		VariableDemo v= new VariableDemo();
		System.out.println("a="+v.a);
		System.out.println("b="+b);
		System.out.println("this is static method ");
		v.m2();
	}
 void m2() {
	    m1();
	    System.out.println(b);
		System.out.println("this is instance method ");
	}
}
