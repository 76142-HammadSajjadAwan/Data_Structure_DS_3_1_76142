/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskno1;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class TaskNo1 {

    public static void main(String[] args) {
        int[] arr={45,12,78,23,9,56,34,89,17,63};
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }
        double sum=0;
        for(int i=0;i<10;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("\nSum: "+sum);
        
        double average=sum/10;
        System.out.println("Average: "+average);
        
        int max=arr[0];
        for(int i=0;i<10;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum Value: "+max);
        
        int min=arr[0];
        for(int i=0;i<10;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Minimum Value: "+min);
        
       int index=3;
       int value=100;
       int[] newArray=new int[arr.length+1];
       for(int i=0;i<index;i++)
       {
           newArray[i]=arr[i];
       }
      newArray[index]=value;
      
      for(int i=index;i<arr.length;i++)
      {
          newArray[i+1]=arr[i];
      }
      for(int i=0;i<newArray.length;i++)
      {
          System.out.print(newArray[i]+" ");
      }
      System.out.print("\n");
      
      //Deletion
      int[] array1=new int[arr.length-1];
      for(int i=0;i<array1.length;i++)
      {
          if(i>4)
          {
              array1[i]=arr[i+1];
          }
          else
          {
          array1[i]=arr[i];
          }
      }
      
      for(int i=0;i<array1.length;i++)
      {
          System.out.print(array1[i]+" ");
      }
    }
}
