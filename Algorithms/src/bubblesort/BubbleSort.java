package bubblesort;

import sort.Sort;

public class BubbleSort implements Sort{

	public int[] sort(int[] in) {
		if (in == null || in.length == 0) {
			return in;
		}
		int temp = 0;
		boolean sorting = true;
		while (sorting) {
			sorting = false;
			for (int i = 0; i < in.length - 1; i++) {
				if (in[i] > in[i + 1]) {
					temp = in[i];
					in[i] = in[i + 1];
					in[i + 1] = temp;
					sorting = true;
				}
			}
		}

		return in;
	}

}
