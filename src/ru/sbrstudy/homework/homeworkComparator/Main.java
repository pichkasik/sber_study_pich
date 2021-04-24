package ru.sbrstudy.homework.homeworkComparator;

import java.util.List;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		System.out.println("Wait for 10 seconds to see output there is a big integers to work with");
		List<Integer> integerList = List.of(-5, 0, 1, 60, 10000, 367, 24, 2147483647, -2147483648, 1234567890, 123456789, 123456789);
		//TODO try List.sort or Collection.sort
		TreeSet<MyInteger> integerTreeSetPrime = new TreeSet<MyInteger>(new PrimeNumberComparator());
		for (var integer: integerList) {
			integerTreeSetPrime.add(new MyInteger(integer));
		}
		System.out.println("Prime numbers Compare");
		for (var myInteger : integerTreeSetPrime){
			System.out.println(myInteger);
		}

		System.out.println();
		TreeSet<MyInteger> integerTreeSetUniqueDigits = new TreeSet<MyInteger>(new UniqueDigitComparator());
		for (var integer: integerList) {
			integerTreeSetUniqueDigits.add(new MyInteger(integer));
		}
		System.out.println("Unique digits Compare");
		for (var myInteger : integerTreeSetUniqueDigits){
			System.out.println(myInteger);
		}
	}
}
