/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cost;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Cost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0,c=0,o=1,l,ch,p;
char[] a=new char[100];
char[] b=new char[100];
int next;Scanner sc=new Scanner(System.in);  
String f=sc.nextLine();
a=f.toCharArray();
 String g=sc.nextLine();
b=g.toCharArray();
while(o==1)
{
    System.out.println("1.insert\n");
    System.out.println("2.delete\n");
    System.out.println("3.replace\n");
    System.out.println("4.exit\n");
    System.out.println("enter your choice\n");
ch=sc.nextInt();
if(c<19)
{
switch(ch)
{
case 1:
    System.out.println("The cost of the string is 4\n");
    System.out.println("Enter the position and nextue where wish to insert:\n");
p=sc.nextInt();
next=sc.nextInt();
l=strlen(a);
for(i=l-1;i>=p-1;i--)
{
a[i+1]=a[i];
}
a[l+1]='\0';
a[p-1]=(char) next;
    System.out.println("After insertion:\n");
    System.out.println(""+a);
c=c+4;
    System.out.println("Do you want to continue?y->1/no->0\n");
o=sc.nextInt();
break;
case 2:
    System.out.println("The cost is 3:\n");
    System.out.println("Enter the position to delete\n");
p=sc.nextInt();
l=strlen(a);
for(i=p-1;i<l;i++)
{
a[i]=a[i+1];
}
    System.out.println("After deleting\n");
    System.out.println(""+a);
c=c+3;
    System.out.println("Do you want to continue?y->1/no->0\n");
o=sc.nextInt();
break;
case 3:
    System.out.println("The cost is 5:\n");
    System.out.println("Enter the position to replace and nextue\n");
p=sc.nextInt();
next=sc.nextInt();
a[p-1]=(char) next;
    System.out.println("After replacing\n");
    System.out.println(""+a);
c=c+5;
    System.out.println("Do you want to continue?y->1/n->0\n");
o=sc.nextInt();
break;
}
}
}
        System.out.println("total cost is "+c);

}

    private static int strlen(char[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
