import java.util.Arrays;

public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a [] = {2,6,4,1,38};
		
		
		int temp= 0;
		
		for(int i =0;i<a.length;i++)
		{
			
			for(int j=0 ;j<a.length-1-i;j++)
			{
				
				if(a[j]>a[j+1])
				{
					temp=a[j];
					
					a[j]=a[j+1];
					
					a[j+1]=temp;
				
				}
			}
		}
		System.out.println((Arrays.toString(a)));

	}

}
