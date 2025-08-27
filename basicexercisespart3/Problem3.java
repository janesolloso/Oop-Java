
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the number of minutes: ");
        long minutes = sc.nextLong(); 
        
        long minutesInDay = 60 * 24;
        long minutesInYear = minutesInDay * 365;
       
        
        long years = minutes / minutesInYear;
        
        long remainingMinutes = minutes % minutesInYear;
       
        
        long days = remainingMinutes / minutesInDay;
        
        System.out.println(minutes + " minutes is approimately " + years + " years and " + days + " days ");
        
        
        
        
    }
    
}
