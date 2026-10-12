/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.graphoperations;
import java.util.Scanner;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class GraphOperations {
    static int vertices = 5;
    static int[][] graph = new int[vertices][vertices];
    // Function to add an edge
    public static void addEdge(int u, int v) {
        graph[u][v] = 1;
        graph[v][u] = 1;
        System.out.println("Edge added successfully.");
    }
    // Function to remove an edge
    public static void removeEdge(int u, int v) {
        if (graph[u][v] == 1) {
            graph[u][v] = 0;
            graph[v][u] = 0;
            System.out.println("Edge removed successfully.");
        } else {
            System.out.println("Edge does not exist.");
        }
    }
    // Function to display adjacency matrix
    public static void displayGraph() {
        System.out.println("        Adjacency Matrix        ");
        System.out.print("   ");
        for (int i=0;i<vertices;i++) {
            System.out.print(i+"  ");
        }
        System.out.println();
        for (int i=0;i< vertices; i++) {
            System.out.print(i+ "  ");
            for (int j=0;j<vertices;j++) {
                System.out.print(graph[i][j]+ "  ");
            }
            System.out.println();
        }
    }
    // Function to calculate degree of a vertex
    public static void calculateDegree(int vertex) {
        int degree = 0;
        for (int i=0;i<vertices;i++) {
            degree =degree+ graph[vertex][i];
        }
        System.out.println("Degree of vertex "+vertex+": "+degree);
    }
    // Function to check whether an edge exists
    public static void checkEdge(int u, int v) {
        if (graph[u][v] == 1) {
            System.out.println("Edge exists between "+u+" and "+v);
        } else {
            System.out.println("Edge does not exist between " +u+" and "+v);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(3, 4);
        int choice, u, v;
        do {
            System.out.println("===== GRAPH OPERATIONS =====");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Display Adjacency Matrix");
            System.out.println("4. Calculate Vertex Degree");
            System.out.println("5. Check Edge");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter two vertices: ");
                    u = sc.nextInt();
                    v = sc.nextInt();
                    if (u >= 0 && u < vertices && v >= 0 && v < vertices && u != v)
                    {
                        addEdge(u, v);
                    } 
                    else
                    {
                        System.out.println("Invalid vertices.");
                    }
                    break;
                case 2:
                    System.out.print("Enter two vertices : ");
                    u = sc.nextInt();
                    v = sc.nextInt();
                    if (u >= 0 && u < vertices && v >= 0 && v < vertices && u != v) 
                    {
                        removeEdge(u, v);
                    } 
                    else 
                    {
                        System.out.println("Invalid vertices.");
                    }
                    break;
                case 3:
                    displayGraph();
                    break;
                case 4:
                    System.out.print("Enter vertex: ");
                    u = sc.nextInt();
                    if (u >= 0 && u < vertices) 
                    {
                        calculateDegree(u);
                    }
                    else
                    {
                        System.out.println("Invalid vertex.");
                    }
                    break;
                case 5:
                    System.out.print("Enter two vertices: ");
                    u = sc.nextInt();
                    v = sc.nextInt();
                    if (u >= 0 && u < vertices && v >= 0 && v < vertices && u != v) 
                    {
                        checkEdge(u, v);
                    }
                    else 
                    {
                        System.out.println("Invalid vertices.");
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
