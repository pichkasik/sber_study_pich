package ru.sbrstudy.homework.homeworkFunctionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class MainSwimmer {
	public static void main(String[] args) {
		Swimmer Swimmer = new Swimmer();
		BiConsumer<String, Integer> setter = (s, i) -> {Swimmer.setName(s); Swimmer.setAge(i);};
		setter.accept("Rick", 22);
		Supplier<String> supplier = Swimmer::getName;
		Swimmer.swim(c -> System.out.println(supplier.get()));
	}
}
