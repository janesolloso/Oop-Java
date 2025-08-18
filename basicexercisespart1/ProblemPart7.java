
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ProblemPart7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       

        
        System.out.print("Input a number: ");
        int number = sc.nextInt();
        
        System.out.println("Expected output");

        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

       
        
    }
}
        
    