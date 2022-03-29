package InterfaceInJava;

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c= new C();
		c.display();
		




	}

}

	interface A{
		final int a=10;
	   void display();

	}


	interface B{
		int a=20;
		void display();

	}

	class C implements B,A{
		@Override
		public void display() {
			System.out.println("Class c display method"+B.a);
			System.out.println("Class c display method"+A.a);
		}
	}




		//class B implements A{
		//	public void display() {
		//		System.out.println("this display method");
		//	}
		//	public void show() {
		//		System.out.println("this is show method");
		//	}
		//
		//class D extends B{
		//	public void display() {
		//		System.out.println("Class D display method");
		//	}
		//	public void show() {
		//		System.out.println("Class D show method");
		//	}




