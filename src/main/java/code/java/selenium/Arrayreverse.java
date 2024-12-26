package code.java.selenium;

import java.util.Arrays;

public class Arrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr [] = {5,6,9,7,2};
		
		
		int start = 0;
		
		int end = arr.length-1;
		
		
		while(start<end)
		{
			
	
		int temp= arr[start];
		
		arr[start]=arr[end];
		
		arr[end]=temp;
		
		start++;
		
		end--;
		
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
