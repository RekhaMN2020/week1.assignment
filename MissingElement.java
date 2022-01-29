package Started;

import java.util.Arrays;



public class MissingElement {
	
		public static void main(String[] args) {
			System.out.println("ARRAYS");
						int[] arr = {1,2,5,4,7,6,8};
						Arrays.sort(arr);
						int flag;
						for(int i=0;i<arr.length-1;i++)
						{
							if(arr[i+1]-arr[i]!=1)
							{
								System.out.println(arr[i]+1);
							}
						}	
}

}

