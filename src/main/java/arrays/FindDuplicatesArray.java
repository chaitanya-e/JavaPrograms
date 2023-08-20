package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesArray {
	public static void main(String[] args) {
		int a[] = {1,1,3,4,2};
		Arrays.sort(a);
		Set<Integer> s1 = new HashSet<Integer>();
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				s1.add(a[i]);
			}
		}
		System.out.println("Duplicates are - "+s1);
		
	}
}