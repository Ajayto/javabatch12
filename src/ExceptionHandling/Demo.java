package ExceptionHandling;

import java.io.FileNotFoundException;

public class Demo {
void m2() {
	UseOfThrows t= new UseOfThrows();
			try {
				t.readfile();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}
