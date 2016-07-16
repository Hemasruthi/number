package substringprogram;
import java.util.Scanner;
public class SubstringProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();int l=s.length(); 
        char[] c2=new char[l];
        String s1=sc.nextLine();
         char[] c1=s1.toCharArray();
         if(s.contains(s1))
         {
           System.out.println("Position of second string's first element");
          for(int i=0;i<s.length();i++)
           {
           for(int j=0;j<s1.length();j++)
           {           
             { if(c[i]==c1[j])
             {
                c2[j]=c[j];
                 System.out.println(i);
                 break;
                 
             }break;
             }
             }        
           }}
         else
             System.out.println("Strings are not matched");
    }}
       