package ru.sbrstudy.homework.homeworkComparator;

public class MyInteger{

	private final int value;

	public MyInteger(int value){
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return "MyInteger{" +
				"value=" + this.value +
				'}';
	}
}
