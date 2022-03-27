package part1;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first String");
		String firstString = sc.next();
		System.out.println("Please enter the second string");
		String secondString = sc.next();

		boolean isSubstring = firstString.contains(secondString) ? true : false;
		String finalResult = isSubstring ? firstString + " is a SubString of " + secondString
				: firstString + " is not a SubString of " + secondString;
		System.out.println(finalResult);

	}

}
