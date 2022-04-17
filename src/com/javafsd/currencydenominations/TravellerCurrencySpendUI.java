package com.javafsd.currencydenominations;

import java.util.Scanner;

public class TravellerCurrencySpendUI {
	
	private int[] denominations;
	private Scanner input;
	
	public TravellerCurrencySpendUI()
	{
		input = new Scanner(System.in);
	}
	
	public void init()
	{
		gatherInputsAndProcess();
	}
	
	private void gatherInputsAndProcess()
	{
		System.out.println("Enter the size of currency denominations:");
		int denominationArraySize = input.nextInt();
		
		denominations = new int[denominationArraySize];
		
		
		System.out.println("Enter the currency denominations value:");
		for (int index = 0; index < denominationArraySize; index ++) {

			denominations[index] = input.nextInt();
			input.nextLine();
		}		
		
		System.out.println("Enter the amount you want to pay:");	
		int payAmount = input.nextInt();	

		CurrenyDenominations determinator = 
			new CurrenyDenominations(denominations, 
					payAmount);
		determinator.determine();
		
		
		
	}
	
	

}
