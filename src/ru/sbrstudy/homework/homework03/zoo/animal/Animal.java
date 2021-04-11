package ru.sbrstudy.homework.homework03.zoo.animal;

public abstract class Animal {
	protected String name;
	private boolean sleep = false;

	public Animal(){

	}

	public Animal(String name){
		this.name = name;
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

	public void makeChild(int totalChildren) {
		if (totalChildren == 1){
			makeChild();
		}
		else{
			System.out.println(getClass().getSimpleName() + " " + this.name + " make " + totalChildren + " children");
		}
	}
}
