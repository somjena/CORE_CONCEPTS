// get the Sum of Even and odd   Ex :- 2253   -------esum = 4 and osum =8;
import java.util.Scanner;
class SumofEven_Odd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int esum = 0;
		int osum = 0;
		int digit;
		while (n>0)
		{
			 digit = n%10;
			if (digit%2==0)
			{
				esum+=digit;
			}
			else{
				osum+=digit;
			}
			n/=10;
		}
		System.out.println("The EvenSum of the Number is --> " +esum );
		System.out.println("The OddSum of the Number is --> " +osum );
	}
}
