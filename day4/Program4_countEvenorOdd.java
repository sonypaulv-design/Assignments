package day4;

public class Program4_countEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=2487159; 
int oddcount=0; 
int evencount=0;
		while(num>0)
		{
			if(num%2 == 0)
				evencount++;			
			else
			 oddcount++;
		num=num/10;
			
		}
		System.out.println(evencount+ " evencount"+" oddcount" +oddcount);
		
	}

}
