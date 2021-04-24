package ru.sbrstudy.homework.homeworkIterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int number1 = 123456789;

		List<Integer> integerList = List.of(1234567890, 123456789, 709, 1, 12, 0, -2147483648, 2147483647);
		List<MyIterator> iteratorList = new ArrayList<>();
		for (var number : integerList){
			MyIterator iter = new MyIterator(number);
			for (var item : iter){
				System.out.print(item);
			}
			System.out.println();
		}

	}
}
