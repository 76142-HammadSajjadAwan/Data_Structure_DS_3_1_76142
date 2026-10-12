/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicalapplication;
import java.util.Scanner;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class PracticalApplication {
    static int vertices = 5;
    static int[][] graph = new int[vertices][vertices];
    public static void addEdge(int u, int v) {
        graph[u][v] = 1;
        graph[v][u] = 1;
        System.out.println("Communication link added successfully.");
    }
    // Function to display adjacency matrix
    public static void displayGraph() {
        System.out.println("        Adjacency Matrix        ");
        System.out.print("   ");
        for (int i=0;i<vertices;i++) 
        {
            System.out.print(i+"  ");
        }
        System.out.println();
        for (int i=0;i<vertices;i++) 
        {
            System.out.print(i+"  ");
            for (int j=0;j<vertices;j++) {
                System.out.print(graph[i][j]+"  ");
            }
            System.out.println();
        }
    }
    // Function to check direct connection
    public static void checkConnection(int u, int v) {
        if (graph[u][v] == 1) {
            System.out.println("Departments " + u + " and " + v
                    + " are directly connected.");
        } else {
            System.out.println("Departments " + u + " and " + v
                    + " are not directly connected.");
        }
    }

    // Function to calculate degree of a department
    public static void calculateDegree(int department) {
        int degree = 0;
        for (int i=0;i<vertices;i++) 
        {
            degree =degree+ graph[department][i];
        }
        System.out.println("Degree of department "+department+": "+degree);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, u, v;
        do {
            System.out.println("===== UNIVERSITY DEPARTMENT GRAPH =====");
            System.out.println("1. Add Communication Link");
            System.out.println("2. Display Adjacency Matrix");
            System.out.println("3. Check Direct Connection");
            System.out.println("4. Display Department Degree");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter two department numbers: ");
                    u = sc.nextInt();
                    v = sc.nextInt();
                    if (u >= 0 && u < vertices && v >= 0 && v < vertices && u != v) 
                    {
                        addEdge(u, v);
                    }
                    else
                    {
                        System.out.println("Invalid department numbers.");
                    }
                    break;
                case 2:
                    displayGraph();
                    break;
                case 3:
                    System.out.print("Enter two department numbers: ");
                    u = sc.nextInt();
                    v = sc.nextInt();
                    if (u >= 0 && u < vertices && v >= 0 && v < vertices && u != v) {
                        checkConnection(u, v);
                    } 
                    else 
                    {
                        System.out.println("Invalid department numbers.");
                    }
                    break;
                case 4:
                    System.out.print("Enter department number: ");
                    u = sc.nextInt();
                    if (u >= 0 && u < vertices) 
                    {
                        calculateDegree(u);
                    } 
                    else
                    {
                        System.out.println("Invalid department number.");
                    }
                    break;
                case 0:
                    System.out.println("Program terminated.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
        sc.close();
    }
}
