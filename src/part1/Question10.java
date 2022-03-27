package part1;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String that you want to change to Upper case");
		String enteredString = sc.nextLine();
		String changedToUpperCase = enteredString.toUpperCase();
		System.out.println("The changed String is: "+changedToUpperCase);
		sc.close();

	}

}
