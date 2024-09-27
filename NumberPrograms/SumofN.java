import java.util.Scanner;
class SumofN
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner (System.in);
		System.out.println("Enter the Number U want ?");
		int n = sc.nextInt();
		int Sum = 0;
		String str = " " ;
		for (int i =1;i<=n ;i++ )
		{
			Sum+=i;
			str+=i;
			if (i<n)str+="+";
			
		}
		str = str + " = "+ Sum;
		System.out.println(str);
	}
}
