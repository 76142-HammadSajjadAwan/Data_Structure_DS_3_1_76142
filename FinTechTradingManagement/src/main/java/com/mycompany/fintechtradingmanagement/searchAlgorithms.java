/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fintechtradingmanagement;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class searchAlgorithms {
    public static Asset LinearSearch(Asset[] asset,int targetID)
    {
        for(int i=0;i<asset.length;i++)
        {
            if(asset[i].getAssetID()==targetID)
            {
                return asset[i];
            }
        }
        return null;
    }
    
    public static Asset binarySearch(Asset[] asset,int targetID)
    {
        int l=0;
        int h=asset.length-1;
        
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(asset[mid].getAssetID()==targetID)
            {
                return asset[mid];
            }
            if (asset[mid].getAssetID()<targetID)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return null;
    }
}
