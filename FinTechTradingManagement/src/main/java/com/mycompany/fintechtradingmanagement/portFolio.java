/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fintechtradingmanagement;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class portFolio {
    private Asset[] asset;
    private int[] quantities;

    public portFolio(Asset[] asset, int[] quantities)
    {
        this.asset = asset;
        this.quantities = quantities;
    }
    
    public double calculateTotalValue(int index) 
    {
        // Base Case
        if (index==asset.length)
        {
            return 0;
        }
   
         double currentValue =asset[index].getCurrentPrice() * quantities[index];
        // Recursive Case
        return currentValue + calculateTotalValue(index + 1);
    }
    
    public void displayPortfolio(int index)
    {
        // Base Case
        if (index == asset.length) 
        {
            return;
        }
        
        System.out.println("Asset: " + asset[index].getAssetName());
        System.out.println("Quantity: " + quantities[index]);
        System.out.println("Price: " + asset[index].getCurrentPrice());    
        System.out.println("Value: " + (asset[index].getCurrentPrice()*quantities[index]));    

        // Recursive Case
        displayPortfolio(index + 1);
    }
    
        // Find asset using Asset ID
    public int findAssetIndex(int assetId) 
    {
        for (int i = 0; i < asset.length; i++)
        {
            if (asset[i].getAssetID() == assetId) 
            {
                return i;
            }
        }
        return -1;
    }
    // Find asset using Asset Name
    public int findAssetIndexByName(String assetName) 
    {
        for (int i = 0; i < asset.length; i++) {
            if (asset[i].getAssetName().equalsIgnoreCase(assetName)) 
            {
                return i;
            }
        }
        return -1;
    }
    // BUY asset
    public boolean buyAsset(String assetName, int quantity) 
    {
        int index = findAssetIndexByName(assetName);
        if (index == -1) {
            System.out.println("Asset not found.");
            return false;
        }
        if (quantity <= 0) 
        {
            System.out.println("Invalid quantity.");
            return false;
        }
        quantities[index] += quantity;
        System.out.println("BUY successful. "+assetName+" quantity increased by "+quantity);
        return true;
    }
    // SELL asset
    public boolean sellAsset(String assetName, int quantity) 
    {
        int index = findAssetIndexByName(assetName);
        if (index == -1) 
        {
            System.out.println("Asset not found.");
            return false;
        }
        if (quantity <= 0) 
        {
            System.out.println("Invalid quantity.");
            return false;
        }
        // Cannot sell more than owned quantity
        if (quantities[index] < quantity)
        {
            System.out.println("SELL failed. Insufficient quantity.");
            return false;
        }
        quantities[index] -= quantity;
        System.out.println("SELL successful. "+assetName+"quantity decreased by "+quantity);
        return true;
    }
    // Get quantity of an asset
    public int getQuantity(String assetName) 
    {
        int index = findAssetIndexByName(assetName);
        if (index == -1) 
        {
            return -1;
        }
        return quantities[index];
    }
}
    
