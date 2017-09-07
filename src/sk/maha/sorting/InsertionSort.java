package sk.maha.sorting;

public class InsertionSort {

	/**
	 * Sort array using insertion sorting algorithm.
	 * 
	 * @param array
	 */
	public void insertionSorting(Integer[] array) {

		int n = array.length;
		int item, j;
		for (int i = 1; i < n; i++) {

			item = array[i];
			j = i - 1;

			while ((j > -1) && (array[j] > item)) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = item;

		}
	}

}
