package CollectionInJava;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al2= new ArrayList();
		al2.add("Tom");
		al2.add("C#");
		al2.add(75.75);
		
		
		LinkedList ll= new LinkedList();
		ll.add(10);
		ll.add(30.34);
		ll.add("java");
		ll.add("java");
		ll.add(null);
		ll.add(10);
		System.out.println(ll);
		ll.add(3,30);
		System.out.println(ll);
		ll.addAll(al2);
		System.out.println(ll);
		ll.addAll(5, al2);
		System.out.println(ll);
		System.out.println(ll.get(5));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		//ll.clear();
		System.out.println(ll);
		//ll.contains(ll.contains("java"));
		System.out.println(ll.contains("java"));
		System.out.println(ll.containsAll(al2));
		ll.add("C#");
		ll.removeAll(al2);
		System.out.println(ll);
		
		ll.remove("java");
		System.out.println(ll);
		
		
	}

}
