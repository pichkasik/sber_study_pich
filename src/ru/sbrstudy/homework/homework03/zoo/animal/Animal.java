package ru.sbrstudy.homework.homework03.zoo.animal;

public abstract class Animal {
	protected String name;
	protected boolean sleep = false;

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
}
