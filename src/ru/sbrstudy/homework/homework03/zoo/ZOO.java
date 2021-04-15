package ru.sbrstudy.homework.homework03.zoo;

import ru.sbrstudy.homework.homework03.zoo.animal.*;
import ru.sbrstudy.homework.homework03.zoo.exception.NegativeNumberException;

import java.util.Arrays;

public class ZOO {
	public static void main(String[] args) throws NegativeNumberException {
		int numberChildren;
		System.out.println("=ZOO=");
		var tigerJhon = new Tiger("Jhon");
		var dolphin = new Dolphin("Derek");
		var sleeper = new Sleeper("Nate");
		var eagle = new Eagle("Batman");
		var frontender = new Frontender("Ilya");
		var list = Arrays.asList(tigerJhon, dolphin, frontender, sleeper, eagle);
		for (var animal : list){
			System.out.println("\nThe animal " + animal.getClass().getSimpleName());
			animal.say();
			animal.wakeUp();
			animal.goSleep();
			animal.goSleep();
			animal.wakeUp();
			animal.moveStraight();
			animal.makeChild();
			numberChildren = 5;
			animal.makeChild(numberChildren);
			numberChildren = -5;
			animal.makeChild(numberChildren);
		}
		System.out.println("\n=Killers=");
		tigerJhon.killSomeone();
		sleeper.killSomeone();
		eagle.killSomeone();
		frontender.killSomeone();
	}

}
