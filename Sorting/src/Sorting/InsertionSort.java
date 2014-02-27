package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an unsortedArray of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted unsortedArray of integers
	 * @return					the input unsortedArray, sorted least to greatest
	 */
	
    public static int[] insertionSort(int unsortedArray[])
    {	
        for (int i = 1; i < unsortedArray.length; i++){
        	int j = i;
        	while(j > 0 && unsortedArray[j-1] > unsortedArray[j]){
        		int bob = unsortedArray[j-1];
        		unsortedArray[j-1] = unsortedArray[j];
        		unsortedArray[j] = bob;
        		j--;
        	}
        	
        }

        return unsortedArray;
    }
}
