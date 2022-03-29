package pkg1;

public class A {
 private int a=30;
 private void displayA() {
		System.out.println(a);
	}

}

class D{
	void ptintA() {
		A obj= new A();
		obj.displayA();
		System.out.println(obj.a);
	}
}
