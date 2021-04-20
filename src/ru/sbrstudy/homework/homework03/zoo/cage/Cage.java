package ru.sbrstudy.homework.homework03.zoo.cage;

import ru.sbrstudy.homework.homework03.zoo.animal.Animal;
import ru.sbrstudy.homework.homework03.zoo.exception.ExistentAnimalInCageExeption;
import ru.sbrstudy.homework.homework03.zoo.exception.FullCageException;

import java.util.HashSet;

public class Cage {
	private int sizeCage = 5;
	private int numberCage;
	private HashSet<Animal> animalsHashSet;

	public Cage(int numberCage){
		this.animalsHashSet = new HashSet<Animal>();
		this.numberCage = numberCage;
	}

	public Cage(int numberCage, int sizeCage){
		this.sizeCage = sizeCage;
		this.animalsHashSet = new HashSet<Animal>();
		this.numberCage = numberCage;
	}

	public int getNumberCage(){
		return numberCage;
	}

	public HashSet<Animal> getAnimalHashSet(){
		return this.animalsHashSet;
	}

	public boolean isUniqueAnimal(Animal animalToCheck){
		var animalsHashSet = getAnimalHashSet();
		for(var animal : animalsHashSet){
			if (animalToCheck.compareTypeAnimal(animal)){
				return false;
			}
		}
		return true;
	}

	public boolean addAnimal(Animal animalToAdd){
		var animalsHashSet = getAnimalHashSet();
		try {
			if (animalsHashSet.size() >= this.sizeCage){
				throw new FullCageException("Error: Could't add '" + animalToAdd.getName() + "' to zoo. The cage is full");
			}
			else if (isUniqueAnimal(animalToAdd) && animalsHashSet.add(animalToAdd)){
				return true;
			}
			else {
				throw new ExistentAnimalInCageExeption("Error: Could't add " + animalToAdd.getClass().getSimpleName() + " '" + animalToAdd.getName() + "' to zoo. Type of the Animal already in the Cage");
			}
		}
		catch (FullCageException | ExistentAnimalInCageExeption e){
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean removeAnimal(Animal animalToRemove){
		var animalsHashSet = getAnimalHashSet();
		return animalsHashSet.remove(animalToRemove);
	}

	public void printListAnimals(){
		var animalHashSet = getAnimalHashSet();
		for (Animal animal : animalHashSet) {
			System.out.print(animal.getName() + " ");
		}
		System.out.println();
	}
}
