package arrays;

public class SecondLargestNumArr {
	public static void main(String[] args) {
		int a[]= {41,41,41,34,56,76,70};
		
		//nth largest
		int fl = a[0];
		int sl = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fl)
			{
				sl=fl;
				fl = a[i];
			}
			else if(a[i]>sl && a[i]<fl)
				sl=a[i];
		}
		if(fl==sl)
			System.out.println("No second largest");
		else
			System.out.println("Second largest = "+sl);
	}
}
