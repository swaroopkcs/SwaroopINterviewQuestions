package part1;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int firstNumber = sc.nextInt();
		System.out.println("Please enter second number: ");
		int secondNumber = sc.nextInt();
		System.out.println("Before Reversing");
		System.out.println("First Number : "+firstNumber);
		System.out.println("Second Number: "+secondNumber);
		firstNumber = firstNumber+secondNumber;
		secondNumber = firstNumber-secondNumber;
		firstNumber = firstNumber-secondNumber;
		System.out.println("After Reversing");
		System.out.println("First Number : "+firstNumber);
		System.out.println("Second Number: "+secondNumber);
		sc.close();

	}

}
