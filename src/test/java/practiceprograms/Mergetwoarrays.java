package practiceprograms;

import java.util.Arrays;

public class Mergetwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a[] = {2,8,4};
		
		int b[] = {6,7,3};
		
		int[]c = new int [a.length+b.length];

		for (int i=0 ;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		for (int i=0 ;i<b.length;i++)
		{
			
			c[i+a.length]=b[i];
		
	}
		
//		int max =c[0];
//		
//		for(int i =0;i<c.length;i++)
//		{
//			
//			if(c[i]>max) {
//				max=c[i];
//							}
//		}
		
		System.out.println(Arrays.toString(Arrays.stream(c).sorted().toArray()));
		

	}}
