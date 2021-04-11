package ru.sbrstudy.homework.homework03.zoo.animal;

public class Eagle extends Animal{
	private String full_name = "The " + getClass().getSimpleName() + " " + this.name;

	public Eagle() {
		super();
	}

	public Eagle(String name) {
		super(name);
	}

	@Override
	public void say() {
		System.out.println(this.full_name + " saying " + "skreeeeeaghh!");
	}

	@Override
	public void goStraight() {
		System.out.println(this.full_name + " flew 2 meters");
	}
}
