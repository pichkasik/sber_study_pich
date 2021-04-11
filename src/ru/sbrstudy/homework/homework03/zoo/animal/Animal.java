package ru.sbrstudy.homework.homework03.zoo.animal;

public abstract class Animal {
	protected String name;
	protected boolean sleep = false;

	public Animal(){

	}

	public Animal(String name){
		this.name = name;
	}

	public abstract void say();

	protected abstract boolean isSleeping();

	public abstract void goSleep();
	public abstract void wakeUp();
}
