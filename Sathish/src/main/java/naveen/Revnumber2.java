package naveen;

public class Revnumber2 {
	
	public static void test(int number)
	{
		
	if (number<10)
	{
		
		System.out.println(number);
		
		return;
		
	}
		
		else
		{
			System.out.print(number%10);
			test(number/10);
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test(123);

	}

}
