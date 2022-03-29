package UseOfSuper;

public class DemoSupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}
}
class A{
	A(){
		System.out.println("A class 0 args constructor");
	}
	A(int a){
		System.out.println("A class 1 args constructor");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("B class 0 args constructor");
		
	}
	B(int a){
		
		System.out.println("B class 1 args constructor");
	}
}
class C extends B{
	C(){
		super();
		System.out.println("C class 0 args constructor");
	}
}
class D extands C{
System.out.println("this is to test git local")
}
