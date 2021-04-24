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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MyInteger myInteger = (MyInteger) o;

		return value == myInteger.value;
	}

	@Override
	public int hashCode() {
		return value;
	}
}
