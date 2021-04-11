package ru.sbrstudy.homework.homework03.zoo.animal;

public class Eagle extends Animal implements Moveable, Speaking, Killing{
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
	public void moveStraight() {
		System.out.println(this.full_name + " flew 2 meters");
	}

	@Override
	public void killSomeone(){
		System.out.println(this.full_name + " killed mouse");
	}
}
