package assignments_methods;

public class Program1_Fibonacci {

	static void fibonacci(int n)
	{ 
	int firstnum=0; int secondnum=1;
	int count=0;
	while(count<n)
	{  
		
		System.out.print(firstnum+" ");//0
		int temp=firstnum;//0,1
		firstnum=secondnum;//1,2
		
		secondnum=temp+firstnum;//1,3
		
		
		count++;//1
		
	}
	System.out.println();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		fibonacci(7);
		fibonacci(15);
	}

}
