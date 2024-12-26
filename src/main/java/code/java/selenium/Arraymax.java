package code.java.selenium;

public class Arraymax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {5,6,5,1,8};
		
		int max = arr[0];
		
		for(int i =0; i<arr.length;i++)
		{
			
			if(arr[i]>max)
			{
				
				max= arr[i];
			}
		}
		
		System.out.println();

	}

}
