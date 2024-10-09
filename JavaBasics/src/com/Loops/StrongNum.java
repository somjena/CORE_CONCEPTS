package com.Loops;
import java.util.Iterator;
import java.util.Scanner;
public class StrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number You Want To Check :- ");
		int n = sc.nextInt();
		int temp = n;
		
		int sum = 0;
		while(n>0) {
			int digit = n%10;
			int factor = 1;  // Each Time The Loop iterate The Factor Vaalue Should Be 1
			
			for(int i =1;i<=digit;i++) {
				factor *=i;
						
			}
			sum+=factor;
			
			n/=10;
		}
		if(temp==sum) {
			System.out.println(temp + " is A Strong Number");
		}else {
			System.out.println(temp + " is Not A Strong Number");
		}
		

	}

}
