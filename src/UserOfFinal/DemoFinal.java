package UserOfFinal;

public class DemoFinal {
	final int b;
	 static final int c;
	{
		b=40;
	     System.out.println("instance block B="+b);
	}
	
	static{
	c=40;	
	System.out.println("Static block c="+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoFinal d= new DemoFinal();
		DemoFinal d1= new DemoFinal();
		DemoFinal d2= new DemoFinal();
		
	}

}

