import java.util.Arrays;
//import java.util.Random;

public class Application {

	public static void main(String[] args) {
		
		int n = 10;
		
		/**
		 * Here, I use the UniqueRandomNum constructor to generate a unique random array (array1)
		 * then selection sort is used to sort the array.
		 * 
		 * I have used a for loop to collect the time taken by adding my uniqueness algorithm time and the sorting algorithm time.
		 * The average time take is calculated right outside of the loop at the end.
		 */
		/*
		SelectionSort sort1 = new SelectionSort();

		long fullTimeTaken1 = 0;
		for (int i=0; i<n; i++) {
			
			// Testing the constructor and sorting with selection sort
			System.out.println("\nCONSTRUCTOR TEST WITH SELECTION SORT");
			long startArray1 = System.nanoTime();
			UniqueRandomNum array1 = new UniqueRandomNum(1000,10000);
			long endArray1 = System.nanoTime();
			long timeTakenArray1 = (endArray1 - startArray1); // leaving in nanoseconds
			
			System.out.println("\nThe unique random array is:\n" + Arrays.toString(array1.getArray()) + "\nThe time taken is: " + timeTakenArray1);
			
			//SelectionSort sort1 = new SelectionSort();
			long startSortArray1 = System.nanoTime();
			sort1.sortNums(array1.getArray());
			long endSortArray1 = System.nanoTime();
			long timeTakenSortArray1 = (endSortArray1 - startSortArray1); // leaving in nanoseconds
			
			System.out.println("\nThe selection sorted array is:\n" + Arrays.toString(array1.getArray()) + "\nThe time taken is: " + timeTakenSortArray1);
			
			fullTimeTaken1 = fullTimeTaken1 + (timeTakenArray1 + timeTakenSortArray1); // time taken for uniqueness + time taken for sort
			
		}
		
		System.out.println("\nThe AVERAGE time taken to make array1 unique and sorted is: " + (fullTimeTaken1/n));
		
		System.out.println("\nThe AVERAGE number of operations for SELECTION SORT is: " + (sort1.getOperations()/n));
		*/
		
		/**
		 * Here, I use the UniqueRandomNum constructor to generate a unique random array
		 * then merge sort is used to sort the array.
		 * 
		 * I have used a for loop to collect the time taken by adding my uniqueness algorithm time and the sorting algorithm time.
		 * The average time take is calculated right outside of the loop at the end.
		 */
		
		MergeSort sort2 = new MergeSort();
		long fullTimeTaken2 = 0;
		for (int i=0; i<n; i++) {
		
			// Testing the constructor and sorting with merge sort
			System.out.println("\nCONSTRUCTOR TEST");
			long startArray2 = System.nanoTime();
			UniqueRandomNum array2 = new UniqueRandomNum(1000,2000);
			long endArray2 = System.nanoTime();
			long timeTakenArray2 = (endArray2 - startArray2); // leaving in nanoseconds
			
			System.out.println("\nThe unique random array is:\n" + Arrays.toString(array2.getArray()) + "\nThe time taken is: " + timeTakenArray2);
			
			int[] array = array2.getArray();
			//MergeSort sort2 = new MergeSort();
			long startSortArray2 = System.nanoTime();
	        sort2.sort(array, 0, array.length - 1);
	        long endSortArray2 = System.nanoTime(); 
	        long timeTakenSortArray2 = (endSortArray2 - startSortArray2); // leaving in nanoseconds
	        
	        System.out.println("\nThe merge sorted array is:\n" + Arrays.toString(array2.getArray()) + "\nThe time taken is: " + timeTakenSortArray2);
			
	        fullTimeTaken2 = fullTimeTaken2 + (timeTakenArray2 + timeTakenSortArray2); // time taken for uniqueness + time taken for sort
        
		}
		
		System.out.println("\nThe AVERAGE time taken to make array2 unique and sorted is: " + (fullTimeTaken2/n));
		
		System.out.println("\nThe AVERAGE number of operations for MERGE SORT is: " + (sort2.getOperations()/n));
		
		
        // Testing empty-arg constructor and sorting with selection sort
		/*
		System.out.println("\nEMPTY-ARG CONSTRUCTOR TEST");
		UniqueRandomNum array3 = new UniqueRandomNum();
		
		System.out.println("\nThe unique random array is:\n" + Arrays.toString(array3.getArray()));
		
		SelectionSort sort3 = new SelectionSort();
		sort3.sortNums(array3.getArray());
		System.out.println("\nThe selection sorted array is:\n" + Arrays.toString(array3.getArray()));
		*/
	}

}
