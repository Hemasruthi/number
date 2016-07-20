/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] n=new int[5];
        int[] n1=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            n[i]=sc.nextInt();
            n1[i]=n[i];
        }
int i,j,temp;
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
if(n1[i]>n1[j])
{
temp=n[i];
n[i]=n[j];
n[j]=temp;
temp=n1[i];
n1[i]=n1[j];
n1[j]=temp;
}
else if(n1[i]==n1[i+1])
{
if(n[i]>n[j])
{
temp=n[i];
n[i]=n[j];
n[j]=temp;
}
}
}
}
for(i=0;i<5;i++)
{
    System.out.println(n[i]);
}
}


}
    }

