/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SequentialnSumCounter;

import java.util.*;

public class SequentialnSumCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*try {
            
        } catch (Exception e) {
            
        }*/
        try (Scanner input1 = new Scanner(System.in)) {
            
            Count C1 = new Count();
            
            System.out.println("Pass the limit weon:");
            int MaxLimit = input1.nextInt();
            
            System.out.println("Iniating with the limit " + MaxLimit + "\n");
            
            C1.CountPairsStepByStep(MaxLimit);
            
            C1.CountByTwos(MaxLimit);
        }
    }
    
}
