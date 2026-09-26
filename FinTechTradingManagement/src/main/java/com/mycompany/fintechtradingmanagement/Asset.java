/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fintechtradingmanagement;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class Asset {
    private int assetID;
    private String assetName,assetType;
    private double currentPrice,percentageChange;
    
    Asset(int assetID,String assetName,String assetType,double currentPrice,double percentageChange)
    {
        this.assetID=assetID;
        this.assetName=assetName;
        this.assetType=assetType;
        this.currentPrice=currentPrice;
        this.percentageChange=percentageChange;
    }
    
    public int getAssetID()
    {
        return assetID;
    }
    public String getAssetName()
    {
        return assetName;
    }
    public String getAssetType()
    {
        return assetType;
    }
    public double getCurrentPrice()
    {
        return currentPrice;
    }
    public double getPercentageChange()
    {
        return percentageChange;
    }
    
}
