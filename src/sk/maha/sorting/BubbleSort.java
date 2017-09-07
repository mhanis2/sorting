package sk.maha.sorting;

public class BubbleSort {

	/**
	 * Sort array using bubble sorting algorithm.
	 * 
	 * @param array
	 */
	public void bubbleSorting(Integer[] array) {

		int n = array.length;
		int temp;
		boolean sorting = true;
		while (sorting) {
			sorting = false;
			for (int i = 0; i < (n - 1); i++) {
				if (array[i] > array[i + 1]) {

					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sorting = true;
				}
			}
			n--;
		}
	}
}
