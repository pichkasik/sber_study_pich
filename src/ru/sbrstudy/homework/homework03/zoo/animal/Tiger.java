package ru.sbrstudy.homework.homework03.zoo.animal;

import ru.sbrstudy.homework.homework03.zoo.interfaces.Killing;
import ru.sbrstudy.homework.homework03.zoo.interfaces.Moveable;
import ru.sbrstudy.homework.homework03.zoo.interfaces.Speaking;

public class Tiger extends Animal implements Moveable, Speaking, Killing {

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
	public void moveStraight() {
		System.out.println(this.full_name + " walked 1 meter");
	}

	@Override
	public void killSomeone(){
		System.out.println(this.full_name + " killed antelope");
	}
}
