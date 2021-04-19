package ru.sbrstudy.homework.homework03.zoo.cage;

import ru.sbrstudy.homework.homework03.zoo.animal.Animal;

import java.util.HashSet;

public class Cage {
	private int sizeCage = 5;
	private HashSet<Animal> animalsHashSet;

	Cage(){
		this.animalsHashSet = new HashSet<Animal>(sizeCage);
	}

	Cage(int sizeCage){
		this.sizeCage = sizeCage;
		this.animalsHashSet = new HashSet<Animal>(sizeCage);
	}

	public HashSet<Animal> getAnimalHashSet(){
		return this.animalsHashSet;
	}

	public boolean addAnimal(Animal animalToAdd){//TODO throw two exception
		var animalsHashSet = getAnimalHashSet();
		if (animalsHashSet.add(animalToAdd)) {
			return true;
		}
		return false;
	}

	public boolean removeAnimal(Animal animalToRemove){//TODO throw exception
		var animalsHashSet = getAnimalHashSet();
		if (animalsHashSet.remove(animalToRemove)) {
			return true;
		}
		return false;
	}


}
