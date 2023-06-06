import Problems.TwoSums;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num_of_problems = 1;

        displayLeetcodeQuestionsTable();
        System.out.println("Which problem do you want to run first?\nEnter your choice:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '1':
                TwoSums twosum = new TwoSums();
        }
    }

    public static void displayLeetcodeQuestionsTable() {
        System.out.printf("Hello and welcome to my Leetcode!\n\n");
        String[][] questions = {
                {"1", "Two Sum", "Given an array of integers nums and an integer target, return indices of the two numbers"},
                {"2.", "Add Two Numbers", "You are given two non-empty linked lists representing two non-negative integers." +
                        " The digits are stored in reverse order, and each of their nodes contains a single digit. " +
                        "Add the two numbers and return the sum as a linked list"}
        };
        // Display the table
        System.out.println("Serial No. | Problem Name                        | Description");
        System.out.println("----------------------------------------------");

        for (String[] question : questions) {
            System.out.printf("%-10s | %-35s | %s%n", question[0], question[1], question[2]);
        }
    }
}