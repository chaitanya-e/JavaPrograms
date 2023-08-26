package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCustomArrayList {
	public static void main(String[] args) {
		CustomClass c1 = new CustomClass("japan");
		CustomClass c2 = new CustomClass("korea");
		CustomClass c3 = new CustomClass("china");
		List<CustomClass> al = new ArrayList<CustomClass>();
		al.add(c3);
		al.add(c2);
		al.add(c1);

		al.forEach((customclassobj) -> System.out.println(customclassobj.toString()));
		
		//Collections.sort(al,new CustomClassObjSorter());
		Collections.sort(al, (CustomClassObj1, CustomClassObj2) -> {
			return CustomClassObj1.getCustomPorperty().compareTo(CustomClassObj2.getCustomPorperty());
				});
		
		al.forEach((customclassobj) -> System.out.println(customclassobj.toString()));
	}
}

class CustomClassObjSorter implements Comparator<CustomClass> {
	public int compare(CustomClass c1, CustomClass c2) {
		return c1.getCustomPorperty().compareTo(c2.getCustomPorperty());
	}
}

class CustomClass {
	String customPorperty;

	CustomClass(String propval) {
		this.customPorperty = propval;
	}

	public String getCustomPorperty() {
		return customPorperty;
	}

	public void setCustomPorperty(String customPorperty) {
		this.customPorperty = customPorperty;
	}

	public String toString() {
		return this.customPorperty;
	}
}
