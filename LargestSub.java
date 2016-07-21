/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package largestsub;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class LargestSub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
	Scanner in=new Scanner(System.in);
	String s1=in.next();
	String sub = null;int c,l=s1.length();
        for(int pos=1;pos<l;pos++){
	   c=s1.charAt(pos)-s1.charAt(pos-1);
	         if(c!=-1){
			 sub=s1.substring(pos);
			 break;	}
	if(sub.length()!=0)
          System.out.println("Lexographic Substring:"+sub);
	
	else
	  System.out.println("no lexographic String can be formed");
    }}}

