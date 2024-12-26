package naveen;

public class Averagevalueofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a [] = {1,2,3,4,5,5,};
		
		int value = 0;
		
		for (int i= 0; i<a.length;i++)
		{
			
			value = value+a[i];
			
			
		}
		System.out.println(value/a.length);

	}

}
