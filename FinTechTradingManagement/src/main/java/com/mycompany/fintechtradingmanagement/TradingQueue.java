/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fintechtradingmanagement;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class TradingQueue {
    private Order[] queue;
    private int front;
    private int rear;
    private int size;

    public TradingQueue(int capacity) {
        queue = new Order[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }
    public void enqueue(Order order) {
        if (size == queue.length) {
            System.out.println("Queue Overflow.");
            return;
        }
        queue[rear] = order;
        rear = (rear + 1) % queue.length;
        size++;
        System.out.println("Order added to trading queue.");
    }

    public Order dequeue() {
        if (size == 0) {
            System.out.println("Queue underflow.");
            return null;
        }

        Order order = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return order;
    }

    public Order peek() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return null;
        }
        return queue[front];
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        for (int i = 0; i < size; i++) {
            Order order = queue[(front + i) % queue.length];
            System.out.println("Order ID: " + order.getOrderID());
            System.out.println("Asset: " + order.getAssetName());
            System.out.println("Type: " + order.getOrderType());
            System.out.println("Quantity: " + order.getQuantity());
        }
    }
}