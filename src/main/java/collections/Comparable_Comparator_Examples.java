package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable_Comparator_Examples {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("gopal");
		l1.add("rakesh");
		l1.add("kesht");
		List<String> l2 = l1;
		System.out.println("List before sort - " + l1);
		Collections.sort(l1);
		System.out.println("List after sort - " + l1);

		// reverse list
		Collections.sort(l2, new ReverseSortingList());
		System.out.println("List in reverse - Comparator - " + l2);

		// Set<String> s1 = new HashSet<String>(l1);
		// System.out.println("Set before sort - "+s1);
		// Collections.sort();

		Movies m1 = new Movies("Jailer", 5.0);
		Movies m2 = new Movies("Beast", 7.0);
		Movies m3 = new Movies("Doctor", 4.0);

		List<Movies> ml = new ArrayList<Movies>();
		ml.add(m3);
		ml.add(m2);
		ml.add(m1);

		System.out.println("Before sorting movies list = ");
		for (Movies m : ml)
			System.out.println(m.toString());

		Collections.sort(ml);

		System.out.println("After sorting movies list using comparable - ");
		for (Movies m : ml) {
			System.out.println(m.toString());
		}

		Collections.sort(ml, new ReverseSortMoviesByNameRating());

		System.out.println("After reverse sorting movies list using comparator by name - ");
		for (Movies m : ml) {
			System.out.println(m.toString());
		}
		
		Collections.sort(ml,new ReverseSortMoviesByRating());
		
		System.out.println("After reverse sorting movies list using comparator by rating - ");
		for (Movies m : ml) {
			System.out.println(m.toString());
		}

	}

}

class ReverseSortingList implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);

	}
}

class Movies implements Comparable<Movies> {
	private String name;
	private double rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	Movies(String name, double rating) {
		this.name = name;
		this.rating = rating;
	}

	public int compareTo(Movies m) {
		return this.getName().compareTo(m.getName());
	}

	public String toString() {
		return this.getName() + " : " + this.getRating();
	}
}

class ReverseSortMoviesByNameRating implements Comparator<Movies> {

	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}

}

class ReverseSortMoviesByRating implements Comparator<Movies>
{
	public int compare(Movies m1, Movies m2)
	{
		if(m1.getRating() > m2.getRating())
			return -1;
		else if(m1.getRating() < m2.getRating())
			return 1;
		else 
			return 0;
	}
}
