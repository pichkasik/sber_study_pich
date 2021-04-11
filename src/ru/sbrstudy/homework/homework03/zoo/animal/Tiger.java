package ru.sbrstudy.homework.homework03.zoo.animal;

public class Tiger extends Animal{

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
	public boolean isSleeping() {
		return this.sleep;
	}

	@Override
	public void goSleep() {
		if (!isSleeping()){
			System.out.println(this.full_name + " go to sleep");
			this.sleep = true;
		}
		else {
			System.out.println(this.full_name + " still sleeping");
		}
	}

	@Override
	public void wakeUp() {
		if (isSleeping()){
			System.out.println(this.full_name + " woke up!");
			this.sleep = false;
		}
		else{
			System.out.println(this.full_name + " not sleeping!");
		}
	}
}
