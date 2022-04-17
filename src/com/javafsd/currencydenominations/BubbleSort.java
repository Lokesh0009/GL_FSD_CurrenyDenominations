package com.javafsd.currencydenominations;


public class BubbleSort {
	
	private int[] data;

	public BubbleSort(int[] data) {

		this.data = data;
	}

	public void sort() {
		sortAsc();
	}
	
	public void sortAsc() {

		int length = data.length;
		for (int iIndex = 0; iIndex < (length - 1); iIndex++) {
		
			for (int jIndex = 0; jIndex < (length - iIndex - 1); jIndex++) {
			
				if (data[jIndex] > data[jIndex + 1]) {
				
					int temp = data[jIndex];
					data[jIndex] = data[jIndex + 1];
					data[jIndex + 1] = temp;
				}
			}
		}

	}
	
	public void sortDesc() {
	
		int length = data.length;
		for (int iIndex = 0; iIndex < (length - 1); iIndex++) {
		
			for (int jIndex = 0; jIndex < (length - iIndex - 1); jIndex++) {
			
				if (data[jIndex] < data[jIndex + 1]) {
				
					int temp = data[jIndex];
					data[jIndex] = data[jIndex + 1];
					data[jIndex + 1] = temp;
				}
			}
		}		
	}

}
