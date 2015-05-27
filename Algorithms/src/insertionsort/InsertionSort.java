package insertionsort;

import sort.Sort;

public class InsertionSort implements Sort {

	/* (non-Javadoc)
	 * @see insertionsort.SOrt#sort(int[])
	 */
	@Override
	public int[] sort(int[] in){
		for (int i = 1; i < in.length; i++) {
            int valueToSort = in[i];
            int j = i;
            while (j > 0 && in[j - 1] > valueToSort) {
                in[j] = in[j - 1];
                j--;
            }
            in[j] = valueToSort;
        }
		return in;
	}
}
