package arrays;

public class CompareArrays {
	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[] = {10,20,3};
		boolean isequalflag=true;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					
					isequalflag=false;
					break;
				}
			}
		}
		else
			isequalflag=false;
		
		if(isequalflag)
			System.out.println("Equal arrays");
		else
			System.out.println("Unequal");
		
		
	}
}
