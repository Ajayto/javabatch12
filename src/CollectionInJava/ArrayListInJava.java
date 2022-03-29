package CollectionInJava;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v= new Vector<>();
		v.add(10);
		v.add("java");
		v.add(20.44);
		v.add('c');
		v.add(null);
		
		System.out.println(v);
		
		
		
		
		ArrayList al2= new ArrayList();
		al2.add("Tom");
		al2.add("C#");
		al2.add(75.75);
		
		
		ArrayList al= new ArrayList();
		al.add(10);
		al.add("Ajay");
		al.add("Java");
		al.add("Tom");
		al.add("ScriptQA");
		al.add(10);
		al.add(10.30f);
		al.add("Tom");
		al.add("C#");
		al.add(75.75);
		al.set(2,"PHP");
		al.add("Tom");
		System.out.println(al.indexOf("Tom"));
		
		 
		 System.out.println(al);
		
		//System.out.println(al.lastIndexOf(10));
	   
		
		
		 ArrayList al3= new ArrayList();
			al3.add("Tom");
			al3.add("C#");
			al3.add(75.75);
			
		
		
		
		
		
		
		
		
		
	    //System.out.println(al.get(2));
//	   al.add(1, 20.20f);
//	   al.addAll(2,al2);
//	   al2.add(3456789);
//	   System.out.println(al2);
//	   System.out.println(al);
//	   System.out.println(al.containsAll(al2));
	   
		

	}

}
