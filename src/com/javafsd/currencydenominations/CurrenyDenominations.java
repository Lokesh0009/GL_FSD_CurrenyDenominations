package com.javafsd.currencydenominations;

import java.util.Arrays;

public class CurrenyDenominations {
	
	private int[] denominations;
	private int payAmount;
	
	private int[] resultDenominationArray;
	private int[] resultDenominationCountArray;
	
	public CurrenyDenominations(
		int[] denominations, int payAmount) {
		
		this.denominations = denominations;
		this.payAmount = payAmount;
		
		this.resultDenominationArray = new int[this.denominations.length];
		this.resultDenominationCountArray = new int[this.denominations.length];
		
	}
	
	public void determine() {
		
		sort();
		
		int index = 0;
		int resultIndex = 0;
		int balancedOutPayAmount = payAmount;
		while (index < denominations.length) {
			
			int denomination = denominations[index];
			
			int quotient = balancedOutPayAmount / denomination;
			
			int remainder = balancedOutPayAmount % denomination;

			if (quotient !=0) {

				int temp = denomination * quotient;				
				
				balancedOutPayAmount = balancedOutPayAmount - (temp);

				resultDenominationArray[resultIndex] = denomination;
				
				resultDenominationCountArray[resultIndex] = quotient;		
				
				resultIndex ++;
				
				if (remainder != 0) {

				}else if (remainder == 0) {
					
					if (balancedOutPayAmount == 0) {
						printSuccessMessage(resultIndex);
						break;
					}
				}
				
			}else if (quotient == 0) {
				
				if (remainder != 0) {
					
					if (!isLastDenomination(index)) {

					}else {
						printErrorMessage();
						break;						
					}
				}else if (remainder == 0) {

					break;
				}
			}						
			index ++;
		}
		
	}
	
	
	private void sort() {
	
		BubbleSort bubbleSort = new BubbleSort(denominations);		
		bubbleSort.sortDesc();
	}
	
	private boolean isLastDenomination(int index) {
		
		if (index == denominations.length - 1) {
			return true;
		}else {
			return false;
		}
	}
	
	private void printErrorMessage() {
		
		System.out.println(
			"For the denomination values " 
				+ DataStructure.printAndReturn(denominations) +
					", it is not possible to give for the payment amount ["+ 
						payAmount + "]");
	}
	
	private void printSuccessMessage(int resultIndex) {
		
		resultDenominationArray 
			= Arrays.copyOf(resultDenominationArray, resultIndex);
		
		resultDenominationCountArray 
			= Arrays.copyOf(resultDenominationCountArray, resultIndex);
		
		System.out.println("Your payment approach in order to give min no of notes will be:");

		for (int index = 0; index < resultDenominationArray.length; index ++) {
			
			int denomination = resultDenominationArray[index];
			int denominationCount = resultDenominationCountArray[index];
			
			System.out.println( denomination + ":" + denominationCount );
		}		
	}
	
	

}
