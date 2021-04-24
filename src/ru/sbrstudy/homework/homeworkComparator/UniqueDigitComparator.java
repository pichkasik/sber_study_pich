package ru.sbrstudy.homework.homeworkComparator;

import java.util.Comparator;
import java.util.HashSet;

public class UniqueDigitComparator implements Comparator<MyInteger> {

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
		int result;
		Integer numberUniqueDigits1 = getNumberUniqueDigits(nbr1.getValue());
		Integer numberUniqueDigits2 = getNumberUniqueDigits(nbr2.getValue());
		result = numberUniqueDigits1.compareTo(numberUniqueDigits2);
		if (result == 0 && !nbr1.equals(nbr2)) {
			return Integer.compare(nbr1.getValue(), nbr2.getValue());
		}
		else {
			return result;
		}
	}
}
