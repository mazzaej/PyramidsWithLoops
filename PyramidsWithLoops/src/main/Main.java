/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		int lines = 1;
		
		for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5 - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k <= i; k++) {
	            	if (lines>1) {
	            		System.out.print(lines);
	            		System.out.print(lines);
	         
	            }
	            	else	System.out.print(lines + " "); 
	            }
	            System.out.println();
	            lines++;
		 	}
		}
	
}

