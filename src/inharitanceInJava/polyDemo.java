package inharitanceInJava;

public class polyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polyDemo p=new polyDemo();
		System.out.println(p.add(20, 40));
		System.out.println(p.add(20f, 30));
		System.out.println(p.add(10, 20, 30, 20));
	}
	
	int add(int a,int b) {
		return a+b;
	}
	float add(int a,float b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}

}
