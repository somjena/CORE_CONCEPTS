package com.conditional_Statement;
import java.util.*;
public class Voting_Eligibility {

	static int s_age = 18;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Age : - ");
	    int age = sc.nextInt();	
	    if(age>=s_age) {
	    System.out.println("You Are Eligible For Voting");
	    }else {
	    	System.out.println("You are not eligible for Voting");
	    }
	    

}
}
