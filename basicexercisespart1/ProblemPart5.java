/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisespart1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProblemPart5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //to accept user input
        
        System.out.print("Input firt number: ");
        int firstnum = sc.nextInt();
        
        System.out.println("Input second number: ");
        int secondnum = sc.nextInt();
        
        System.out.println("Expected Output: ");
        int mul = firstnum * secondnum;
        System.out.println(firstnum + " x " + secondnum + " = " + mul);
        
    }
    
}
