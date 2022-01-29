package Started;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] t = test.split(" ");
		String[] t2= new String[100];

	
		for (int i =0 ; i <t.length; i++)
		{
			if(i%2!=0)
			{
				String []t1=t[i].split("");
				
				for(int k=0; k<t1.length; k++)
				{
				
					t2[k]=t1[k];
				}
				
				for(int j=0;j<t1.length;j++)
				{
					t1[j]=t2[t1.length-j-1];	
				}
				
				for(int i1=0; i1<t1.length; i1++)
				{
					System.out.print(t1[i1]);
				}
				
				System.out.print(" ");	
			}
		
			else
			{
				System.out.print(t[i]);
				System.out.print(" ");
			}
				
			
		}
		
		
	}

}

