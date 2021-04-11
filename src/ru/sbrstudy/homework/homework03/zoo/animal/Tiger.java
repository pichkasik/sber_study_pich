package ru.sbrstudy.homework.homework03.zoo.animal;

public class Tiger extends Animal{

	private String full_name = "The " + getClass().getSimpleName() + " " + this.name;

	public Tiger() {
		super();
	}

	public Tiger(String name) {
		super(name);
	}

	@Override
	public void say() {
		System.out.println(this.full_name + " saying " + "RRR");
	}

	@Override
	public void goStraight() {
		System.out.println(this.full_name + " walked 1 meter");
	}
}
