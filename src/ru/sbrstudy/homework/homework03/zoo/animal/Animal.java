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
}
