package naveen;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] a = {5,9,6,3};
		
		int []b = {3,55,8};
		
		
		int c []= new int [a.length+b.length];
		
		
		for (int i =0; i<a.length;i++)
		{
			c[i]=a[i];
			
		}
		
		for(int i=0 ;i<b.length;i++)
		{
			
			c[i+a.length]=b[i];
			
		}
		
		System.out.println(Arrays.toString(Arrays.stream(c).sorted().toArray()));

	}

}
