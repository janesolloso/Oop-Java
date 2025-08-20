package sollosoprojectexercises2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = sc.nextLine();

        if (input.length() != 1) {
            System.out.println("Error: Please enter a single character.");
            
        } else {
            char ch = input.charAt(0);

           
            if (!Character.isLetter(ch)) {
                System.out.println("Error: Input is not a letter.");
                
            } else {
                
                System.out.println("Expected output: ");
                   
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }
            }
        }
    
    }

}