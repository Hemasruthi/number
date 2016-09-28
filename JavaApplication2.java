/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Student
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num=23457,tot=0,j,x=0;int[] arr=new int[50];
        while(num!=0)
        {tot++;
         arr[x]=num%10;
         x++;
         num=num/10;
        }int t;
        for(j=0;j<x-1;j++)
        {
            for(int k2=j+1;k2<x;k2++)
            {
               if(arr[j]>arr[k2])
            {
              t=arr[j];
              arr[j]=arr[k2];
              arr[k2]=t;
                
            }
        }
    }
for(j=0;j<tot-x;j++)   
{
     System.out.print(""+arr[j]);
}
    }
}
