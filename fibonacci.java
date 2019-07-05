class fibonacci{
	
	public static void main(String args[])
	{
		

		int a=0;
		int b=1;
		int sum=a+b;
		int i=0;
		System.out.println(a);
		System.out.println(b);
		do{
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
			i++;
		}while(i<=5);
		}
	}
