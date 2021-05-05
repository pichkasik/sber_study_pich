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
	//foldLeft
	//foldRight
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

	static <T extends Number> Number myCount(List<T> origin){

		return 1;
	}

	/*
	* Set `result` to 'empty' value
	* Example: if List<String> => res = ""
	* Example: if List<Integer> => res = * ? 1 : 0
	 */
	static <T, R> R myFoldLeft(List<T> origin, R result, BiFunction<R, T, R> lambda){
		if (origin.size() == 0){
			return result;
		}
		R nextValue = lambda.apply(result, origin.get(0));
		return myFoldLeft(origin.subList(1, origin.size()), nextValue, lambda);
	}

	static <T, R> R myFoldRight(List<T> origin, R result, BiFunction<R, T, R> lambda){
		if (origin.size() == 0){
			return result;
		}
		R nextValue = lambda.apply(result, origin.get(origin.size() - 1));
		return myFoldLeft(origin.subList(0, origin.size() - 1), nextValue, lambda);
	}

	public static void main(String[] args) {
		List<String> arrStrings = Arrays.asList("a", "b", "c");
		List<Integer> arrNumbers = Arrays.asList(1, 2, 3, 4);
		System.out.println(myFoldLeft(arrStrings, "", (i, s) -> i + s));
		System.out.println(myFoldLeft(arrNumbers, 0, (i, s) -> i + s));
		System.out.println(myFoldLeft(arrNumbers, 0, (i, s) -> i - s));
		System.out.println(myFoldLeft(arrNumbers, 1, (i, s) -> i * s));
		System.out.println(myFoldRight(arrStrings, "", (i, s) -> i + s));
		System.out.println(myFoldRight(arrNumbers, 0, (i, s) -> i + s));
		System.out.println(myFoldRight(arrNumbers, 0, (i, s) -> i - s));
		System.out.println(myFoldRight(arrNumbers, 1, (i, s) -> i * s));
	}
}
