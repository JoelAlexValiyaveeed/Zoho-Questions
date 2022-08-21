package com.zoho.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SumEqualTarget {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("No. of Integers= ");
		Integer integers = input.nextInt();
		Integer[] numbers = new Integer[integers];
		for (int i = 0; i < integers; i++) {
			System.out.println("Please enter number" + (i + 1));
			if (!input.hasNextInt()) {
				System.out.println("That's not a number!");
				input.next();
			}
			numbers[i] = input.nextInt();
			if (numbers[i] > 100 || numbers[i] < 1) {
				System.out.println("Number should be within range 1 - 100");
				if (!input.hasNextInt()) {
					System.out.println("That's not a number!");
					System.out.println("Number should be within range 1 - 100");
					input.next();
				}
				input.next();
			}
		}
		System.out.println("Target: ");
		Integer target = input.nextInt();
		input.close();
		List<Integer> filteredNumbers = new ArrayList<Integer>();
		for (Integer num : numbers) {
			if (num < target) {
				filteredNumbers.add(num);
			}
		}
		Collections.sort(filteredNumbers);

		if (checkSum(filteredNumbers, target)) {
			System.out.println("Possible");
		} else {
			System.out.println("Not Possible");
		}
	}

	private static boolean checkSum(List<Integer> filteredNumbers, Integer target) {
		for (int i = 0; i < filteredNumbers.size(); i++) {
			for (int j = (i + 1); j < filteredNumbers.size(); j++) {
				if (filteredNumbers.get(i) + filteredNumbers.get(j) == target) {
					return true;
				}
			}
		}
		return false;
	}

}

//Test Cases:
//	1. No. of Integers= 
//	4
//	Please enter number
//	9
//	Please enter number
//	9
//	Please enter number
//	9
//	Please enter number
//	9
//	Target: 
//	18
//	Possible

//2. No. of Integers= 
//6
//Please enter number
//1
//Please enter number
//12
//Please enter number
//4
//Please enter number
//5
//Please enter number
//7
//Please enter number
//8
//Target: 
//6
//Possible
//3. No. of Integers= 
//6
//Please enter number
//100
//Please enter number
//6
//Please enter number
//5
//Please enter number
//4
//Please enter number
//
//8
//Please enter number
//7
//Target: 
//23
//Not Possible

//4. No. of Integers= 
//4
//Please enter number1
//0
//Number should be within range 1 - 100
//6
//Please enter number2
//7
//Please enter number3
//8
//Please enter number4
//9
//Target: 
//15
//Possibe

//5. No. of Integers= 
//4
//Please enter number1
//100
//Please enter number2
//101
//Number should be within range 1 - 100
//yy
//That's not a number!
//Number should be within range 1 - 100
//5
//Please enter number3
//
//8
//Please enter number4
//8
//Target: 
//16
//Possible

//6. No. of Integers= 
//7
//Please enter number1
//100
//Please enter number2
//100
//Please enter number3
//99
//Please enter number4
//56
//Please enter number5
//34
//Please enter number6
//1
//Please enter number7
//0
//Number should be within range 1 - 100
//8
//Target: 
//87
//Not Possible