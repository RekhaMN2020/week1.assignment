package Started;

public class DuplicateArrayElements {
	public static void main(String[] args) {
		int[] arr = {1,1,12,3,3,4,5,5};
		int length=arr.length;
		int count;
		
		for(int i=0;i<arr.length-1;i++)
		{	count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
		if(count>0)
			System.out.println(arr[i]);
			
	}

}
}