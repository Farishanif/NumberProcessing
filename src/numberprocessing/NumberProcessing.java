/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberprocessing;

import java.util.*;

/**
 *
 * @author Farishanif
 */
public class NumberProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double mult = 1;
        double sum = 0;
        double med;
        double avg;

        System.out.println("Number Processing Application \n"
        		+ "*Whole Numbers Only!\n");
        try (Scanner scan = new Scanner(System.in);){
        
         //inputting the total of number
        System.out.println("How Many Number Would You Like to Input?");
        int n = scan.nextInt();
        int arrN[] = new int[n];
        
         //inputting the number
        System.out.println("Please Input " + n + " Numbers!");
        for(int i=0;i<n;i++){
            arrN[i]=scan.nextInt();
            sum = sum+arrN[i];      //adding every elements in array
            mult = mult * arrN[i]; //multiply every elements in array
        }
        avg = sum/arrN.length; //counting average/mean
       
                //counting median
        if (arrN.length % 2 == 0){
            med = ((double)arrN[arrN.length/2] + (double)arrN[arrN.length/2 - 1])/2;
        }else{
            med = (double) arrN[arrN.length/2];
        }
        
        //sorting array and display it
        System.out.print("Your Numbers are: ");        
        Arrays.sort(arrN); 
        System.out.println(Arrays.toString(arrN));

        //Display Average/Mean, Median, and total multiplication
        System.out.print("Your Average is: " + avg + "\n");
        System.out.print("Total of Multiplication of All The Number is: " + mult + "\n");
        System.out.print("Your Median is: " + med + "\n");
        
        } catch (Exception e){
            System.out.print("Error Detected \nProgram Terminated Due to Error");
        }

    }
    
}
