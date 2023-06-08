import Problems.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num_of_problems = 1;
//        AddTwoNumbers obj2 = new AddTwoNumbers();
//        PalindromeNumber obj = new PalindromeNumber();
        displayLeetcodeQuestionsTable();
        System.out.println("Which problem do you want to run first?\nEnter your choice:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '1':
                TwoSums obj1 = new TwoSums(); break;
            case '2':
                AddTwoNumbers obj2 = new AddTwoNumbers(); break;
            case '3':
                LongestSubstringWithoutRepeatingCharacters obj3 = new LongestSubstringWithoutRepeatingCharacters(); break;
            case '4':
                MedianOfTwoSortedArrays obj4 = new MedianOfTwoSortedArrays(); break;
            case '9':
                PalindromeNumber obj9 = new PalindromeNumber(); break;
            default:
                System.out.println("invalid input!");
        }
    }

    public static void displayLeetcodeQuestionsTable() {
        System.out.printf("Hello and welcome to my Leetcode!\n\n");
        String[][] questions = {
                {"1", "Two Sum"},
                {"2.", "Add Two Numbers"},
                {"3.", "Longest Substring Without Repeating Characters"},
                {"4.", "Median of Two Sorted Arrays"},
                {"9.", "Palindrome Number"},
        };
        // Display the table
        System.out.println("Serial No. | Problem Name                        ");
        System.out.println("----------------------------------------------");

        for (String[] question : questions) {
            System.out.printf("%-10s | %-35s %n", question[0], question[1]);
        }
    }
}