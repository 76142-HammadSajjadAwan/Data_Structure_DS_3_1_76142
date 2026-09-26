/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fintechtradingmanagement;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class sortingAlgorithms {
    //Bubble Sort Algorithm
    public static void bubbleSort(Asset[] asset)
    {
        for(int i=0;i<asset.length-1;i++)
        {
            for(int j=0;j<asset.length-1-i;j++)
            {
                if(asset[j].getCurrentPrice()>asset[j+1].getCurrentPrice())
                {
                    Asset temp=asset[j];
                    asset[j]=asset[j+1];
                    asset[j+1]=temp;
                }
            }
        }
    }
    
    //Selection Sort Algorithm
    public static void selectionSort(Asset[] asset)
    {
        for(int i=0;i<asset.length-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<asset.length;j++)
            {
                if(asset[j].getCurrentPrice()<asset[minIndex].getCurrentPrice())
                {
                    minIndex=j;
                }
            }
            Asset temp=asset[i];
            asset[i]=asset[minIndex];
            asset[minIndex]=temp;
            
        }            
    }
    
    //Insertion Sort Algorithm
    public static void insertionSort(Asset[] asset)
    {
        for(int i=1;i<asset.length;i++)
        {
            Asset key=asset[i];
            int j=i-1;
            while(j>=0 && asset[j].getCurrentPrice()>key.getCurrentPrice())
            {
                asset[j+1]=asset[j];
                j=j-1;
            }
            asset[j+1]=key;
        }
    }
    
    //Merge Sort Algorithm
    public static void merge(Asset[] asset,int left,int mid,int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;
        
        Asset[] L=new Asset[n1];
        Asset[] R=new Asset[n2];
        
        for(int i=0;i<n1;i++)
        {
            L[i]=asset[left+i];
        }
        for(int j=0;j<n2;j++)
        {
            R[j]=asset[mid+1+j];
        }
        
        int i=0,j=0;
        int k=left;
        
        while(i<n1 && j<n2)
        {
            if(L[i].getCurrentPrice()<=R[j].getCurrentPrice())
            {
                asset[k]=L[i];
                i++;
            }
            else
            {
                asset[k]=R[j];
                j++;
            }
            k++;
        }
        
        while(i<n1)
        {
            asset[k]=L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            asset[k]=R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(Asset[] asset,int left,int right)
    {
        if(left<right)
        {
            int mid=left+(right-left)/2;
            mergeSort(asset,left,mid);
            mergeSort(asset,mid+1,right);
            merge(asset,left,mid,right);
        }
    }
    
    //Quick Sort Algorithm
    public static int partition(Asset[] asset,int low,int high)
    {
        Asset pivot=asset[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(asset[j].getCurrentPrice()<=pivot.getCurrentPrice())
            {
                i++;
                Asset temp=asset[i];
                asset[i]=asset[j];
                asset[j]=temp;
            }
        }
        Asset temp=asset[i+1];
        asset[i+1]=asset[high];
        asset[high]=temp;
        return i+1;
    }
    public static void quickSort(Asset[] asset,int low,int high)
    {
        if(low<high)
        {
            int pi=partition(asset,low,high);
            quickSort(asset,low,pi-1);
            quickSort(asset,pi+1,high);
        }
    }
}
