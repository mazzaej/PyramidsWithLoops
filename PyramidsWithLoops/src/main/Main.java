/*
 * Eric Mazza
 * mazzaej@mail.uc.edu
 * IS4010
 * 09192019
 * Assignment 04
*/
package main;

public class Main {

	public static void main(String[] args) {
		int lines = 1;
		
		//Loop for spacing
		for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5 - i; j++) {
	                System.out.print(" ");
	            }
	            
	            //Loop for printing number
	            for (int k = 0; k <= i; k++) {
	            	
	              // if/else logic to gain correct structure
	            	if (lines>1&&k!=lines-1) {
	            		System.out.print(lines);
	            		System.out.print(lines);
	         
	            }
	            	else	System.out.print(lines + " "); 
	            }
	            //drop down a line
	            System.out.println();
	            lines++;
		 	}
		}
	
}

