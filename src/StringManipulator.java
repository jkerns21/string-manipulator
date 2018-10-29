import java.util.Scanner;

/**
 * 
 * @author jkerns21
 *
 */
public class StringManipulator 
{

	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String str = keyboard.nextLine();
		char firstLetter = str.charAt(0);
		int strLength = str.length();
		int length = str.length();
		length = length - 1;
		char lastLetter = str.charAt(length);
		System.out.println("The first letter is:  " + firstLetter + "\nThe number of words is:  " +
							strLength + "\nThe last letter is: " + lastLetter);
		
		int half = strLength / 2;
		String firstHalf = str.substring(0, half);
		String secondHalf = str.substring(half);
		System.out.println("\nThe first half is: " + firstHalf + "\n the second half is: " + secondHalf);
		
	}
}
