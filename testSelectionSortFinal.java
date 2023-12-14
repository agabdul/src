import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSortFinal {

	@Test
	void testPositives() {
		SelectionSort list = new SelectionSort();
		int arr[] = {20,50,90,120,30};
		
		list.selectionSort(arr);
		
		int exp[] = {20,30,50,90,120};
		
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
		assertArrayEquals(exp,arr);
	}

	
	
	@Test
	void testNegatives() {
		SelectionSort list = new SelectionSort();
		int arr[] = {-20,-50,-90,-120,-30};
		
		list.selectionSort(arr);
		
		int exp[] = {-120,-90,-50,-30,-20};
		
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
		assertArrayEquals(exp,arr);
		
		
	}
	
	@Test
	void testMixed() {
		
		SelectionSort list = new SelectionSort();
		int arr[] = {-20,-50,-90,120,30};
		
		list.selectionSort(arr);
		
		int exp[] = {-90,-50,-20,30,120};
		
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
		assertArrayEquals(exp,arr);
		
		
	}

}
