package ru.sbrstudy.homework.homework03.zoo.exception;

public class FullCageException extends Exception{
	public FullCageException(){
		System.out.println("Error: Could't add an Animal to zoo. The cage is full");
	}
	public FullCageException(String message){
		super(message);
	}
}
