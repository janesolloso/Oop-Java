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
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter range: ");
        int range = sc.nextInt();
        int j = 0;
        
        for (int i = 1; i <= range; j++){
            System.out.println(i * j + " ");
        }
        System.out.println();
       }
    }   
   

    
