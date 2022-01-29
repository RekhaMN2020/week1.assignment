package Started;

public class PalindromeReverse {
	
	  public static void palindrome(String s)
	  {
	
	    String rev = new StringBuffer(s).reverse().toString();
	  
	
	    if (s.equals(rev))
	      System.out.println("Yes");
	  
	    else
	      System.out.println("No");
	  }
	  
	  public static void main (String[] args)
	             
	  {
	    palindrome("madam");
	    
	  }
	}


