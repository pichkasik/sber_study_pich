package ru.sbrstudy.homework.homeworkAbrakadabra;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Abrakadabra {

	Abrakadabra (){

	}

	public HashSet<Character> getLetters(Scanner in) {
		String strToLetters;
		var letters = new HashSet<Character>();

		strToLetters = in.nextLine();
		for (int i = 0; i < strToLetters.length(); i++){
			letters.add(strToLetters.charAt(i));
		}
		return letters;
	}

	public boolean isValidString(HashSet<Character> letters, String newStr){

		if (newStr.isEmpty() || newStr.isBlank())
			return false;
		for (var letterNewWord : newStr.toCharArray()){
			if (!letters.contains(letterNewWord)){
				return false;
			}
		}
		return true;
	}

	public int getNumberPlayers(Scanner in){
		Integer numberPlayers = 0;
		String strNumber;

		do{
			strNumber = in.nextLine();
			try {
				numberPlayers = Integer.parseInt(strNumber);
			}
			catch (NumberFormatException e){
				numberPlayers = 0;
			}
			finally {
				if (numberPlayers <= 0 || numberPlayers >= 6){
					System.out.println("Error: write a number between 1 to 5");
				}
			}
		}
		while (numberPlayers <= 0 || numberPlayers >= 6);
		return numberPlayers;
	}

	public void play(Player Player, Scanner in, HashSet<Character> letters, LinkedHashSet<String> generalHistoryWords){
		String newStr;
		if (Player.isGiveUp())
			return ;
		do{
			System.out.printf("[%s] Write a new word that consist of the letters from 'General' word\n", Player.getName());
			newStr = Player.getWordFromPlayer(in);
			if (isValidString(letters, newStr)){
				if (generalHistoryWords.add(newStr) && Player.addNewWord(newStr)){
					System.out.println("+1");
					break ;
				}
				else {
					System.out.println("Error: the word " + newStr + " has been written");
				}
			}
			else if (!newStr.isEmpty()){
				System.out.println("Error: the word " + newStr + " has wrong letter");
			}
		}while(!newStr.isEmpty());
		if (newStr.isEmpty()){
			Player.setGiveUp();
			System.out.println("The player " + Player.getName() + " left the game!");
		}
	}
}
