package com.taha;
import java.util.Scanner;
/**
* A program to calculate the fastest, slowest, and average race times entered by the user.
* @author Taha Akbar
* @date 09/11/2001
*/
public class Unit0Main {
   /**
    * Main method to run the program.
   * @param args Command line arguments (not used)
    */
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("How many times do you want to add: ");
       int num = input.nextInt();
       int[] time = new int[num];
       for (int i = 0; i < time.length; i++) {
           if (i == 0) {
               System.out.print("Time 1: ");
           } else {
               System.out.print("Next Time: ");
           }
           time[i] = input.nextInt();
       }
       int fast = findFastest(time);
       int slow = findSlowest(time);
       double findAverage = findAverage(time);
       System.out.println("Your fastest time is " + time[fast]  +
               " Your slowest time is " + time[slow] + " Your average time is " + findAverage);
   }
   /**
    * Method to find the index of the fastest time.
    * @param times An array of race times
    * @return The index of the fastest time
    */
   public static int findFastest(int[] times) {
       int num = 0;
       for (int i = 1; i < times.length; i++) {
           if (times[i] < times[num]) {
               num = i;
           }
       }
       return num;
   }
   /**
    * Method to find the index of the slowest time.
    * @param times An array of race times
    * @return The index of the slowest time
    */
   public static int findSlowest(int[] times) {
       int num = 0;
       for (int i = 1; i < times.length; i++) {
           if (times[i] > times[num]) {
               num = i;
           }
       }
       return num;
   }
   /**
    * Method to calculate the average of the race times.
    * @param times An array of race times
    * @return The average of the race times
    */
   public static double findAverage(int[] times) {
       int num = 0;
       for (int i = 0; i < times.length; i++) {
           num += times[i];
       }
       double mean = (double) num / times.length;
       return mean;
   }
}


