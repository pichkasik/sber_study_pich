package ru.sbrstudy.homework.homework03.zoo.animal;

public class Frontender extends Animal implements Moveable, Speaking, Killing{
	private String full_name = "The " + getClass().getSimpleName() + " " + this.name;

	public Frontender() {
		super();
	}

	public Frontender(String name) {
		super(name);
	}

	@Override
	public void say() {
		System.out.println(this.full_name + " saying " + "JS is cool!");
	}

	@Override
	public void moveStraight() {
		System.out.println(this.full_name + " rolled on the chair 0,3 meter");
	}

	@Override
	public void killSomeone(){
		System.out.println(this.full_name + " killed time");
	}
}
