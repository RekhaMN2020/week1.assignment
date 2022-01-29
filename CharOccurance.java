package Started;

public class CharOccurance {
	
	
	public static void main(String[] args) {
		String str = "welcome to chennai";
		char someChar='e';
		int count;
		count=0;
		for (int i = 0; i < str.length(); i++)
		{
		    if (str.charAt(i) == someChar) 
		        count++;
		}
		
		System.out.println(count);
	}

}
