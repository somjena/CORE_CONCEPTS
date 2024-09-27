import java.util.Scanner;
class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String You Want");
		String str = sc.nextLine();
		String revstr = " ";
		for (int i =str.length()-1;i>=0 ;i-- )
		{
			revstr+=str.charAt(i);
		}
		System.out.println(revstr);
	}
}
