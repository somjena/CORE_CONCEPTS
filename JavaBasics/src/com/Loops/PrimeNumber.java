package com.Loops;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		boolean flag = true;
		if (num<=1) {
			System.out.println("Not A Prime Number");
		}
		 for(int i =2;i<=num/2;i++) {
			 if(num%i==0) {
				 flag = false;
				 break;
			 }
		 }
		 if(flag) {
			 System.out.println(num + " Is A Prime Number");
		 }else {
			 System.out.println(num + " Is Not A Prime Number");
		 }

	}

}
