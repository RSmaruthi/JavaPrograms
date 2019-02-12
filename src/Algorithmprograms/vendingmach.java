package Algorithmprograms;

import utility.util;

public class vendingmach 
{

	public static void main(String[] args) 
	{
		
		int[] notes = {1000,500,100,50,10,5,2,1};
		int changeRequired;
		vendingmach vm = new vendingmach();
		System.out.println("Enter the change required...!");
		changeRequired = util.getPositiveInt();
		int numOfNotes = vm.vendingmachine(notes, changeRequired);
		System.out.println("Number of minimum notes required : "+ numOfNotes);

	}
		
	public int vendingmachine(int[] notes, int rupee)
	{
		int notecount= 0;
		int count=0;
		if(rupee == 0 )
			return -1;
		for(int i=0;i<notes.length;i++)
		{
			if(rupee >=notes[i])		
			{
				notecount = (rupee/notes[i]);
				System.out.println(notes[i]+ "\t : "+notecount);
				rupee = (rupee % notes[i]);
				count++;
			}
		}
		return count;				
	}   
}
