/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author KSRIET
 */

    /**
     * @param args the command line arguments
     */
  
       
public class Sort {
     
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        sort(0, length - 1);
    }
 
    private void sort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        
        while (i <= j) {
          while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
        
                i++;
                j--;
            }
        }
        
        if (lowerIndex < j)
            sort(lowerIndex, j);
        if (i < higherIndex)
            sort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        Sort sorter = new Sort();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] input =new int[10];int[] input1 =new int[10];
        for(int i=0;i<10;i++)
            input[i]=sc.nextInt();
          for(int i=0;i<input.length;i++)
              input1[i]=input[x-i];
        sorter.sort(input1);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }


    }
