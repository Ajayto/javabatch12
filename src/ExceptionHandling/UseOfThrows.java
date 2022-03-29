package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UseOfThrows {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		UseOfThrows u= new UseOfThrows();
		u.m1();
	}

	void m1() throws FileNotFoundException {
		readfile();
	}

	void readfile() throws FileNotFoundException{		
		FileInputStream fs= new FileInputStream("C:\\Users\\Ajay\\Desktop\\javaProg\\Demo.java");

	}


}
