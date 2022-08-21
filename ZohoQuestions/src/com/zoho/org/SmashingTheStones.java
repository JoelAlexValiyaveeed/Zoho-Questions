package com.zoho.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SmashingTheStones {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("No. of Stones= ");
		Integer total = input.nextInt();
		Integer[] stones = new Integer[total];
		for (int i = 0; i < total; i++) {
			System.out.println("Please enter weight of stone " + (i + 1));
			stones[i] = input.nextInt();
		}
		input.close();
		List<Integer> stonesInDescendingOrderOfWeight = new ArrayList<Integer>();
		for (Integer stone : stones) {
			stonesInDescendingOrderOfWeight.add(stone);
		}

		System.out.println("Weight of stone left: " + weightOfStoneLeft(stonesInDescendingOrderOfWeight));

	}

	private static Integer weightOfStoneLeft(List<Integer> stonesInDescendingOrderOfWeight) {
		while (stonesInDescendingOrderOfWeight.size() > 1) {
			Collections.sort(stonesInDescendingOrderOfWeight, Collections.reverseOrder());
			if (stonesInDescendingOrderOfWeight.get(0) == stonesInDescendingOrderOfWeight.get(1)) {
				stonesInDescendingOrderOfWeight.remove(1);
				stonesInDescendingOrderOfWeight.remove(0);
			} else if (stonesInDescendingOrderOfWeight.get(0) != stonesInDescendingOrderOfWeight.get(1)) {
				Integer weightOfSecondStone = stonesInDescendingOrderOfWeight.get(0)
						- stonesInDescendingOrderOfWeight.get(1);
				stonesInDescendingOrderOfWeight.add(weightOfSecondStone);
				stonesInDescendingOrderOfWeight.remove(1);
				stonesInDescendingOrderOfWeight.remove(0);

			}

		}
		return stonesInDescendingOrderOfWeight.size() > 0 ? stonesInDescendingOrderOfWeight.get(0) : 0;
	}

}

//Test Cases:
//	1. No. of Stones= 
//			5
//			Please enter weight of stone 1
//			9
//			Please enter weight of stone 2
//			9
//			Please enter weight of stone 3
//			9
//			Please enter weight of stone 4
//			7
//			Please enter weight of stone 5
//			8
//			Weight of stone left: 6

//    2. No. of Stones= 
//    		9
//    		Please enter weight of stone 1
//    		4
//    		Please enter weight of stone 2
//    		6
//    		Please enter weight of stone 3
//    		6
//    		Please enter weight of stone 4
//    		1
//    		Please enter weight of stone 5
//    		8
//    		Please enter weight of stone 6
//    		9
//    		Please enter weight of stone 7
//    		3
//    		Please enter weight of stone 8
//    		6
//    		Please enter weight of stone 9
//    		4
//    		Weight of stone left: 1

//     3. No. of Stones= 
//    		 3
//    		 Please enter weight of stone 1
//    		 4
//    		 Please enter weight of stone 2
//    		 4
//    		 Please enter weight of stone 3
//    		 4
//    		 Weight of stone left: 4

//       4. No. of Stones= 
//		 1
//		 Please enter weight of stone 1
//		 4
//		 Weight of stone left: 4

//       5. No. of Stones= 
//       2
//       Please enter weight of stone 1
//       4
//       Please enter weight of stone 1
//       4

//       6.No. of Stones= 
//       4
//       Please enter weight of stone 1
//       4
//       Please enter weight of stone 2
//       4
//      Please enter weight of stone 3
//       4
//      Please enter weight of stone 4
//       4
//     Weight of stone left: 0

