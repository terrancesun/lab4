package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		
		for (int i = 0; i < unsortedArray.length; i++)
		{
			for (int j = i + 1; j < unsortedArray.length; j++)
			{
				int originalFirst = unsortedArray[i];
				int originalSecond = unsortedArray[j];
				
				if (unsortedArray[i] > unsortedArray[j])
				{
					unsortedArray[i] = originalSecond;
					unsortedArray[j] = originalFirst;
				}
			}
		}
		
		return unsortedArray;
	}
}
