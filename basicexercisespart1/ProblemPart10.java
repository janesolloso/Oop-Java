
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ProblemPart10 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Input an integer: ");
        int number = sc.nextInt();

        int sum = 0;
        int originalNumber = number; 
        
        while (number != 0) {
            sum += number % 10;   
            number /= 10;         
        }

        
        System.out.println("The sum of the digits is: " + sum);

        
    }
}   

