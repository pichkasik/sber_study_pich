package ru.sbrstudy.homework.homeworkComparator;

import java.util.Comparator;
import java.util.HashSet;

public class UniqueDigitCompare implements Comparator<MyInteger> {

	private int getNumberUniqueDigits(Integer nbr){
		var digitsHashSet = new HashSet<Integer>();
		if (nbr == 0) {
			digitsHashSet.add(nbr);
		}
		while(nbr != 0){
			digitsHashSet.add(nbr % 10);
			nbr /= 10;
		}
		return digitsHashSet.size();
	}

	@Override
	public int compare(MyInteger nbr1, MyInteger nbr2) {
		Integer numberUniqueDigits1 = getNumberUniqueDigits(nbr1.getValue());
		Integer numberUniqueDigits2 = getNumberUniqueDigits(nbr2.getValue());
		return numberUniqueDigits1.compareTo(numberUniqueDigits2);
	}
}
