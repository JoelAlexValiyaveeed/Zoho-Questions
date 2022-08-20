package com.zoho.org;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SumEqualTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("No. of Integers= ");
		Integer data1 = input.nextInt();
		Integer[] numbers = new Integer[data1];

		for (int i = 0; i < data1; i++) {
			System.out.println("Please enter number");
			numbers[i] = input.nextInt();
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
			System.out.println("Possibe");
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
