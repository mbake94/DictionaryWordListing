//        1.	Create an array that can hold 10 variables
//        2.	Prompt user to enter 10 words
//        a.	Write a for loops for prompt user 10 times
//        3.	Print out the 10 words that were entered
//        4.	Find first letter of each word
//        5.	Bubble sort the words to be printed in alphabetical order
//        6.	Print words (in alphabetical order)
//        7.	Print words (in reverse alphabetical order)
//        8.	Print words the start with a vowel (a, e, I, o, u)

import java.util.Arrays;
import java.util.Scanner;

public class DictionaryWordListing {
    public static void main(String[] args) {

//  Create an array that can hold 10 variables
//  Create an array of numbers, so user knows which # string they are writing

        String ten[] = new String[10];
        String num[] = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth"};

//  Prompt user to enter 10 words
//  Print out which prompt is being asked (first, second, third,...)

        for (int i = 0; i < ten.length; i++) {
            System.out.printf("Please enter you %s word: ", num[i]);
            Scanner keybd = new Scanner(System.in);
            ten[i] = keybd.next();
        }
        System.out.println("The strings entered are:    " + Arrays.toString(ten));
//  Sort array in ascending order

        String holder;
        for (int a = 0; a < ten.length; a++) {
            for (int i = a + 1; i < ten.length; i++) {
                // comparing adjacent strings
                if (ten[i].compareTo(ten[a]) < 0) { // i compare j less than 0
                    holder = ten[a];
                    ten[a] = ten[i];
                    ten[i] = holder;
                }
            }
        }
        System.out.println("The strings in ascending order are:   " + Arrays.toString(ten));
 //  Sort array in descending order
        String placer;
        for (int d = 0; d < ten.length; d++) {
            for (int i = d + 1; i < ten.length; i++) {
                // comparing adjacent strings
                if (ten[i].compareTo(ten[d]) > 0) { // i compare j greater than 0
                    placer = ten[d];
                    ten[d] = ten[i];
                    ten[i] = placer;
                }
            }
        }
     System.out.println("The strings in descending order are:   " + Arrays.toString(ten));
    }
}

