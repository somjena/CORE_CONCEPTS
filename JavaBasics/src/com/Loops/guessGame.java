package com.Loops;
import java.util.*;
public class guessGame {
	         static int score;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the GuessGame");
		System.out.println("Enter Your Name :");
		String name = sc.nextLine();
		int n =(int) (Math.random()*9)+1;	
			for(int i=3;i>=1;i--) {
				System.out.println("Enter The Number You Guess");
				int gn = sc.nextInt();
				if (n==gn) {
					score+=10;
				System.out.println("Congrats You Guess The Correct Number");	
				 n =(int) (Math.random()*9)+1;
				
				}
				System.out.println("You Have Only " + (i-1) + " Chances left");
			}
			System.out.println(name + " is Your Total Score is "+score);
		}
	

	}


