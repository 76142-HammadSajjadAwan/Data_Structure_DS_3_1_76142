/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_04_activity_01_task_01;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class Lab_04_Activity_01_Task_01 {
    
    public static int linearSearch(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
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
    public static int binarySearch(int[] arr, int target)
    {
        int l=0;
        int h=arr.length-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
        if(arr[mid] == target)
        {
            return mid;
        }
        else if(target > arr[mid])
        {
            l = mid + 1;
        }
        else
        {
            h = mid - 1;
        }
    }
    return -1;
}   

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=in.nextInt();
        int[] arr=new int[size];
        Random rand=new Random();
        int target;
        
        for(int i=0;i<size;i++)
        {
            int num=rand.nextInt(size);
            arr[i]=num;
            
        }
        bubbleSort(arr);
        System.out.println("Enter the target Value: ");
        target=in.nextInt();
        int result=linearSearch(arr,target);
        if(result != -1)
        {
            System.out.println("Target found of lenear search at index: " + result);
        }
        else
        {
            System.out.println("Target value of linear search is not found");
        }
        int show=binarySearch(arr,target);
        if(result != -1)
        {
            System.out.println("Target found of binary search at index: " + show);
        }
        else
        {
            System.out.println("Target value of binary search is not found");
        }
    }
}