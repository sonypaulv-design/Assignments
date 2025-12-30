package day4;

public class Program3_CountofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12345789;
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
			
			
		}
		System.out.println(count);
	}

}
