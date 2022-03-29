import java.util.Scanner;

public class InnerForlop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of rows");
		Scanner sc= new Scanner(System.in);
		int totalRow=sc.nextInt();
		char ch=126;


		System.out.println(ch);
		for(int row=1;row<=totalRow;row++) {
			for(int sp=1;sp<=totalRow-row;sp++) {
				System.out.print(" ");
			}
			for(int st=1;st<=row;st++) {
				System.out.print(ch);
				ch=(char) (ch+1);
			}
			System.out.println();
		}

	}

}
