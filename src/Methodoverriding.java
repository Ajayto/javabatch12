
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login capOne= new Login();
		capOne.loginApp(10);
		System.out.println("---------------------------------------");
		NewLogin city=new NewLogin();
		city.loginApp(20);
	}

}

class Login {
protected int loginApp(int a) {
		System.out.println("Enter user name");
		System.out.println("Enter Password");
		System.out.println("Click submit button");
		return ;
	}
}
class NewLogin extends Login{
 public int loginApp(int b) {
		System.out.println("Enter user name");
		System.out.println("Enter Password");
		System.out.println("Enter phone number");
		System.out.println("Click submit button");
		return 2;
		
	}
}
