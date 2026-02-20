package otherDS;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// Set - does not allow duplicate values, and it has no indexing
		// interface - Set
		// Classes inherits Set - HashSet, TreeSet, LinkedHashSet
		// HashSet - fast and unordered
		// TreeSet - sorted set, slower than HashSet
		// LinkedHashSet - ordered by insertion

		HashSet<String> browsers = new HashSet<String>();
		browsers.add("Chrome");
		browsers.add("Firefox");
		browsers.add("Edge");
		browsers.add("Edge");

		for (String s : browsers) {
			System.out.println(s);
		}
		
	}
}