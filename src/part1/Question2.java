package part1;

import java.util.Scanner;

public class Question2 {
	
//	2 : Write a program to find if the number is prime or not. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check for Prime Number:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you want to check:");
		int num = sc.nextInt();
		boolean isPrime = false;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a Prime Number");
		} else {
			for (int counter = 2; counter < num / 2; counter++) {
				if (num%counter==0) {
					isPrime = true;
					break;
				}
			}
			String primeOrNotPrint = isPrime? (num + " is not a Prime Number"): (num + " is a Prime Number");
			System.out.println(primeOrNotPrint);

		}
		sc.close();
	}

}
