
package reverse;

import java.util.Scanner;
public class Reverse { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1,r= "", f= "";;
        int l=s.length();
       for(int i=0;i<=l-1;i++)
       {
            f=f+s.charAt(i);
            if((s.charAt(i) == ' ') || (i == l-1)){
                for(int j =f.length()-1; j >= 0; j--){
                    r=r+f.charAt(j);
                    if((j == 0) && (i !=l-1))
                        r=r+" ";
                }
                f= "";
            }}
            System.out.println(r);
        
    }
}
