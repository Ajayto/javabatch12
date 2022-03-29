package CollectionInJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map=new HashMap();
		map.put("1001", "Tom");
		map.put("Al-1002", "Ajay");
		map.put("abc", "Amit");
		map.put("1005", "java");
		map.put("1001", "ScriptQA");
		map.put("1009", "ScriptQA");
		map.put(null, "abc");
		System.out.println(map);
		
//		for(Map.Entry entry: map.entrySet()) {
//			System.out.print("Key= "+entry.getKey());
//			System.out.print(" Value ="+entry.getValue());
//			System.out.println();
//		}
		
		for(Object id:map.keySet()) {
			System.out.println("id= "+id+ "  value="+map.get(id));
			
		}
		
		for(Object name:map.values()) {
			System.out.println(name);
		}
		

	}

}
