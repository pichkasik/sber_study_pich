package ru.sbrstudy.homework.homeworkStream;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeStream {
	public static void main(String[] args) {

		int maxNbr = 2147483647 / 2;
		int minNbr = -2147483648;
		IntStream randomInts = new Random().ints(minNbr, maxNbr);
		randomInts.filter(integer -> integer > 0 && integer % 2 != 0)
					.map(integer -> integer * 2)
					.limit(15)
					.forEach(System.out::println);

	}
}
