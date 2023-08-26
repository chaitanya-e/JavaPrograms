package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayToSet_ViceVersa {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("4");
		
		System.out.println("Arraylist - "+al);
		Set<String> s = new HashSet<String>(al);
		System.out.println("Set from AL - "+s);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.addAll(s);
		System.out.println("ArrayList from Set - "+al2);
		
		String[] sa = {"a","b","c","c","d"};
		Set<String> sfa = new HashSet<String>(Arrays.asList(sa));
		System.out.println("Array to Set - " + sfa);
	}

}
