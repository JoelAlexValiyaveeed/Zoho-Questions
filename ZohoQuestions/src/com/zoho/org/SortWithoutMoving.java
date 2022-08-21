package com.zoho.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWithoutMoving {

	public static void main(String[] args) {
		// heights
		Integer[] heights = { 200, -1, 200, 150, -1, 120, 90, -1, 67, 100, 190 };
		List<Integer> sortedHeightList = new ArrayList<Integer>();
		List<Integer> heightsOfPeople = new ArrayList<>();
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != -1) {
				heightsOfPeople.add(heights[i]);
			}
		}
		Collections.sort(heightsOfPeople);
		sortedHeightList = heightsOfPeople;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] == -1) {
				sortedHeightList.add(i, -1);
			}
		}
		System.out.println(sortedHeightList.toString());
	}

}

//	Test cases:
//1. Input:	 [ -1, -1, -1, 200, -1, -1, 190, -1 , 79, 150, 45]
//Output: [-1, -1, -1, 45, -1, -1, 79, -1, 150, 190, 200]

//2. Input : [ 200, -1, 200, 150, -1, 120, 90, -1, 67, 100, 190 ]
//     Output: [67, -1, 90, 100, -1, 120, 150, -1, 190, 200, 200]