package binarysearch;

/**
 * Binary search which runs in O(log n) so an array of 12 elements will take at
 * worst 4 attempts and an array of 24 elements will take at worst 5 attempts....probably
 * 
 * @author willy
 *
 */
public class BinarySearch {

	public int search(int[] in, int type) {
		if (in == null || in.length < 1) {
			return -1;
		}
		int count = 0;
		int low = 0;
		int high = in.length - 1;

		while (low <= high) {
			count++;
			System.out.println(count);
			int mid = (low + high) / 2;
			if (in[mid] == type) {
				return mid;
			} else if (in[mid] >= type) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
