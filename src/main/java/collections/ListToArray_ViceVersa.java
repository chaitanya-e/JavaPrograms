package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray_ViceVersa {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("1");
		l1.add("2");
		l1.add("3");

		// default conversion is into object
		Object s[] = l1.toArray();
		System.out.println(Arrays.toString(s));

		String s1[] = new String[l1.size()];
		l1.toArray(s1);
		System.out.println(Arrays.toString(s1));

		// asList -> shows array as list - does not create new list object, only view is
		// shown
		// therefore we explicitly create new list object
		List<Object> l2 = new ArrayList<Object>(Arrays.asList(s));
		System.out.println(l2.toString());
	}
}
