import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSortFinal {

	@Test
	void testPositives() {
		SelectionSort list = new SelectionSort();
		int arr[] = {2,5,9,12,3};
		
		list.selectionSort(arr);
		
		int exp[] = {2,3,5,9,12};
		
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
		assertArrayEquals(exp,arr);
	}

	
	
	@Test
	void testNegatives() {
		SelectionSort list = new SelectionSort();
		int arr[] = {-2,-5,-9,-12,-3};
		
		list.selectionSort(arr);
		
		int exp[] = {-12,-9,-5,-3,-2};
		
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
		assertArrayEquals(exp,arr);
		
		
	}
	
	@Test
	void testMixed() {
		
		SelectionSort list = new SelectionSort();
		int arr[] = {-2,-5,-9,12,3};
		
		list.selectionSort(arr);
		
		int exp[] = {-9,-5,-2,3,12};
		
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
		assertArrayEquals(exp,arr);
		
		
	}

}
