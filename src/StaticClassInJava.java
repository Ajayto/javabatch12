
public class StaticClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticClassInJava.inner.printMessage();
	}
	
	static class inner{
		static void printMessage() {
         System.out.println("This is static inner class");
		}
	}

}

