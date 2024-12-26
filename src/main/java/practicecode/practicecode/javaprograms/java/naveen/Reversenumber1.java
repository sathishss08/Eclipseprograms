package naveen;

public class Reversenumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int givennumber =134343;
//		
//		int rev =0;
//		
//		
//		
//		while(givennumber !=0) {
//			
//			rev = rev*10;
//		
//		rev= rev+givennumber%10;
//		
//		givennumber= givennumber/10;
//		
//		
//		}
//		
//		System.out.println(rev);
		
		
		int givennumber = 545;
		
		int rev= 0;
		while(givennumber !=0)
			
		{
			rev = rev*10;
			rev = rev+givennumber%10;
			givennumber = givennumber/10;
		}
		System.out.println(rev);
				}

}
