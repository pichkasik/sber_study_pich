package ru.sbrstudy.homework.homeworkComparator;

import java.util.Comparator;

public class PrimeNumberCompare implements Comparator<MyInteger> {

	private boolean isPrimeNumber(Integer nbr){
		int halfNumber = nbr / 2;
		if (nbr == 2)
			return true;
		for(int i = 3; i <= halfNumber; i += 2){
			if (nbr % i == 0){
				return false;
			}
		}
		return true;
	}

	private Integer getTotalPrimeDivisions(Integer nbr){
		Integer count = 1;
		Integer i = 2;
		while (Math.abs(nbr / 2) > i) {
			if (nbr % i == 0 && isPrimeNumber(i)){
				count++;
			}
			i++;
		}
		if (nbr == 0 || nbr == 1){
			count = 0;
		}
		return count;
	}

	@Override
	public int compare(MyInteger nbr1, MyInteger nbr2) {
		Integer totalPrimeDivisions1;
		Integer totalPrimeDivisions2;
		totalPrimeDivisions1 = getTotalPrimeDivisions(nbr1.getValue());
		totalPrimeDivisions2 = getTotalPrimeDivisions(nbr2.getValue());
		return totalPrimeDivisions1.compareTo(totalPrimeDivisions2);
	}
}
