package naveen;

public class Sentencereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String S = "sathishkumar ";
//
//		String rev = "";
//
//		String[] temp = S.split("");
//
//		for (int i = temp.length - 1; i >= 0; i--)
//
//		{
//
//			rev = rev + temp[i];
//
//		}
//
//		System.out.println(rev);
//
//	}
		
		
		String S = "the love chennai";
		
		String rev="";
		
		String [] temp = S.split(" ");
		
		for (int i= temp.length-1;i>=0;i--)
		{
			
			rev= rev+temp[i];
		}
		  
		
		System.out.println(rev);
		
		
		
		
	}
}



