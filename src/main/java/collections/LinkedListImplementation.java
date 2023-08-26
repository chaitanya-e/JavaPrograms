package collections;

public class LinkedListImplementation {
	public static void main(String[] args) {
		
	}
}

class LinkedListClass
{
	String data;
	LinkedListClass nextPointer;
	
	LinkedListClass(String data)
	{
		this.data = data;
		
	}
	
	int size()
	{
		LinkedListClass ref = this;
		int counter=0;
		while(ref!=null)
		{
			counter++;
			ref = this.nextPointer;
		}
		return counter;
	}
}

