package ru.sbrstudy.homework.homework03.zoo.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WrongNameException extends Exception{

	static public boolean validateNameAnimal(String name){
		boolean isValidname = false;
		Pattern pattern = Pattern.compile("^[a-zA-Z]{2,20}$");
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()){
			isValidname = true;
		}
		return isValidname;
	}

	public WrongNameException(){

	}

	public WrongNameException(String name) {
		System.out.println("Error: " + name + " is incorrect animal name");
	}


}
