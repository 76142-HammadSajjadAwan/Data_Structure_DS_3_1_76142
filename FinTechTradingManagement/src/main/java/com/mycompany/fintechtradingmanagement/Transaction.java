/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fintechtradingmanagement;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class Transaction {
    private int transactionId;
    private String assetName;
    private String transactionType;
    private int quantity;
    
    public Transaction(int transactionId, String assetName, String transactionType, int quantity) 
    {
        this.transactionId = transactionId;
        this.assetName = assetName;
        this.transactionType = transactionType;
        this.quantity = quantity;
    }
    public int getTransactionId()
    {
        return transactionId;
    }

    public String getAssetName()
    {
        return assetName;
    }

    public String getTransactionType() 
    {
        return transactionType;
    }

    public int getQuantity() 
    {
        return quantity;
    }
}
