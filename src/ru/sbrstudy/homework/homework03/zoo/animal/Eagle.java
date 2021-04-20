package ru.sbrstudy.homework.homework03.zoo.animal;

import ru.sbrstudy.homework.homework03.zoo.interfaces.Killing;
import ru.sbrstudy.homework.homework03.zoo.interfaces.Moveable;
import ru.sbrstudy.homework.homework03.zoo.interfaces.Speaking;

public class Eagle extends Animal implements Moveable, Speaking, Killing {
	private String full_name = "The " + getClass().getSimpleName() + " " + this.name;

	public Eagle() {
		super();
	}

	public Eagle(String name) {
		super(name);
	}

	@Override
	public void skinType() {
		System.out.println(this.full_name + " has feathers skin");
	}

	@Override
	public int getNumberLegs() {
		return 2;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Eagle eagle = (Eagle) o;

		return full_name != null ? full_name.equals(eagle.full_name) : eagle.full_name == null;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (full_name != null ? full_name.hashCode() : 0);
		return result;
	}
}
