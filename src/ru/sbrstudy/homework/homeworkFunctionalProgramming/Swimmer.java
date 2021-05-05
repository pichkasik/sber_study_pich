package ru.sbrstudy.homework.homeworkFunctionalProgramming;

import java.util.function.Consumer;

public class Swimmer {
	public String name;
	private Integer age;

	public void swim(Consumer<String> c){
		c.accept(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
