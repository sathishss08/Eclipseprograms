import java.util.Arrays;

public class Twopointermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		int[] arr = {1,5,6,-4,8,9,0,6};
		
	reverse(arr);
	
	
	System.out.println(Arrays.toString(arr));
		
		
		
		
		}
	
	public static void reverse(int arr[])
	
	{
		
		int start =0;
		
		
		int end =arr.length-1;
		
		while(start<end)
		{
			
			swap(arr,start , end);
			
			start++;
			
			end--;
		}
	}
		
		
		
	
			
			
		
		
		public static void swap(int[] arr,int index1, int index2)
		{
		int temp =arr[index1];
		
		arr[index1]=arr[index2];
		
		arr[index2]=temp;
		}
		

}


