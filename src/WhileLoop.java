
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long a=44444444477777l;
		long number=2345678934567777997l;   //init
		long rem=0;
		while(number>0) {
			rem=number%10;
			System.out.print(rem);
			number=number/10;
		}

	}

}
