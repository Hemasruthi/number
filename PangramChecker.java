/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pangramchecker;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PangramChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] Lcase=new char[26];
        char[] Ucase=new char[26];
        int m=0,n=0,num=0;
        for(char i='a';i<='z';i++)
        {
         Lcase[m]=i;
         m++;
        }
         for(char j='A';j<='Z';j++)
        {
         Ucase[n]=j;
         n++; 
        }
       Scanner sc=new Scanner(System.in); 
        System.out.println("Enter ur String");
       String str=sc.nextLine();
       for(int l=0;l<26;l++){
       for(int j=0;j<str.length();j++)
       {
        if(str.charAt(j)==Lcase[l]||str.charAt(j)==Ucase[l])
        {
          num++;
          Lcase[l]=(char)-1;
           Ucase[l]=(char)-1;
        }
            }}
        if(num==26)
        
            System.out.println(" It is a pangram");
        
        else
            System.out.println("It is not an pangram");
    }
    }

