/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

import java.util.Scanner;
public class Average {
    public static void main(String[] args){ 
int sum=0,sum1=0,n,n1,avg,avg1;
int b,count=0,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter 5 elements");
int[] a=new int[100];
for(int i=0;i<5;i++)
a[i]=sc.nextInt();
n=a.length;b=n;
for(int j=0;j<n/2;j++)
{
sum=sum+a[j];
count++;
}
for(int i=b/2;i<b;i++)
{
sum1=sum1+a[i];
c++;
}
avg=sum/count;
avg1=sum1/c;
if(avg==avg1)
System.out.println("first part and sceond part average is same");
else
System.out.println("first part and sceond part average is same");
}
}
