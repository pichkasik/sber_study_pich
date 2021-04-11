package ru.sbrstudy.homework.homework03.zoo.animal;

public class Dolphin extends Animal{
	private String full_name = "The " + getClass().getSimpleName() + " " + this.name;

	public Dolphin() {
		super();
	}

	public Dolphin(String name) {
		super(name);
	}

	@Override
	public void say() {
		System.out.println(this.full_name + " saying " + "eEeEeEeEeEeEeEeEeEeE");
	}

	@Override
	public void goStraight() {
		System.out.println(this.full_name + " swam 1,5 meters");
	}
}
