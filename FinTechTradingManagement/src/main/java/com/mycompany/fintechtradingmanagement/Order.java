/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fintechtradingmanagement;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class Order {
    private int orderID,quantity;
    private String assetName,orderType;

    public Order(int orderID, int quantity, String assetName, String orderType) {
        this.orderID = orderID;
        this.quantity = quantity;
        this.assetName = assetName;
        this.orderType = orderType;
    }
    
    public int getOrderID()
    {
        return orderID;
    }
    public String getAssetName()
    {
        return assetName;
    }
    public String getOrderType()
    {
        return orderType;
    }
    public int getQuantity()
    {
        return quantity;
    }
}
