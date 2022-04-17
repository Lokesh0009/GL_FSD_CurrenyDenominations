package com.javafsd.currencydenominations;

public class DataStructure {
	
	public static String printAndReturn(int[] array)
	{
		StringBuilder result = new StringBuilder();
		result.append("");
		for(int index = 0; index < array.length; index++)
		{
			result.append(array[index]);
			
			if(index != (array.length - 1))
			{
				result.append(", ");
			}
		}
		result.append("");
		return result.toString();
		
	}

}
