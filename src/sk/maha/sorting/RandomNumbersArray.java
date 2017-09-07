package sk.maha.sorting;

public class RandomNumbersArray {

	/**
	 * Create array of random numbers according to range.
	 * 
	 * @param range
	 * @return Integer array
	 */
	public Integer[] generatingRandomNumbersArray(int range) {
		Integer[] result = new Integer[range];
		for (int i = 1; i <= result.length; i++) {
			result[i - 1] = i;
		}
		return result;
	}

}
