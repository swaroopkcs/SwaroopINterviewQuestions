package part1;

import java.util.Scanner;

public class Question1 {
//	 1 : Write a program to reverse a string and check if it is a palindrome. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the string you want to check");
		String initialString = sc.next();
		sc.close();
		boolean isPalindrome = false;
		int reverseChar = initialString.length();
//		System.out.println(reverseChar);
//		System.out.println(initialString.charAt(0));
		for (int i=0; i<initialString.length()-1 ;i++ ){
			if(initialString.charAt(i) != initialString.charAt(reverseChar-1)) {
				isPalindrome = false;
				reverseChar--;
			}
			
		}
		String printResult = (isPalindrome)? initialString+ " is a not Palindrome": initialString+ " is a Palindrome";
		System.out.println(printResult);

	}

}
