/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author KSRIET
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
   
        // TODO code application logic here 
        
    /**
     *
     */
    public static class Rec {

    int side1,ss1,side2,ss2,side3, ss3,side4,ss4;
    
   
  
    
        /**
         *
         * @param arg
         */
     

    private void ovp() {
 Scanner sc = new Scanner(System.in);
        System.out.println("REC:1 x1 and y1");
        side1 = sc.nextInt();
        ss1 = sc.nextInt();
        System.out.println(" x2 and y2");
        side2 = sc.nextInt();
        ss2 = sc.nextInt();
        System.out.println("REC2: xx and yy ");
        side3 = sc.nextInt();
        ss3 = sc.nextInt();
        System.out.println("xx1 and y1y ");
        side4 = sc.nextInt();
        ss4 = sc.nextInt();
        
        if(side3 > side2 || side4 < side1 || ss3 > ss2 || ss4 < ss1)
            System.out.println("Does not intersect");
        else
            System.out.println("Intersect");
    }
    }
    
   public static void main(String arg[]) {
  Scanner sc = new Scanner(System.in);
        Rec r;
        r = new Rec();
        r.ovp();
        
    }
}