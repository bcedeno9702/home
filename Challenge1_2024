package cs_club;
import java.util.*;

public class Challenge1_2024 {

	public static void main(String[] args) {
				
		System.out.println("Please enter your text sample: "); // prompts user to enter text
		
		Scanner input = new Scanner(System.in); // creates Scanner obj
		String userText = input.nextLine(); // takes user input as a String variable
				
		System.out.println("You wrote: " + userText); // prints user input
		
		int count = 0; // count variable
		
		// creates variables for word, letter, sentence counts
		double wordCount = 1;
		double letterCount = 0;
		double sentenceCount = 0;
		
		while(count < userText.length()) { // while there's still more characters left in the string...
			
			if (userText.charAt(count) == ' ') { // if a space is read, increase word count by 1
				wordCount++;
			}
			// if a letter is read, increase letter count by 1
			else if (userText.toLowerCase().charAt(count) == 'a' || userText.toLowerCase().charAt(count) == 'b' 
					|| userText.toLowerCase().charAt(count) == 'c' || userText.toLowerCase().charAt(count) == 'd' 
					|| userText.toLowerCase().charAt(count) == 'e' || userText.toLowerCase().charAt(count) == 'f' 
					|| userText.toLowerCase().charAt(count) == 'g' || userText.toLowerCase().charAt(count) == 'h' 
					|| userText.toLowerCase().charAt(count) == 'i' || userText.toLowerCase().charAt(count) == 'j' 
					|| userText.toLowerCase().charAt(count) == 'k' || userText.toLowerCase().charAt(count) == 'l' 
					|| userText.toLowerCase().charAt(count) == 'm' || userText.toLowerCase().charAt(count) == 'n' 
					|| userText.toLowerCase().charAt(count) == 'o' || userText.toLowerCase().charAt(count) == 'p' 
					|| userText.toLowerCase().charAt(count) == 'q' || userText.toLowerCase().charAt(count) == 'r' 
					|| userText.toLowerCase().charAt(count) == 's' || userText.toLowerCase().charAt(count) == 't' 
					|| userText.toLowerCase().charAt(count) == 'u' || userText.toLowerCase().charAt(count) == 'v' 
					|| userText.toLowerCase().charAt(count) == 'w' || userText.toLowerCase().charAt(count) == 'x' 
					|| userText.toLowerCase().charAt(count) == 'y' || userText.toLowerCase().charAt(count) == 'z') {
					
					letterCount++;
			}
			// if a sentence is finished, increase sentence count by 1
			else if (userText.charAt(count) == '.' || userText.charAt(count) == '!' || userText.charAt(count) == '?') {
				sentenceCount++;
			}
			count++;
		}
		
		// value checks provided if necessary
		// System.out.println("Word count: " + wordCount);
		// System.out.println("Letter count: " + letterCount); 
		// System.out.println("Sentence count: " + sentenceCount); 
		
		double avgLetters = letterCount / wordCount * 100; // find average number of letters per 100 words
		
		double avgSentences = sentenceCount / wordCount * 100; // find average number of sentences per 100 words
		
		int gradeLvl = (int) (0.0588 * avgLetters - 0.296 * avgSentences - 15.8); // performs CLI calculation with found values
		
		System.out.println("Grade level required to understand: Grade " + gradeLvl); // prints calculated grade level for user

	}

}

// Sample Output:
// Please enter your text sample: 
// I can never read all the books I want; I can never be all the people I want and live all the lives I want. I can never train myself in all the skills I want. And why do I want? I want to live and feel all the shades, tones and variations of mental and physical experience possible in my life. And I am horribly limited.
// You wrote: I can never read all the books I want; I can never be all the people I want and live all the lives I want. I can never train myself in all the skills I want. And why do I want? I want to live and feel all the shades, tones and variations of mental and physical experience possible in my life. And I am horribly limited.
// Grade level required to understand: Grade 3

// [Quote from Sylvia Plath]
