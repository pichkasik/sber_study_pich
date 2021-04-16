package ru.sbrstudy.homework.homework03.zoo.animal;

import ru.sbrstudy.homework.homework03.zoo.interfaces.Killing;
import ru.sbrstudy.homework.homework03.zoo.interfaces.Moveable;
import ru.sbrstudy.homework.homework03.zoo.interfaces.Speaking;

public class Sleeper extends Animal implements Moveable, Speaking, Killing {
	private String full_name = "The " + getClass().getSimpleName() + " " + this.name;

	public Sleeper() {
		super();
	}

	public Sleeper(String name) {
		super(name);
	}

	@Override
	public void skinType() {
		System.out.println(this.full_name + " has wool skin");
	}

	@Override
	public int getNumberLegs() {
		return 4;
	}

	@Override
	public void say() {
		System.out.println(this.full_name + " saying " + "Pipi!");
	}

	@Override
	public void moveStraight() {
		System.out.println(this.full_name + " dug throught 0,2 meters");
	}

	@Override
	public void killSomeone(){
		System.out.println(this.full_name + " killed worm");
	}
}
