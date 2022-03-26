package part1;

import java.util.Scanner;

//3 : Write a program to find the maximum number in an array. 

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number of elements that you enter in the array");
		int i = sc.nextInt();
		
		int[] numbers = new int[i];
		for(i=0; i<numbers.length;i++) {
			System.out.print((i+1)+" Please enter the number: ");
			numbers[i] = sc.nextInt();
		}
		sc.close();
		int largestNumber = numbers[0];
		for (i=0;i<numbers.length;i++ ) {
			largestNumber = (numbers[i]>largestNumber)? numbers[i]: largestNumber;
		}
		System.out.println("The largest in the array is: "+largestNumber);

	}

}
