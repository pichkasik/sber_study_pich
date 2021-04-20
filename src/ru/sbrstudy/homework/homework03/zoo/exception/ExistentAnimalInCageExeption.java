package ru.sbrstudy.homework.homework03.zoo.exception;

public class ExistentAnimalInCageExeption extends Exception{
	public ExistentAnimalInCageExeption(){
		System.out.println("Error: Could't add an Animal to zoo. Type of the Animal already in the Cage");
	}
	public ExistentAnimalInCageExeption(String message){
		super(message);
	}
}
