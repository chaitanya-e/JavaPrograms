package arrays;

public class ArrayIntersection {
	public static void main(String[] args) {
		int a1[]= {10,20,30,40,50};
		int a2[]= {30,40,60,70};
		
		for(int a:a1)
		{
			for(int b:a2)
			{
				if(a==b)
				{
					System.out.println("common - "+a);
					break;
				}
			}
		}
	}
}
