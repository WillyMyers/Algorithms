package insertionsort;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInsertionSort {

	InsertionSort is = new InsertionSort();
	@Test
	public void testSort() {
		int[] in = new int[]{57, 90, 80, 48, 35, 91, 1, 83, 32, 53};
		is.sort(in);
	}

}
