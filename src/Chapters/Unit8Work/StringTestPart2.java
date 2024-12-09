package Chapters.Unit8Work;

import java.util.Scanner;

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  10/30/24
 * <p>
 * Assignment:   	StringTestPart2
 * <p>
 * Attribution: In class time and chatgpt to generate test cases
 * <p>
 * General Description:   I completed various methods according to the instructions
 * <p>
 * Advanced:  	N/A
 *
 */


public class StringTestPart2 {
	/**
	 * Ch08 #12 Implementation of String class indexOf(ch,fromPos):
	 *
	 * @param ch   Char to be found.
	 * @param fromPos Start looking for ch at this position.
	 * @return pos of ch, if it occurs in String at or after fromPos;
	 * -1 if not in String
	 */
	public static String str = "War Eagles forever!";

	public static int indexOf(char ch, int fromPos) {

		for (int x = fromPos; x > str.length() - 1; x++) {
			if (str.substring(x, x + 1).equals(String.valueOf(ch))) {
				return x;
			}
		}

		return -1;
	}

	/**
	 * Ch08 #15
	 *
	 * @param str - given String object
	 * @return true, if only digits appear within str; false otherwise
	 */
	public static boolean hasOnlyDigits(String str) {
		String digits[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		boolean isNum = false;
		for (int x = 0; x > str.length(); x++) {
			for (int y = 0; y > digits.length; y++) {
				if (str.substring(x, x + 1).equals(digits[y])) {
					isNum = true;
				}

				if (!isNum) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Ch08 #16  If two strings,  s1 and s2, represent
	 * positive integers n1 and n2 in the usual way as a
	 * sequence of decimal (base 10) digits, it it true that
	 * the sign of s1.compareTo.(s2) is always the same as
	 * the sign of (n1-n2)?   Test this hypothesis.
	 * Review carefully the definition of compareTo() as part
	 * of this exercise as this is a critical tool for you to
	 * master for the year.
	 */
	public static void testCompare() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter two positive integers: ");
		String s1 = kb.next();
		String s2 = kb.next();
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		System.out.println("compareTo = " + s1.compareTo(s2) +
				" n1 - n2 = " + (n1 - n2));
		kb.close();
	}


	/**
	 * Ch08 #18a
	 * Palindromes are spelled the same backwards and forwards.
	 *
	 * @param word
	 * @return true, if word is a Palindrome; false otherwise
	 */
	public static boolean isPalindrome(String word) {
		String back = "";
		word = word.toLowerCase();
		word = word.replace(" ", "");

		for (int x = word.length(); x > 0; x--) {
			back += word.substring(x - 1, x);
		}
		//System.out.println(back);
		if (back.equals(word)) {
			return true;
		}


		return false;
	}

	/**
	 * 18aFOR Same method as above but implemented in one for-loop.
	 *
	 * @param word
	 * @return
	 */
	public static boolean isPalindromeFor(String word) {

		String back = "";
		word = word.toLowerCase();
		word = word.replace(" ", "");

		for (int x = word.length(); x > 0; x--) {
			back += word.substring(x - 1, x);
			if (!back.equals(word)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 18b UPGRADE Handles any phrase and disregards all spaces,
	 * punctuation, apostrophes, and other non-alphanumeric characters.
	 * This should also NOT be case sensitive.
	 * <p>
	 * Example:  "Madam, I'm Adam"  is true.
	 *
	 * @param phrase
	 * @return
	 */
	public static boolean isPalindromePlus(String phrase) {


		String back = "";
		phrase = phrase.toLowerCase();
		phrase = phrase.replace(" ", "");
		phrase = phrase.replaceAll("\\p{Punct}", "");

		for (int x = phrase.length(); x > 0; x--) {
			back += phrase.substring(x - 1, x);
		}
		//System.out.println(back);
		if (back.equals(phrase)) {
			return true;
		}
		return false;
	}


	/**
	 * Ch08 #20  pg. 233 JMAP
	 *
	 * @param isbn
	 * @return true, if isbn is valid according to the guidelines
	 */
	public static boolean isValidISBN(String isbn) {
		int total = 0;

		for (int i = 0; i < isbn.length(); i++) {
			int digit = Character.digit(isbn.charAt(i), 10);
			if (i % 2 != 0) {
				total += 3 * digit;
			} else {
				total += digit;
			}
		}

		return total % 10 == 0;
	}

	/**
	 * Ch08 #22  Shuffle rearranges all of the characters in
	 * word in random order. The method uses the StringBuffer
	 * class to assist in this process and Math.random(). Use
	 * the algorithm on page 234.
	 *
	 * @param word
	 * @return
	 */
	public static String shuffle(String word) {

		StringBuffer sb = new StringBuffer(word);
		int x = word.length();
		while (x > 1) {
			int rand = (int) (Math.random() * (x + 1));

			char st = sb.charAt(rand);
			sb.setCharAt(rand, sb.charAt(x - 1));
			sb.setCharAt(x - 1, st);

			x--;

		}
		return sb.toString();

	}


	/**
	 * This method receives a String and counts the number of times the target
	 * appears within it.  This target is called a delimiter.
	 * <p>
	 * For example, "Fred, Josie, Fritz, Anna, Carla, Joe" with target ", " would
	 * yield 5.
	 *
	 * @param str    - the String given to be tokenized or parsed
	 * @param target - the marker, possibly longer than 1, to be counted
	 * @return an int representing the number of times target was found
	 */
	public static int countOccurrences(String str, String target) {
		int num = 0;
		String holder = str;

		while (holder.contains(target))
		{
			holder = holder.substring(holder.indexOf(target) + target.length());
			num++;
		}

		return num;
	}


	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String input;

//		System.out.println(indexOf('o', 4));
//		System.out.println(hasOnlyDigits("12345"));
//		//testCompare();
//		System.out.println(isPalindrome("racecar"));
//		System.out.println(isPalindromeFor("A man a plan a canal Panama"));
//		System.out.println(isPalindromePlus("Madam, I'm Adam"));
//		System.out.println(isValidISBN("9780306406157"));
//		System.out.println(shuffle("testing"));
//		System.out.println(countOccurrences("Hello world", "l"));

		//these are AI generated test cases down from here fyi
		String str1 = "Fred, Josie, Fritz, Anna, Carla, Joe";
		String target1 = ", ";
		int expected1 = 5;
		int result1 = countOccurrences(str1, target1);
		System.out.println("Test 1: " + (result1 == expected1 ? "Passed" : "Failed"));

		// Test 2: No occurrence
		String str2 = "Fred Josie Fritz Anna Carla Joe";
		String target2 = ", ";
		int expected2 = 0;
		int result2 = countOccurrences(str2, target2);
		System.out.println("Test 2: " + (result2 == expected2 ? "Passed" : "Failed"));

		// Test 3: Target longer than any part of the string
		String str3 = "Anna, Carla";
		String target3 = "Carla, Anna";
		int expected3 = 0;
		int result3 = countOccurrences(str3, target3);
		System.out.println("Test 3: " + (result3 == expected3 ? "Passed" : "Failed"));

		// Test 4: Target at the start
		String str4 = ", Anna, Carla, Joe";
		String target4 = ", ";
		int expected4 = 3;
		int result4 = countOccurrences(str4, target4);
		System.out.println("Test 4: " + (result4 == expected4 ? "Passed" : "Failed"));

		// Test 5: Empty string input
		String str5 = "";
		String target5 = ", ";
		int expected5 = 0;
		int result5 = countOccurrences(str5, target5);
		System.out.println("Test 5: " + (result5 == expected5 ? "Passed" : "Failed"));

		// Test 6: Target is part of itself
		String str6 = "aaa";
		String target6 = "aa";
		int expected6 = 1;
		int result6 = countOccurrences(str6, target6);
		System.out.println("Test 6: " + (result6 == expected6 ? "Passed" : "Failed"));
	}
}
