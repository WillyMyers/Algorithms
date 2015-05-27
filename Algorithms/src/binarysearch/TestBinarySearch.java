package binarysearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBinarySearch {

	BinarySearch bs = new BinarySearch();
	
	@Test
	public void testSearchLow() {
		int[] arr = new int[]{1,3,4,5,6,8,9,11,13,14,15,25};
		assertTrue(2 == bs.search(arr, 4));
	}
	
	@Test
	public void testSearchHigh() {
		int[] arr = new int[]{1,3,4,5,6,8,9,11,13,14,15,25};
		assertTrue(9 == bs.search(arr, 14));
	}
	
	@Test
	public void testSearchStart() {
		int[] arr = new int[]{1,3,4,5,6,8,9,11,13,14,15,25};
		assertTrue(0 == bs.search(arr, 1));
	}
	
	@Test
	public void testSearchEnd() {
		int[] arr = new int[]{1,3,4,5,6,8,9,11,13,14,15,25};
		assertTrue(11 == bs.search(arr, 25));
	}
	
	@Test
	public void testSearchNull() {
		int[] arr = new int[]{1,3,4,5,6,8,9,11,13,14,15,25};
		assertTrue(-1 == bs.search(arr, 30));
	}
	
	@Test
	public void testSearchPerformance() {
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		assertTrue(-1 == bs.search(arr, 30));
	}

}
