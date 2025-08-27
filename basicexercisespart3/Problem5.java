
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

        // Input distance and time
        System.out.print("Input distance in meters: ");
        float distance = sc.nextFloat();

        System.out.print("Input hour: ");
        int hours = sc.nextInt();

        System.out.print("Input minutes: ");
        int minutes = sc.nextInt();

        System.out.print("Input seconds: ");
        int seconds = sc.nextInt();

       
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        
        float metersPerSecond = distance / totalSeconds;
        float kilometersPerHour = (distance / 1000.0f) / (totalSeconds / 3600.0f);
        float milesPerHour = (distance / 1609.0f) / (totalSeconds / 3600.0f);

        
        System.out.printf("Your speed in meters/second is %.8f\n", metersPerSecond);
        System.out.printf("Your speed in km/h is %.8f\n", kilometersPerHour);
        System.out.printf("Your speed in miles/h is %.8f\n", milesPerHour);

        
    }
}
