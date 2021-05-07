package ru.sbrstudy.homework.homeworkStream;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class PracticeStream {
	public static void main(String[] args) {

		int maxNbr = 2147483647 / 2;
		int minNbr = -2147483648;
		long valueSum = 0;
		IntStream randomInts = new Random().ints(minNbr, maxNbr);
		Set<Integer> hashSet = new HashSet<>();
		randomInts.filter(integer -> integer > 0 && integer % 2 != 0)
					.map(integer -> integer * 2)
					.limit(15)
					.forEach(x -> hashSet.add(x));
		valueSum = hashSet.stream().reduce(0, (x, y) -> x + y);
		System.out.println("The sum(could be negative if long overflowed) of hashSet = " + valueSum );
		System.out.println("The hashSet:");
		hashSet.stream().forEach(System.out::println);
	}
}
