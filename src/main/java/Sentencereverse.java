
public class Sentencereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "janani ryan";
		
		
		String sh []=S.split(" ");
		
		String rev ="";
		
		for(int i=sh.length-1;i>=0;i--)
		{
		rev= rev+sh[i]+" ";
		}

		System.out.println(rev);
	}

}
