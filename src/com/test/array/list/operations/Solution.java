package com.test.array.list.operations;

import java.util.ArrayList;

public class Solution {
	ArrayList<Character> clist;

	public static void main(String[] args) {

	}

	// Function to insert element
	public static void insert(ArrayList<Character> clist, char c) {
		clist.add(c);
	}

	// Function to count frequency of element
	public static void freq(ArrayList<Character> clist, char c) {
		int couterFound = 0;
		for (Character character : clist) {
			if (character.equals(c)) {
				couterFound++;
			}
		}
		if (couterFound != 0) {
			System.out.println(couterFound);

		} else {
			System.out.println("Not Present");
		}

	}
}
