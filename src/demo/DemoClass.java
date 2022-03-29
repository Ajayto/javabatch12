package demo;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass.A.m1();
	}
	

}
 class A{
	static void m1() {
		System.out.println("m1");
	}
}
 class B extends  A{
	 static class C{
		 static void m3(){
			 System.out.println("M1");
		 }
	 }
 }

