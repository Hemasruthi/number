/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *  
 * @author Student
 */
public class LONGPREFIX{

    /**
     * @param args the command line arguments
     */
   
	public static String LP(String[]s) {
	    String pr = "";
	    if(s.length>0){
	        pr =s[0];
	    }
	    for(int i=1; i<s.length; i++){
	        String temp =s[i];
	        int j=0;
	        for(; j<Math.min(pr.length(),s[i].length()); j++){
	            if(pr.charAt(j) != temp.charAt(j)){
	                break;
	            }
	        }
	        pr =s[i].substring(0, j);
	    }
	    return pr;
	}
	public static void main(String[] args) {
            
		String a[]=new String[]{"guvi","guvian","guvigit"};
		System.out.println(LP(a));
	}
}
    

