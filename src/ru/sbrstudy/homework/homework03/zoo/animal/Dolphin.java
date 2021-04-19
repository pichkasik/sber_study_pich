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
	public void skinType() {
		System.out.println(this.full_name + " has smooth skin");
	}

	@Override
	public int getNumberLegs() {
		return 0;
	}

	@Override
	public void say() {
		System.out.println(this.full_name + " saying " + "eEeEeEeEeEeEeEeEeEeE");
	}

	@Override
	public void moveStraight() {
		System.out.println(this.full_name + " swam 1,5 meters");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Dolphin dolphin = (Dolphin) o;

		return full_name != null ? full_name.equals(dolphin.full_name) : dolphin.full_name == null;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (full_name != null ? full_name.hashCode() : 0);
		return result;
	}
}
