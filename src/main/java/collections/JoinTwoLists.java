package collections;

import java.util.ArrayList;

import java.util.List;

public class JoinTwoLists {
public static void main(String[] args) {
	//Join two lists - insertion order is preserved, duplicates are allowed
	List<String> l1 = new ArrayList<String>();
	l1.add("1");
	l1.add("2");
	l1.add("3");
	
	List<String> l2 = new ArrayList<String>();
	l2.add("4");
	l2.add("5");
	l2.add("6");
	
	List<String> l3 = new ArrayList<String>();
	l3.addAll(l2);
	l3.addAll(l1);
	
	System.out.println(l3);
	
}
}
