package Started;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String text1 = "geeks";
		String text2 = "keegs"; 
		int flag=0;
		if(text1.length()==text2.length())
		{
			char a[]= text1.toCharArray();
			char b[]= text2.toCharArray();
		      Arrays.sort(a);  
	          Arrays.sort(b); 
	          
	          if(Arrays.equals(a,b))
	          flag =1 ;
		}
	          if (flag==1) 
	          {  
	              System.out.println("Its an anagram");  
	          } 
	          else 
	          {  
	              System.out.println(" Its not an anagram");  
	          }  
			
			
	}

}
