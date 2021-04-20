package ru.sbrstudy.homework.homework03.zoo.animal;

import ru.sbrstudy.homework.homework03.zoo.exception.NegativeNumberException;
import ru.sbrstudy.homework.homework03.zoo.exception.WrongNameException;
import ru.sbrstudy.homework.homework03.zoo.interfaces.Sleeping;

public abstract class Animal implements Sleeping {
	protected String name;
	private boolean sleep = false;

	public Animal(){
		try{
			throw new WrongNameException();
		}
		catch (WrongNameException e){
			System.out.println(e.getMessage());
		}
	}

	public Animal(String name){
		try {
			if (WrongNameException.validateNameAnimal(name)){
				this.name = name;
			}
			else{
				throw new  WrongNameException(name);
			}
		}
		catch (WrongNameException e){
			System.out.println(e.getMessage());
		}
	}

	public abstract void skinType();

	public abstract int getNumberLegs();

	public String getName(){
		return this.name;
	}

	public void goSleep() {
		if (!this.sleep){
			System.out.println(getClass().getSimpleName() + " " + this.name + " go to sleep");
			this.sleep = true;
		}
		else {
			System.out.println(getClass().getSimpleName() + " " + this.name + " still sleeping");
		}
	}

	public void wakeUp() {
		if (this.sleep){
			System.out.println(getClass().getSimpleName() + " " + this.name + " woke up!");
			this.sleep = false;
		}
		else{
			System.out.println(getClass().getSimpleName() + " " + this.name + " not sleeping!");
		}
	}

	public void makeChild() {
		System.out.println(getClass().getSimpleName() + " " + this.name + " make one child");
	}

	public void makeChild(int totalChildren) throws NegativeNumberException{
		if (totalChildren == 1) {
			makeChild();
		} else {
			System.out.println(getClass().getSimpleName() + " " + this.name + " make " + totalChildren + " children");
		}
	}

	public boolean compareTypeAnimal(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Animal animal = (Animal) o;

		if (sleep != animal.sleep) return false;
		return name != null ? name.equals(animal.name) : animal.name == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (sleep ? 1 : 0);
		return result;
	}
}
