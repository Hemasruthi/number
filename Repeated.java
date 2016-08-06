/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repeated;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Repeated {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            {
        Scanner sc=new Scanner(System.in);
                System.out.println("enter array size");
                int x=sc.nextInt();sc.nextLine();
        int[] b=new int[x];
                System.out.println("enter array elements");
        for(int i=0;i<x;i++)
        {
            b[i]=sc.nextInt();
        }
        Outer: for(int i=0;i<b.length;i++)
        {
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i]==b[j])
                {
                    System.out.println(b[i]);
                    break Outer;
                }
            }
        }
         
    }
}
