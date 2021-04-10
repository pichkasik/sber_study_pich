package ru.sbrstudy.homework.homework02;

import java.util.Scanner;

public class Frame {

	public static boolean validateParameters(int height, int width, String str)
	{
		boolean result = true;

		if (height < 3 || width - str.length() < 2)
			result = false;
		return (result);
	}

	public static void printFrame(int height, int width, String str) {
		int coordinateX = (width - str.length()) / 2 + 1;
		int coordinateY = (int)Math.ceil((double)height / 2);

		for(int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++){
				if (i == 1 || j == 1 || i == height || j == width){
					System.out.print("*");
				}
				else if (i == coordinateY && j == coordinateX){
					System.out.print(str);
					j += str.length() - 1;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		int height = 0;
		int width = 0;
		String str;

		Scanner in = new Scanner(System.in);
		height = in.nextInt();
		width = in.nextInt();
		str = in.next();
		if (!(validateParameters(height, width, str))) {
			System.out.println("Ошибка");
		}
		else {
			printFrame(height, width, str);
		}
	}
}
