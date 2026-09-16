/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_task_04;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class Counter {
    private int count;
    public Counter() {
        count = 0;
    }
    public Counter(int initialValue) {
        count = initialValue;
    }
    public int getCount() {
        return count;
    }
    public void increment() {
        count++;
    }
    public void decrement() {
        count--;
    }
}
