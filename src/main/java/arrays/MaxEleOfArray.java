package arrays;

import java.util.Arrays;

public class MaxEleOfArray {
	public static void main(String[] args) {
		int a[]= {12,1,1,3,99,76};
		int max=a[0];
		for(int i:a)
		{
			if(i>max)
				max=i;
		}
		
		System.out.println("Largest = "+max);
		
		Arrays.sort(a);
		System.out.println("Largest = "+a[a.length-1]);
	}
}
