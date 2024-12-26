package practiceprograms;

public class Minvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {5,6,9,3};
		
		int min= Integer.MAX_VALUE;
		
		
		for (int i=0;i<a.length;i++)
		{
			
		if( a[i]<min);{
			min=a[i];
		}
		
		
		}
System.out.println(min);
	}

}
