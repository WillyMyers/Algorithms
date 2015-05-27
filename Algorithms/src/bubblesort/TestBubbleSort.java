package bubblesort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestBubbleSort {

	BubbleSort bs = new BubbleSort();
	@Test
	public void testSort() {
		int[] arr = new int[]{9,4,6,7,3,2,1,5,8};
		int[] sorted = new int[]{1,2,3,4,5,6,7,8,9};
		assertTrue(Arrays.equals(bs.sort(arr), sorted));
	}

}
