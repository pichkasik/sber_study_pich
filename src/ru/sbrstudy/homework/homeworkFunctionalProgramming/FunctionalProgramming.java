package ru.sbrstudy.homework.homeworkFunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalProgramming {
	static <T, R> List<R> myMap(List<T> origin, Function<T, R> mapper){
		List<R> mapList = new ArrayList<>();
		for (var elem : origin){
			mapList.add(mapper.apply(elem));
		}
		return mapList;
	}

	static <T> void myForEach(List<T> origin, Consumer<T> consumer){
		Iterator<T> it = origin.iterator();
		while (it.hasNext()){
			T elem = it.next();
			consumer.accept(elem);
		}
	}

	static <T> List<T> myFilter(List<T> origin, Predicate<T> predicate){
		List<T> filterList = new ArrayList<>();
		for (var elem : origin){
			if (predicate.test(elem)){
				filterList.add(elem);
			}
		}
		return filterList;
	}

	static <T> long myCount(List<T> origin, Predicate<T> predicate){
		long count = 0;
		for (var elem : origin){
			if (predicate.test(elem)){
				count +=1;
			}
		}
		return count;
	}

	/*
	* Set `identity` to 'empty' value
	* Example: if List<String> => res = ""
	* Example: if List<Integer> => res = * ? 1 : 0
	 */
	static <T, R> R myFoldLeft(List<T> origin, R identity, BiFunction<R, T, R> lambda){
		if (origin.size() == 0){
			return identity;
		}
		R nextValue = lambda.apply(identity, origin.get(0));
		return myFoldLeft(origin.subList(1, origin.size()), nextValue, lambda);
	}

	/*
	 * Set `identity` to 'empty' value
	 * Example: if List<String> => res = ""
	 * Example: if List<Integer> => res = * ? 1 : 0
	 */
	static <T, R> R myFoldRight(List<T> origin, R identity, BiFunction<R, T, R> lambda){
		if (origin.size() == 0){
			return identity;
		}
		R nextValue = lambda.apply(identity, origin.get(origin.size() - 1));
		return myFoldLeft(origin.subList(0, origin.size() - 1), nextValue, lambda);
	}

	public static void main(String[] args) {
		//Init
		List<String> arrStrings = Arrays.asList("a", "b", "c");
		List<Integer> arrNumbers = Arrays.asList(1, 2, 3, 4);
		List<Integer> oneNumber = Arrays.asList(55);
		List<String> oneString = Arrays.asList("d");

		System.out.println("\n=======Test myMap=======\n");
		System.out.println(myMap(arrStrings, String::toUpperCase));
		System.out.println(myMap(arrNumbers, i -> i * 2));

		System.out.println("\n=======Test myForEach=======\n");
		myForEach(arrStrings, System.out::print);
		System.out.println();
		myForEach(arrNumbers, System.out::print);


		System.out.println("\n=======Test myFilter=======\n");
		System.out.println(myFilter(arrStrings, str -> str.startsWith("a")));
		System.out.println(myFilter(arrNumbers, integer -> integer % 2 == 0));

		System.out.println("\n=======Test myCount=======\n");
		System.out.println(myCount(arrStrings, str -> str.startsWith("a")));
		System.out.println(myCount(arrNumbers, integer -> integer % 2 == 0));

		System.out.println("\n=======Test myFoldLeft=======\n");
		System.out.println(myFoldLeft(arrStrings, "", (integer, str) -> integer + str));
		System.out.println(myFoldLeft(arrNumbers, 0, (integer, str) -> integer + str));
		System.out.println(myFoldLeft(arrNumbers, 0, (integer, str) -> integer - str));
		System.out.println(myFoldLeft(arrNumbers, 1, (integer, str) -> integer * str));
		System.out.println(myFoldLeft(oneString, "", (integer, str) -> integer + str));
		System.out.println(myFoldLeft(oneNumber, 0, (integer, str) -> integer + str));

		System.out.println("\n=======Test myFoldRight=======\n");
		System.out.println(myFoldRight(arrStrings, "", (integer, str) -> integer + str));
		System.out.println(myFoldRight(arrNumbers, 0, (integer, str) -> integer + str));
		System.out.println(myFoldRight(arrNumbers, 0, (integer, str) -> integer - str));
		System.out.println(myFoldRight(arrNumbers, 1, (integer, str) -> integer * str));
	}
}
