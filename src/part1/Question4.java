package part1;

import java.util.Scanner;

public class Question4 {
//	4 : Write a program to print the numbers in an array in descending order. 
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
		for(i=0;i<numbers.length;i++) {
			for(int j=1;j<numbers.length;j++) {
				if(numbers[i]>numbers[j]) {
					int largeNumber = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = largeNumber;
				}
				
			}
		}
		for(i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]+ " ");
		}
		
	}

}
