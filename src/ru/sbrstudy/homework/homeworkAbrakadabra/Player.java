package ru.sbrstudy.homework.homeworkAbrakadabra;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Player {
	private String name;
	private boolean isGiveUp = false;
	private LinkedHashSet<String> historyWords = new LinkedHashSet<String>();

	Player(){

	}

	Player(String name){
		this.name = name;
	}

	public boolean addNewWord(String newWord){
		return this.historyWords.add(newWord);
	}

	public LinkedHashSet<String> getHistoryWords(){
		return this.historyWords;
	}

	public String getWordFromPlayer(Scanner in) {
		String newStr;

		newStr = in.nextLine().trim();
		return newStr;
	}

	public boolean isGiveUp(){
		return this.isGiveUp;
	}

	public void setGiveUp(){
		this.isGiveUp = true;
	}

	public String getName(){
		return this.name;
	}

	public void printStatistic() {
		System.out.println(getName() + " written " + getHistoryWords().size() + " words");
		System.out.println("There are words: " + String.join(", ", getHistoryWords()));
	}

}
