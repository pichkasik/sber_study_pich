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
	public void skinType() {
		System.out.println(this.full_name + " has wool skin");
	}

	@Override
	public int getNumberLegs() {
		return 4;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Tiger tiger = (Tiger) o;

		return full_name != null ? full_name.equals(tiger.full_name) : tiger.full_name == null;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (full_name != null ? full_name.hashCode() : 0);
		return result;
	}
}
