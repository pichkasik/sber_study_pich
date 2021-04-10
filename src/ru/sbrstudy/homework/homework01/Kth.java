package ru.sbrstudy.homework.homework01;

import java.util.Scanner;

public class Kth {

	public static long powerTen(long exponent)
	{
		int base = 10;

		long result = 1;
		while (exponent != 0)
		{
			result *= base;
			--exponent;
		}
		return (result);
	}

	public static long getPositionK(long k)
	{
		long nbr;
		long range = 0;
		long range_prev = 0;
		long power = 0;
		while (k - range >= 0)
		{
			range_prev = range;
			range += 9 * powerTen(power) * (power + 1);
			power++;
		}
		nbr = ((k - range_prev) / power) + powerTen(power - 1);
		for (int i = 1; i < power - (k - range_prev) % power; i++) {
			nbr /= 10;
		}
		return (nbr);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long k = in.nextLong();
		long nbr;
		nbr  = getPositionK(k);
		System.out.println((long)(nbr % 10));
	}
}
