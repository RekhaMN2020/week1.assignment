package Started;

public class FindType {

	public static void main(String[] args) {
		String test= "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char a[]=test.toCharArray();
		
		
		
		
		for (int i = 0; i < test.length(); i++)
		{
			 if (Character.isLetter(test.charAt(i))) 
				 
				  letter++;
			 
			 else if (Character.isDigit(test.charAt(i))) 
			 
					  num++;
			 
			 else if (Character.isSpaceChar(test.charAt(i)))
				 
				  space++;
			 
			 else
				 specialChar++;
						 
		}
		
		    System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("specialCharcter: " + specialChar);

		}

	}
	

