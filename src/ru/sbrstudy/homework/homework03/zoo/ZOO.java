package ru.sbrstudy.homework.homework03.zoo;

import ru.sbrstudy.homework.homework03.zoo.animal.*;
import ru.sbrstudy.homework.homework03.zoo.exception.NegativeNumberException;
import java.util.Random;
import java.util.Arrays;

public class ZOO {
	public static void main(String[] args) throws NegativeNumberException {
		int numberChildren;
		System.out.println("=ZOO=");
		var tigerwrong = new Tiger("Wrong123");
		var tigerwrong1 = new Tiger("");
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
			Random rand = new Random();
			numberChildren = rand.nextInt(10) - 5;
			try {
				if (numberChildren < 0){
					throw new NegativeNumberException("Error: " + numberChildren + " is wrong number of children ");
				}
				animal.makeChild(numberChildren);
			}
			catch (NegativeNumberException e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("\n=Killers=");
		tigerJhon.killSomeone();
		sleeper.killSomeone();
		eagle.killSomeone();
		frontender.killSomeone();
	}

}
