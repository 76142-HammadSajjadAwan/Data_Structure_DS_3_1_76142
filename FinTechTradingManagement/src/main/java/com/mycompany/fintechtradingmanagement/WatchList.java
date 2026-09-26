/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fintechtradingmanagement;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class WatchList {
    private static class Node {
    Asset asset;
    Node next;

    Node(Asset asset) {
        this.asset = asset;
        }
    }
     private Node head;

    public WatchList()
    {
        head = null;
    }
    
    public void insert(Asset asset) {
        Node newNode = new Node(asset);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) 
        {
            current = current.next;
        }
        current.next = newNode;
    }
    
    public void delete(int assetId) 
    {
        if (head == null)
        {
            return;
        }
        if (head.asset.getAssetID() == assetId) 
        {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) 
        {
            if (current.next.asset.getAssetID() == assetId)
            {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
    public Asset search(int assetId)
    {
        Node current = head;
        while (current != null) 
        {
            if (current.asset.getAssetID() == assetId) 
            {
                return current.asset;
            }
            current = current.next;
        }
        return null;
    }
    
    public void display()
    {
        Node current = head;
        if (head == null)
        {
            System.out.println("Watchlist is empty.");
            return;
        }
        while (current != null) 
        {
            System.out.println("ID: " + current.asset.getAssetID());
            System.out.println("Name: "+current.asset.getAssetName());
            System.out.println("Type: "+current.asset.getAssetType());        
            System.out.println("Price: "+current.asset.getCurrentPrice());
            
            current = current.next;
        }
    }
    
}
