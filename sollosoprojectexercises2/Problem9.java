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
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input number of rows: ");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++){
            for (int k = 1; k <= i; k++){
            
            System.out.print(k);
        
            }
            System.out.println();
        }
      }
    }
