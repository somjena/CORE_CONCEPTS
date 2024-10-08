package com.Loops;
import java.util.*;
public class Palindrome {
	static int rev;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number You Wnt To Check :- ");
		int n = sc.nextInt();
		int temp = n;
		if (n<=9) {
			System.out.println(temp + " is Not A Pallindrome number");
			return;
		}
		
		while (n>0) {
			int digit = n%10;
			rev = rev*10+digit;
			n/=10;
		}
		
		if (rev==temp) {
			System.out.println(temp + " is A Palindrome Number");
		}else {
			System.out.println(temp + " Is not A Palindrome Number");
		}

	}

}
