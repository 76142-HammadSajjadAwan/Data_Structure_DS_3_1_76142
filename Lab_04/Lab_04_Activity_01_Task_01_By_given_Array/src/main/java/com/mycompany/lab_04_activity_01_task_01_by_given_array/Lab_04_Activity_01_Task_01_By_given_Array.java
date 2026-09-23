/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_04_activity_01_task_01_by_given_array;
import java.util.Scanner;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class Lab_04_Activity_01_Task_01_By_given_Array {
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
        int[] linearArray = {45, 12, 78, 34, 23, 89, 56};
        int[] binaryArray = {12, 23, 34, 45, 56, 78, 89};
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the target Value for linear Search: ");
        int target=in.nextInt();
        int result=linearSearch(linearArray,target);
        if(result != -1)
        {
            System.out.println("Target found of lenear search at index: " + result);
        }
        else
        {
            System.out.println("Target value of Binary search is not found");
        }
        System.out.print("Enter the target Valuefor linear Search: ");
        int required=in.nextInt();
        int show=binarySearch(binaryArray,required);
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
