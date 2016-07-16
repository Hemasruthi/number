
package leastnum;

import java.util.Scanner;

public class LeastNum {
    public static void main(String[] args) {
        int[] a=new int[5];
        int n,i=0,t,d,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer");
        n=sc.nextInt();
              System.out.println("enter num of digit u want to delete(1-5)");
        d=sc.nextInt();
        int tmp = 0;
        while(n!=0)
        {
            t=n%10;
            a[i]=t;
            n=n/10;
            i++;          
        }
       for(int j=0;j<a.length;j++)
        {
            for(int k=j+1;k<a.length;k++)     
           
            {
            if (a[j] > a[k]) {
                tmp = a[j];
                a[j] = a[k];
                a[k] = tmp;
            }
        }      
        }
        for(int j=0;j<(a.length-d);j++)
        {
            System.out.print(a[j]);
        }
    }
}
