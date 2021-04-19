package ru.sbrstudy.homework.homework03.zoo.cage;

import ru.sbrstudy.homework.homework03.zoo.animal.Animal;
import ru.sbrstudy.homework.homework03.zoo.exception.ExistentAnimalInCageExeption;
import ru.sbrstudy.homework.homework03.zoo.exception.FullCageException;

import java.util.HashSet;

public class Cage {
	private int sizeCage = 5;
	private HashSet<Animal> animalsHashSet;

	Cage(){
		this.animalsHashSet = new HashSet<Animal>();
	}

	Cage(int sizeCage){
		this.sizeCage = sizeCage;
		this.animalsHashSet = new HashSet<Animal>();
	}

	public HashSet<Animal> getAnimalHashSet(){
		return this.animalsHashSet;
	}

	public boolean addAnimal(Animal animalToAdd) throws ExistentAnimalInCageExeption, FullCageException {
		var animalsHashSet = getAnimalHashSet();
		try {
			if (animalsHashSet.size() >= this.sizeCage){
				throw new FullCageException("Error: Could't add '" + animalToAdd.getName() + "' to zoo. The cage is full");
			}
			else if (animalsHashSet.add(animalToAdd)){
				return true;
			}
			else {
				throw new ExistentAnimalInCageExeption("Error: Could't add '" + animalToAdd.getName() + "' to zoo. Type of the Animal already in the Cage");
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


}
