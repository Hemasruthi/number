
package uniquearray;

import java.util.Scanner;

public class UniqueInArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] a=new int[100];int x;
        System.out.println("enter size of array"); 
         x=sc.nextInt();
         System.out.println("enter elements of ur array");
        for(int i=0;i<x;i++)
             a[i]=sc.nextInt();
        for(int j=0;j<x;j++)
         for(int i=j+1;i<x;i++)
            if(a[j]==a[i])
            {
                a[i]='\0';
                a[j]='\0';
            }
        for(int i=0;i<x;i++)
        if(a[i]!='\0')
            System.out.print( " "+a[i]);
         }}
   
