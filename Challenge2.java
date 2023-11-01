package cs_club;

import java.util.*;

public class Challenge2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Player 1, please enter your word. ");
		String word1 = input.next(); // takes word from user

		char word1Arr[] = new char[word1.length()]; // creates char array to store p1's word

		int value1 = 0; // creates int value to store p1's word's score

		for (int i = 0; i < word1.length(); i++) { // for loop to store each character of p1's word in created char array
			
			word1Arr[i] = word1.charAt(i); // initializes word 1 array with p1's word as for loop progresses

			switch (word1Arr[i]) { // switch to check character of index i for point value + add that value to value1 sum
			
			case 'a': 
				value1 = value1 + 1; // if letter at index i is a, add 1 point to value1
				break;
			case 'A': // also checks uppercase A
				value1 = value1 + 1;
				break;
			case 'b': 
				value1 = value1 + 3; // if letter at index i is b, add 3 points to value1
				break;
			case 'B': // also checks uppercase B
				value1 = value1 + 3;
				break;
			case 'c': // etc.
				value1 = value1 + 3;
				break;
			case 'C':
				value1 = value1 + 3;
				break;
			case 'd':
				value1 = value1 + 2;
				break;
			case 'D':
				value1 = value1 + 2;
				break;
			case 'e':
				value1 = value1 + 1;
				break;
			case 'E':
				value1 = value1 + 1;
				break;
			case 'f':
				value1 = value1 + 4;
				break;
			case 'F':
				value1 = value1 + 4;
				break;
			case 'g':
				value1 = value1 + 2;
				break;
			case 'G':
				value1 = value1 + 2;
				break;
			case 'h':
				value1 = value1 + 4;
				break;
			case 'H':
				value1 = value1 + 4;
				break;
			case 'i':
				value1 = value1 + 1;
				break;
			case 'I':
				value1 = value1 + 1;
				break;
			case 'j':
				value1 = value1 + 8;
				break;
			case 'J':
				value1 = value1 + 8;
				break;
			case 'k':
				value1 = value1 + 5;
				break;
			case 'K':
				value1 = value1 + 5;
				break;
			case 'l':
				value1 = value1 + 1;
				break;
			case 'L':
				value1 = value1 + 1;
				break;
			case 'm':
				value1 = value1 + 3;
				break;
			case 'M':
				value1 = value1 + 3;
				break;
			case 'n':
				value1 = value1 + 1;
				break;
			case 'N':
				value1 = value1 + 1;
				break;
			case 'o':
				value1 = value1 + 1;
				break;
			case 'O':
				value1 = value1 + 1;
				break;
			case 'p':
				value1 = value1 + 3;
				break;
			case 'P':
				value1 = value1 + 3;
				break;
			case 'q':
				value1 = value1 + 10;
				break;
			case 'Q':
				value1 = value1 + 10;
				break;
			case 'r':
				value1 = value1 + 1;
				break;
			case 'R':
				value1 = value1 + 1;
				break;
			case 's':
				value1 = value1 + 1;
				break;
			case 'S':
				value1 = value1 + 1;
				break;
			case 't':
				value1 = value1 + 1;
				break;
			case 'T':
				value1 = value1 + 1;
				break;
			case 'u':
				value1 = value1 + 1;
				break;
			case 'U':
				value1 = value1 + 1;
				break;
			case 'v':
				value1 = value1 + 4;
				break;
			case 'V':
				value1 = value1 + 4;
				break;
			case 'w':
				value1 = value1 + 4;
				break;
			case 'W':
				value1 = value1 + 4;
				break;
			case 'x':
				value1 = value1 + 8;
				break;
			case 'X':
				value1 = value1 + 8;
				break;
			case 'y':
				value1 = value1 + 4;
				break;
			case 'Y':
				value1 = value1 + 4;
				break;
			case 'z':
				value1 = value1 + 10;
				break;
			case 'Z':
				value1 = value1 + 10;

			} // end switch

		} // end for loop
		
		System.out.println("Player 1: " + word1); // displays the word player 1 entered

		System.out.println("-----------------------------------"); // formatting
		
		System.out.println("Player 2, please enter your word. ");
		String word2 = input.next(); // takes player 2's word
				
		char word2Arr[] = new char[word2.length()]; // creates char array to store p2's word 
		
		int value2 = 0;

		for (int i = 0; i < word2.length(); i++) { // for loop to store each character of p2's word in created char array
			
			word2Arr[i] = word2.charAt(i); // initializes word 2 array with p2's word as for loop progresses

			switch (word2Arr[i]) { // switch to check character of index i for point value + add that value to value1 sum
			
			case 'a':
				value2 = value2 + 1; // if letter at index i is a, add 1 point to value2
				break;
			case 'A': // also checks uppercase A
				value2 = value2 + 1;
				break;
			case 'b': // etc.
				value2 = value2 + 3;
				break;
			case 'B':
				value2 = value2 + 3;
				break;
			case 'c':
				value2 = value2 + 3;
				break;
			case 'C':
				value2 = value2 + 3;
				break;
			case 'd':
				value2 = value2 + 2;
				break;
			case 'D':
				value2 = value2 + 2;
				break;
			case 'e':
				value2 = value2 + 1;
				break;
			case 'E':
				value2 = value2 + 1;
				break;
			case 'f':
				value2 = value2 + 4;
				break;
			case 'F':
				value2 = value2 + 4;
				break;
			case 'g':
				value2 = value2 + 2;
				break;
			case 'G':
				value2 = value2 + 2;
				break;
			case 'h':
				value2 = value2 + 4;
				break;
			case 'H':
				value2 = value2 + 4;
				break;
			case 'i':
				value2 = value2 + 1;
				break;
			case 'I':
				value2 = value2 + 1;
				break;
			case 'j':
				value2 = value2 + 8;
				break;
			case 'J':
				value2 = value2 + 8;
				break;
			case 'k':
				value2 = value2 + 5;
				break;
			case 'K':
				value2 = value2 + 5;
				break;
			case 'l':
				value2 = value2 + 1;
				break;
			case 'L':
				value2 = value2 + 1;
				break;
			case 'm':
				value2 = value2 + 3;
				break;
			case 'M':
				value2 = value2 + 3;
				break;
			case 'n':
				value2 = value2 + 1;
				break;
			case 'N':
				value2 = value2 + 1;
				break;
			case 'o':
				value2 = value2 + 1;
				break;
			case 'O':
				value2 = value2 + 1;
				break;
			case 'p':
				value2 = value2 + 3;
				break;
			case 'P':
				value2 = value2 + 3;
				break;
			case 'q':
				value2 = value2 + 10;
				break;
			case 'Q':
				value2 = value2 + 10;
				break;
			case 'r':
				value2 = value2 + 1;
				break;
			case 'R':
				value2 = value2 + 1;
				break;
			case 's':
				value2 = value2 + 1;
				break;
			case 'S':
				value2 = value2 + 1;
				break;
			case 't':
				value2 = value2 + 1;
				break;
			case 'T':
				value2 = value2 + 1;
				break;
			case 'u':
				value2 = value2 + 1;
				break;
			case 'U':
				value2 = value2 + 1;
				break;
			case 'v':
				value2 = value2 + 4;
				break;
			case 'V':
				value2 = value2 + 4;
				break;
			case 'w':
				value2 = value2 + 4;
				break;
			case 'W':
				value2 = value2 + 4;
				break;
			case 'x':
				value2 = value2 + 8;
				break;
			case 'X':
				value2 = value2 + 8;
				break;
			case 'y':
				value2 = value2 + 4;
				break;
			case 'Y':
				value2 = value2 + 4;
				break;
			case 'z':
				value2 = value2 + 10;
				break;
			case 'Z':
				value2 = value2 + 10;

			} // end switch

		} // end for loop
		
		System.out.println("Player 2: " + word2); // displays word player 2 entered

		System.out.println(); // formatting

		if (value1 > value2) { // if to process win conditions 
			System.out.println("Player 1 wins! (P1 word value = " + value1 + ", P2 word value = " + value2);
		} else if (value2 > value1) {
			System.out.println("Player 2 wins! (P1 word value = " + value1 + ", P2 word value = " + value2);
		} else if (value1 == value2) {
			System.out.println("It's a tie! (P1 word value = " + value1 + ", P2 word value = " + value2);
		}

	}

}

/*

Sample output:  

Player 1, please enter your word. 
Player 1: code
-----------------------------------
Player 2, please enter your word. 
Player 2: code

It's a tie! (P1 word value = 7, P2 word value = 7

*/