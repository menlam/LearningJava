//fibonaccie series till 10 without using recurssion
class fibonacci{
	
	public static void main(String args[])
	{
		
 		

		int a=0;
		int b=1;
		int sum=a+b;
		int i=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		do{
			System.out.print(sum+" ");
			a=b;
			b=sum;
			sum=a+b;
			i++;
		}while(i<=10);
		}
	}
