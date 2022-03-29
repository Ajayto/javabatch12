
public class DemoThis {

	DemoThis(){
		this(10);
		System.out.println("0 args constructor");
	}
	
	DemoThis(int a){
		this(10,20);
	//	DemoThis d=new DemoThis(20,30);
		System.out.println("1 args constructor");
	}
	
	
	DemoThis(int b,int c){
		this(20,30,40);
		System.out.println("2 args constructor");
	}
	DemoThis(int a, int b, int c){
		//this();
		System.out.println("3 args constructor");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoThis dt= new DemoThis();
	}

}
