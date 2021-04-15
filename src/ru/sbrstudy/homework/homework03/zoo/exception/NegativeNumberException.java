package ru.sbrstudy.homework.homework03.zoo.exception;

public class NegativeNumberException extends Exception {

	public NegativeNumberException(){
		System.out.println("Error: get a negative number");
	}
	public NegativeNumberException(String message){
		super(message);
	}
}
