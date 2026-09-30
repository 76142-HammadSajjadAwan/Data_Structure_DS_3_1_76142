/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class Dequeue {
    private int[] arr;
    private int front, rear, size, capacity;
    public Dequeue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void insertFront(int value) {
        if (size == capacity) {
            System.out.println("Deque is full");
            return;
        }
        front = (front - 1 + capacity) % capacity;
        arr[front] = value;
        size++;
    }

    public void insertRear(int value) {
        if (size == capacity) {
            System.out.println("Deque is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    public int deleteFront() {
        if (size == 0) {
            System.out.println("Deque is empty");
            return -1;
        }
        int value = arr[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public int deleteRear() {
        if (size == 0) {
            System.out.println("Deque is empty");
            return -1;
        }
        int value = arr[rear];
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return value;
    }

    public void display() {
        System.out.println("=======================");
        System.out.println("        Dequeue        ");
        System.out.println("=======================");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
}
