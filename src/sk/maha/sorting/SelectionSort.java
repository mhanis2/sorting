package sk.maha.sorting;

public class SelectionSort {

	/**
	 * Sorts array using selection sorting algorithm.
	 * 
	 * @param array
	 */
	public void selectionSorting(Integer[] array) {

		int n = array.length;
		for (int i = 0; i < (n - 1); i++) {

			int index = i;

			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[index]) {

					index = j;
				}
			}
			if (index != i) {
				int smallerNumber = array[index];
				array[index] = array[i];
				array[i] = smallerNumber;
			}
		}
	}
}
