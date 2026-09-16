/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_03_activity2_task_02;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class Lab_03_Activity2_Task_02 {
    public static void Traversal(int arr[],int index)
    {
        if(index==arr.length)
        {
            return;
        }
        System.out.println("Index "+index+ ": "+arr[index]);
        Traversal(arr,index+1);
    }
    
    public static int sum(int arr[],int index)
    {
        if(index==arr.length)
        {
            return 0;
        }
        return arr[index]+sum(arr,index+1);
    }
    
    public static int search (int arr[],int index,int target)
    {
        if(arr[index]==target)
        {
            return index;
        }
        return search(arr,index+1,target);
    }
    public static void main(String[] args) {
        int[] arr={12,45,7,23,56,89,34};
        System.out.println("Array:");
        Traversal(arr,0);
        
        int sum=sum(arr,0);
        System.out.println("Sum: "+sum);
        int target=89;
        int index=search(arr,0,target);
        System.out.println("Target: "+target);
        System.out.println("Index: "+index);
    }
}
