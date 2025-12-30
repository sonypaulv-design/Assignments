package day1;

public class Program5_DataTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//downcasting
		long phonenumber=456798912233L;
		int phonenumberLong=(int)phonenumber;
		System.out.println(phonenumberLong);
		
		float hight=162.3F;	
		int hightInt=(int)hight;
		System.out.println(hightInt);
		//upcasting
		int age=32;
		float ageFloat=age;
		System.out.println(ageFloat);

	}

}
