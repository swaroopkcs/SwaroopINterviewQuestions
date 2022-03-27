package part1;

import java.util.Scanner;
//9 : Write a program to find the length of a string

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String that you want to check");
		String enteredString = sc.next();
		int lengthOfString = enteredString.length();
		System.out.println("The length of the String is: "+lengthOfString);
		sc.close();

	}

}
