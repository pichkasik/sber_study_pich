package ru.sbrstudy.homework.homeworkAbrakadabra;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashSet<Character> letters;
		int numberPlayers;
		var generalHistoryWords = new LinkedHashSet<String>();
		var Players = new LinkedHashSet<Player>();
		var StatisticPlayers = new LinkedHashSet<Player>();
		var Abracadabra = new Abrakadabra();

		Scanner in = new Scanner(System.in);

		System.out.println("Write number of players: 1 <= number players <= 5");
		numberPlayers = Abracadabra.getNumberPlayers(in);

		System.out.println("Write a 'General' word");
		letters = Abracadabra.getLetters(in);

		for (Integer i = 1; i <= numberPlayers; i++){
			Players.add(new Player(i.toString()));
		}
		StatisticPlayers.addAll(Players);
		while (Players.size() > 0){
			Iterator<Player> iter = Players.iterator();
			while(iter.hasNext()){
				Player CurrentPlayer = iter.next();
				Abracadabra.play(CurrentPlayer, in, letters, generalHistoryWords);
				if (CurrentPlayer.isGiveUp()){
					iter.remove();
				}
			}
		}
		System.out.printf("==========\n=Results:=\n==========\n");
		for (var StatisticPlayer : StatisticPlayers){
			StatisticPlayer.printStatistic();
		}
	}
}
