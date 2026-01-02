package assignments_methods;

public class Program2_Prime {
	
	static boolean checkPrime(int num)
	{
		//int i=2;
		for(int i=2; i<num;i++)
		{if(num%i==0)
		{
		
			return false;
			
		}
		
			
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean result=checkPrime(15);
System.out.println(result);
	}

}
