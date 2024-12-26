package code.java.selenium;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 234516;
		
		
		
		while(num>0)
		{
			
		int rev =num %10;
			
			System.out.println(rev);
			num = num/10;
		}

	}

}
