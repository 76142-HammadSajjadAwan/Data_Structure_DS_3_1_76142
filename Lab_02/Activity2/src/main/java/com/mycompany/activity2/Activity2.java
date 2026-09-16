/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity2;
import java.util.Arrays;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class Activity2 {
     public static void bubbleSort(int []arr)
    {
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    public static void selectionSort(int arr[])
    {
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    
    public static void insertionSort(int[] arr)
    {
        for(int i=1; i<arr.length; i++)
            {
        int key=arr[i];
        int j=i-1;

        while(j>=0 && arr[j]>key)
            {
            arr[j+1]=arr[j];
            j=j-1;
            }

        arr[j+1]=key;
            }
    }
    public static void main(String[] args) {
        int[] original={64,25,12,22,11,90,34};
        
        int[] bubble=Arrays.copyOf(original,original.length);
        int[] selection=Arrays.copyOf(original,original.length);
        int[] insertion=Arrays.copyOf(original, original.length);
        
        System.out.print("Original Array: ");
        for(int i=0;i<original.length;i++)
        {
            System.out.print(original[i]+ " ");
        }        
        bubbleSort(bubble);
        System.out.print("\nBubble Sorted Array: ");
        for(int i=0;i<bubble.length;i++)
        {
            System.out.print(bubble[i]+" ");
        }      
        selectionSort(selection);
        System.out.print("\nSelection Sorted Array: ");
        for (int i = 0; i < selection.length; i++) {
            System.out.print(selection[i]+" ");
        }      
        insertionSort(insertion);
        System.out.print("\nInsertion Sorted Array: ");
        for (int i = 0; i < insertion.length; i++) {
            System.out.print(insertion[i]+" ");
        }
    }
}
