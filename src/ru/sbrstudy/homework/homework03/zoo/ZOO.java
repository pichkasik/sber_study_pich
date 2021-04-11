package ru.sbrstudy.homework.homework03.zoo;

import ru.sbrstudy.homework.homework03.zoo.animal.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ZOO {
	public static void main(String[] args) {
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
			animal.goStraight();
		}
	}

}
