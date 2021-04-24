package ru.sbrstudy.homework.homeworkIterator;

import java.util.Iterator;

public class MyIterator implements Iterable<Integer> {

	private int value;

	public MyIterator(){
	}

	public MyIterator(int value) {
		this.value = value;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new DecimalDigitIterator();
	}

	public class DecimalDigitIterator implements Iterator{

		private int tmpValue;

		public DecimalDigitIterator(){
			this.tmpValue = value;
		}

		@Override
		public boolean hasNext() {
			return tmpValue != 0;
		}

		@Override
		public Integer next() {
			int returnValue;
			if (hasNext()){
				returnValue =  tmpValue % 10;
				tmpValue /= 10;
				if (returnValue >= 0) {
					return returnValue;
				}
				else{
					return returnValue * -1;
				}
			}
			else{
				return null;
			}
		}
	}
}
