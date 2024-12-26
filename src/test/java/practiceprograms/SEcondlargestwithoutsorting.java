package practiceprograms;

public class SEcondlargestwithoutsorting {

	public static void main(String[] args) {
		
		int a [] = {1,5,6,7,88,};
		
		int max =a[0];
		
		
		for (int i =0;i <=a.length-1;i++)
		{
		
			if(a[i]>max)
			{
				
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
