/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcounter;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class VowelCounter {

    public static int countVowels(String sentence) {
        sentence = sentence.toLowerCase();

        int vowelCount = 0;

        String vowels = "aeiou";

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (vowels.indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        int numberOfVowels = countVowels(inputSentence);
        System.out.println("The number of vowels in the sentence is: " + numberOfVowels);
    }
}

