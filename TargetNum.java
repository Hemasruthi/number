
package target;
import java.util.Scanner;
public class TargetNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target;int flag=0;
        int[] a=new int[5];
        System.out.println("enter array of 5 elements");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter ur target number"); 
        target=sc.nextInt();
          for(int i=0;i<5;i++)
          {
         for(int j=i;j<5;j++)
         {
             if(a[i]+a[j]==target)
             {  flag++;
                 System.out.println(a[i]+"+ "+a[j]+"= "+target);}
    
          }}
          if(flag==0)
              System.out.println("no numbers in array will give target while adding");
        
    }
}
