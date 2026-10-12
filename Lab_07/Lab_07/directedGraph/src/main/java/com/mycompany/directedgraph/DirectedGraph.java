/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.directedgraph;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class DirectedGraph {
    static int vertices = 5;
    static int[][] graph = new int[vertices][vertices];
    // Function to add a directed edge
    public static void addEdge(int u, int v) {
        graph[u][v] = 1;
    }
    // Function to display adjacency matrix
    public static void displayGraph() {
        System.out.println("        Adjacency Matrix        ");

        System.out.print("   ");
        for (int i=0;i<vertices;i++) {
            System.out.print(i+"  ");
        }
        System.out.println();
        for (int i=0;i<vertices;i++) {
            System.out.print(i+"  ");
            for (int j=0;j<vertices;j++) {
                System.out.print(graph[i][j]+"  ");
            }
            System.out.println();
        }
    }
    // Function to calculate in-degree
    public static void calculateInDegree() {
        System.out.println("        In-Degree of Vertices       ");
        for (int i=0;i<vertices;i++) {
            int degree = 0;
            for (int j=0;j<vertices;j++) {
                degree =degree+ graph[j][i];
            }
            System.out.println("In-degree of vertex "+i+": "+degree);
        }
    }
    // Function to calculate out-degree
    public static void calculateOutDegree() {
        System.out.println("        Out-Degree of Vertices      ");
        for (int i=0;i<vertices;i++) {
            int degree = 0;
            for (int j=0;j<vertices;j++) {
                degree =degree+ graph[i][j];
            }
            System.out.println("Out-degree of vertex "+i+": "+degree);
        }
    }
    public static void main(String[] args) {
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 1);

        displayGraph();
        calculateInDegree();
        calculateOutDegree();
    }
}
