/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_08_graphs;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class unidirectedGraph {
    static int vertices = 5;
    static int[][] graph=new int[vertices][vertices];

    public static void addEdge(int source, int destination) {
        graph[source][destination] = 1;
        graph[destination][source] = 1;
    }

    public static void displayGraph() {
        System.out.println("        Adjacency Matrix        ");
        System.out.print("   ");
        for (int i=0;i<vertices;i++) {
            System.out.print(i+"  ");
        }
        System.out.println();
        for (int i=0;i<vertices;i++) {
            System.out.print(i+ "  ");
            for (int j=0;j<vertices;j++) {
                System.out.print(graph[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void displayDegrees() {
        System.out.println("        Vertex Degrees         ");
        for (int i=0;i<vertices;i++) 
        {
            int degree = 0; 
            for (int j = 0; j < vertices; j++) 
            {
                degree=degree+graph[i][j];
            }
            System.out.println("Degree of vertex "+i+": "+degree);
        }
    }
    public static void main(String[] args) {
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(3, 4);

        displayGraph();
        displayDegrees();
    }
}
