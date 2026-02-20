package otherDS;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// Map - stores element in key-value format
		// interface - Map
		// Classes inherits Map - HashMap, TreeMap, LinkedHashMap
		// HashMap - fast and unordered
		// TreeMap - sorted by key, slower than HashMap
		// LinkedHashMap - ordered by insertion

		HashMap<Integer,String> studentDetails = new HashMap<Integer,String>();
		studentDetails.put(1, "Anand");
		studentDetails.put(2, "Ashwin");
		studentDetails.put(3, "Arun");
		studentDetails.put(4, "Bijay");
		
		System.out.println("========= Printing keys =========");
		for(int i: studentDetails.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("========= Printing values =========");
		for(String s: studentDetails.values()) {
			System.out.println(s);
		}
		
		System.out.println("========= Printing key and values =========");
		for(int i: studentDetails.keySet()) {
			System.out.println("For key: " + i + " value is " + studentDetails.get(i));
		}
		
		studentDetails.remove(2);
		studentDetails.put(5, "Bijay");
		
		System.out.println("========= Updated key and values =========");
		for(int i: studentDetails.keySet()) {
			System.out.println("For key: " + i + " value is " + studentDetails.get(i));
		}
	}

}
