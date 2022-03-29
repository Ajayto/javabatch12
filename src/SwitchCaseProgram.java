import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=40;
		System.out.println("enter your option");
		Scanner sc= new Scanner(System.in);
        int option=sc.nextInt();
		switch (option) {
		case 1: {

			int c= a+b;
			System.out.println(c);
			//break;
		}
		case 2: {
			int c= a-b;
			System.out.println(c);
			//break;
		}
		case 3: {

			int c= a*b;
			System.out.println(c);
			break;
		}
		case 4: {

			int c= a/b;
			System.out.println(c);
			break;
		}
		default:
			System.out.println(" enter valid option betn 1 to 4 ");
		}

	}

}
