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
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        
            System.out.print("Input number of terms: ");
            int count = sc.nextInt();
            
            for (int j =1; j <= count; j++){
                int cube = j * j * j;
                System.out.println("Number is : " + j + " and cube of " + j + " is " + cube);
            }
       

               
    }
}
