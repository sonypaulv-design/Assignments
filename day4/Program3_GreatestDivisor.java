package assignments_methods;

public class Program3_GreatestDivisor {
	
	static void findGCD(int a,int b)
	{
		int n=1;int num1=0; int gcd=1;
		if (a>b)
			num1=b;
			else
				num1=a;
	
		while(n<=num1) {
		
			if(a%n==0 && b%n==0)
		
				gcd=n;
		
		n++;}
		System.out.print("gcd is "+gcd);
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findGCD(88,44);

	}

}
