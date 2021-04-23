package ru.sbrstudy.homework.homeworkComparator;

import java.util.List;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		System.out.println("Wait for 10 seconds to see output");
		List<Integer> integerList = List.of(-5, 0, 1, 60, 10000, 367, 24, 2147483647, -2147483648);
		TreeSet<MyInteger> myIntegerTreeSet = new TreeSet<MyInteger>(new PrimeNumberCompare());
		for (var integer: integerList) {
			myIntegerTreeSet.add(new MyInteger(integer));
		}
		for (var myInteger : myIntegerTreeSet){
			System.out.println(myInteger);
		}
	}
}
