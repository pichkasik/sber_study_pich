package ru.sbrstudy.homework.homeworkStream;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class PracticeStream {

	public static void exampleStreamIntegers()
	{
		int maxNbr = 1000;
		int minNbr = -1000;
		int valueSum = 0;
		IntStream randomInts = new Random().ints(minNbr, maxNbr);
		Set<Integer> hashSet = new HashSet<>();
		randomInts.filter(integer -> integer > 0 && integer % 2 != 0)
				.map(integer -> integer * 2)
				.limit(15)
				.forEach(hashSet::add);
		valueSum = hashSet.stream().reduce(0, Integer::sum);
		System.out.println("The sum of hashSet = " + valueSum );
		System.out.println("The hashSet:");
		hashSet.forEach(System.out::println);
	}

	public static void exampleListUniqueNames()
	{
		//("Jon", "Nick", "Zac");
		List<String> firstNameList = Arrays.asList("Jon", "Nick", "Zac", "Rick");
		List<String> secondNameList = Arrays.asList("Jon", "Nate", "Phil", "Lessie");
		List<String> thirdNameList = Arrays.asList("Ilya", "Nick", "Rob", "Fred");
		List<String> fourthNameList = Arrays.asList("Nancy", "Stephanie", "Zac", "Madison");
		Stream<String> combineStreams = Stream.of(firstNameList, secondNameList, thirdNameList, fourthNameList)
												.flatMap(Collection::stream)
												.distinct();
		ArrayList<String> uniqueName = combineStreams.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(uniqueName);
	}

	public static void main(String[] args) {

		System.out.println("======================\n==Stream of integers==\n======================");
		exampleStreamIntegers();
		System.out.println("\n======================\n==List of Unique Names==\n======================");
		exampleListUniqueNames();

	}
}
