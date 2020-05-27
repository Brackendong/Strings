/*
* StringFun.java
* Author: JiaoAng Dong
* Submission Date: 10/3/2019
*
* Purpose: The user chooses six different ways to manipulate 
* a work/phrase and the program will compute that method
 *
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/
import java.util.Scanner;

public class StringFun {
	
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		String output = "";             // the final result after each method
		String input = "";              // the initial input the user takes in
		char output1;                   // special case for the method reverse, changing str to char
		String replacechar = "" ;       // the character you want to replace  *2nd command
		String newchar = "";            // the new character you replaced  *2nd command 
		String replacelastchar = "";    // the last character you want to replace *3rd
		String newlastchar = "";        // the new last character you replaced *3rd
		int lastcharindex;              // the index of the last char *3rd
		String removechar = "";         // the char you want to remove *4th 
		int removelocation;             // the chars index/location *4th
		int removecount = 0;            // the count of occurrence for the remove method *4th
		char removeallchar;             // the char you wanted to "remove all"
		
		// creates all the needed variables used later
		
		
		for ( int i=0 ; i < 9999999 ; i++) {
		// so that the loop goes forever until exit is choosen
			
		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)\n");
		String command = keyboard.nextLine();
		
		// take in one of the six commands used 
		
// 1st: reverse 
		
		if ( command.equalsIgnoreCase("reverse")) {
		System.out.print("Enter the string to be manipulated");
		input = keyboard.nextLine();
		output1 = input.charAt(0); 
		for ( int b = input.length()-1 ; b < input.length() && b >= 0 ; b-- ) {
			
			output1 = input.charAt(b);
			System.out.print(output1);
		}
		}
		
// 2nd: replace first 		
		
		else if ( command.equalsIgnoreCase("replace first")) {
		System.out.print("Enter the string to be manipulated");
		input = keyboard.nextLine();
		System.out.print("Enter the character to replace");
		replacechar = keyboard.next();
		System.out.print("Enter the new character");
		newchar = keyboard.next();
		int replacecharindex = input.indexOf(replacechar);
		output = input.substring(0, replacecharindex) + newchar + input.substring(replacecharindex+1);
		System.out.println("the new sentense is: " + output);
		}
		
//  3rd: replace last
		
		else if ( command.equalsIgnoreCase("replace last")) {
		System.out.print("Enter the string to be manipulated");
		input = keyboard.nextLine();
		System.out.print("Enter the character to replace");
		replacelastchar = keyboard.next();
		System.out.print("Enter the new character");
		newlastchar = keyboard.next();
		lastcharindex = input.lastIndexOf(replacelastchar);
		output = input.substring(0, lastcharindex) + newlastchar + input.substring(lastcharindex+1);
		System.out.println("the new sentense is: " + output);	
		}
		
// 4th: remove
		else if ( command.equalsIgnoreCase("remove") ){

		System.out.print("Enter the string to be manipulated");
		input = keyboard.next();	
		System.out.print("Enter the character to remove");
		removechar = keyboard.next();
		char removeChar2 = removechar.charAt(0);
		System.out.print(" Enter the a you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
		removelocation = keyboard.nextInt();
		output = "";
		for ( int c = 0 ; c < input.length() ; c++) {
				if ( input.charAt(i) == removeChar2 ) {
					removecount++;
					if (removecount == removelocation) {
						output = input.substring(0 , i) + input.substring(i+1);
						
					}
				
				}
			  }
			System.out.println ("the new sentense is: " + output);
		}
		
// 5th: remove all 
		
		else if ( command.equalsIgnoreCase("remove all" )) {
			
		System.out.print("Enter the string to be manipulated");
		input = keyboard.nextLine();
		System.out.print("Enter the charater to remove");
		removeallchar = keyboard.next().charAt(0);
		output = "";
		for ( int w = 0 ; w < input.length() ; w ++) {
			if ( input.charAt(w) != removeallchar) {
					output  += input.substring(w,w+1) ;
				}
			}
		System.out.println("the new sentense is: " + output);
 
		
		}
// 6th: exit 
		
		else if ( command.equalsIgnoreCase("quit" )) {
        System.exit(0);
		
		}
		
		
		}
		}}
