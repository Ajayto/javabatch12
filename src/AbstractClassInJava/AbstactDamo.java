package AbstractClassInJava;

abstract public class AbstactDamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	A.display();
//		B b= new B();
//		b.display();
//		b.show();
//		b.print();
	}



}

abstract class A{
	A(){
		System.out.println("This is consturctor of class A");
	}
	 void display() {
		System.out.println("class A display method");
	}
	abstract void show();
	abstract void print();
}
class B extends A{
	void show() {
		System.out.println("Class B show method"); 
	}
	void print() {
		System.out.println("this is show method");
	}
}
