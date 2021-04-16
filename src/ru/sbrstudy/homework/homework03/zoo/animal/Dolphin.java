package ru.sbrstudy.homework.homework03.zoo.animal;

import ru.sbrstudy.homework.homework03.zoo.interfaces.Moveable;
import ru.sbrstudy.homework.homework03.zoo.interfaces.Speaking;

public class Dolphin extends Animal implements Moveable, Speaking {
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
	public void moveStraight() {
		System.out.println(this.full_name + " swam 1,5 meters");
	}
}
