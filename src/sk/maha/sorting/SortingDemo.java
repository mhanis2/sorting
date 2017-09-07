package sk.maha.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {

		RandomNumbersArray rna = new RandomNumbersArray();
		BubbleSort bs = new BubbleSort();
		SelectionSort ss = new SelectionSort();
		InsertionSort is = new InsertionSort();

		long startTime;
		long stopTime;
		long elapsedTime;


		Integer[] randomNumbers = rna.generatingRandomNumbersArray(100_000);
		List<Integer> s = Arrays.asList(randomNumbers);
		Collections.shuffle(s);
		Integer[] shuffledRandomNumbers = s.toArray(new Integer[s.size()]);

		Integer[] bubbleSortArray = new Integer[shuffledRandomNumbers.length];
		for (int i = 0; i < shuffledRandomNumbers.length; i++) {
			bubbleSortArray[i] = shuffledRandomNumbers[i];
		}

		Integer[] selectionSortArray = new Integer[shuffledRandomNumbers.length];
		for (int i = 0; i < shuffledRandomNumbers.length; i++) {
			selectionSortArray[i] = shuffledRandomNumbers[i];
		}

		Integer[] insertionSortArray = new Integer[shuffledRandomNumbers.length];
		for (int i = 0; i < shuffledRandomNumbers.length; i++) {
			insertionSortArray[i] = shuffledRandomNumbers[i];
		}

		System.out.println("Starting sorting:");

		startTime = System.currentTimeMillis();
		ss.selectionSorting(selectionSortArray);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;

		System.out.println("Selection sort has finished.");
		System.out.println("Start time: " + startTime);
		System.out.println("End time: " + stopTime);
		System.out.println("Elapsed time: " + elapsedTime);
		System.out.println();

		startTime = System.currentTimeMillis();
		is.insertionSorting(insertionSortArray);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;

		System.out.println("Insertion sort has finished.");
		System.out.println("Start time: " + startTime);
		System.out.println("End time: " + stopTime);
		System.out.println("Elapsed time: " + elapsedTime);
		System.out.println();


		startTime = System.currentTimeMillis();
		bs.bubbleSorting(bubbleSortArray);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;

		System.out.println("Bubble sort has finished.");
		System.out.println("Start time: " + startTime);
		System.out.println("End time: " + stopTime);
		System.out.println("Elapsed time: " + elapsedTime);
		System.out.println();
	}

}
