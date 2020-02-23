package Chap4;

import java.util.Scanner;

public class CountAlphabetInSentence {

    public static void main(String[] args) {

        System.out.print("Please Enter Sentense : ");
        Scanner A = new Scanner(System.in);
        String sentence = A.nextLine();
        int nameLength = sentence.length();
        int i, n = 0, m = 0;
        System.out.println("The sentence contains alphabets : " + sentence.length());
        sentence = sentence.toLowerCase();
        for (i = 0; i < sentence.length(); i++) {
            char a = sentence.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                n++;
            } else {
                m++;
            }
        }
        System.out.println("The sentence contains vowels : " + n);
        System.out.println("The sentence contains not vowels : " + m);
    }
}
