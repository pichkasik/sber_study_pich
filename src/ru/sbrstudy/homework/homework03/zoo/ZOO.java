package ru.sbrstudy.homework.homework03.zoo;

import ru.sbrstudy.homework.homework03.zoo.animal.Animal;
import ru.sbrstudy.homework.homework03.zoo.animal.Tiger;

public class ZOO {
	public static void main(String[] args) {
		System.out.println("=ZOO=");
		var tiger1 = new Tiger();
		var tigerJhon = new Tiger("Jhon");
		tigerJhon.say();
		tigerJhon.wakeUp();
		tigerJhon.goSleep();
		tigerJhon.goSleep();
		tigerJhon.wakeUp();
		tiger1.say();
		tiger1.wakeUp();
		tiger1.goSleep();
		tiger1.goSleep();
		tiger1.wakeUp();
		tigerJhon.goSleep();
	}

}
