package Started;

public class PrimeNumber {

	

	public static void main(String[] args) {

int input=14;
int flag;
double root=Math.sqrt(input);
flag=0;
for(int i=2;i<root;i++)
{
	if(input%i==0)
	{
		flag=1;
		break;
	}
}
if(flag==0)
	System.out.println("Its prime");
else
	System.out.println("Not prime");
}
}
	
	


