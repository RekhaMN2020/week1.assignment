package Started;

public class Fibonacci {
	
		public static void main(String[] args) {

			int range,firstNum,secNum,sum;
			range=8;
			firstNum=0;
			secNum=1;
			sum=0;
			
			System.out.print(firstNum+" ");
			System.out.print(secNum + " ");
			for(int i=1;i<=range;i++)
				{
				sum=firstNum+secNum;
				firstNum=secNum;
				secNum=sum;
				System.out.print(sum +" ");
			
				}

	}

}
