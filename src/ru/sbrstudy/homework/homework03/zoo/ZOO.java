package ru.sbrstudy.homework.homework03.zoo;

import ru.sbrstudy.homework.homework03.zoo.animal.*;
import ru.sbrstudy.homework.homework03.zoo.cage.Cage;
import ru.sbrstudy.homework.homework03.zoo.exception.NegativeNumberException;
import java.util.Random;
import java.util.Arrays;

public class ZOO {
	public static void main(String[] args) throws NegativeNumberException {
		int numberChildren;

		Cage cageFirst = new Cage(1, 3);
		Cage cageSecond = new Cage(2);

		System.out.println("=ZOO=");
		var tigerwrong = new Tiger("Wrong123");
		var tigerwrong1 = new Tiger("");
		var tigerJhon = new Tiger("Jhon");
		var dolphinDerek = new Dolphin("Derek");
		var sleeperNate = new Sleeper("Nate");
		var eagleBatman = new Eagle("Batman");
		var frontenderIlya = new Frontender("Ilya");
		var list = Arrays.asList(tigerJhon, dolphinDerek, frontenderIlya, sleeperNate, eagleBatman);
		for (var animal : list){
			System.out.println("\nThe animal " + animal.getClass().getSimpleName());
			cageFirst.addAnimal(animal);
			animal.skinType();
			System.out.println(animal.getClass().getSimpleName() + " has " + ((Animal) animal).getNumberLegs() + " legs");
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
		cageFirst.removeAnimal(dolphinDerek);
		System.out.println("\n=Killers=");
		tigerJhon.killSomeone();
		sleeperNate.killSomeone();
		eagleBatman.killSomeone();
		frontenderIlya.killSomeone();

		var tigerJhonSecond = new Tiger("JhonSecond");
		var dolphinDerekSecond = new Dolphin("DerekSecond");
		var sleeperNateSecond = new Sleeper("NateSecond");
		var eagleBatmanSecond = new Eagle("BatmanSecond");

		cageSecond.addAnimal(tigerJhonSecond);
		cageSecond.addAnimal(dolphinDerekSecond);
		cageSecond.addAnimal(sleeperNateSecond);
		cageSecond.addAnimal(eagleBatmanSecond);
		cageSecond.addAnimal(tigerJhonSecond);
		cageSecond.addAnimal(tigerJhon);
		cageSecond.addAnimal(eagleBatman);


		System.out.println();
		System.out.println("The Cage number - " + cageFirst.getNumberCage());
		System.out.print("There are animals: ");
		cageFirst.printListAnimals();
		System.out.println();
		System.out.println("The Cage number - " + cageSecond.getNumberCage());
		System.out.print("There are animals: ");
		cageSecond.printListAnimals();


	}

}
