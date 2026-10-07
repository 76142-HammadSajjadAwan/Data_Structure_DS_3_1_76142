/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_06;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class Lab_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=0;
        do {
            try {
            //======================================
            //              MAIN MENU
            //======================================
            System.out.println("================================");
            System.out.println("          LAB 06 MENU");
            System.out.println("================================");
            System.out.println("1. Infix to Postfix");
            System.out.println("2. Postfix to Infix");
            System.out.println("3. Infix to Prefix");
            System.out.println("4. Prefix to Infix");
            System.out.println("5. Prefix to Postfix");
            System.out.println("6. Postfix to Prefix");
            System.out.println("7.Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                //======================================
                //          INFIX TO POSTFIX
                //======================================
                case 1:
                    System.out.println("==============================");
                    System.out.println("       INFIX TO POSTFIX");
                    System.out.println("==============================");
                    for (int i=1;i<=5;i++) 
                    {
                        System.out.print("Enter Infix Expression "+i+": ");
                        String exp = sc.nextLine();
                        String res =Activity_01_InfixToPostfix.infixToPostfix(exp);
                        System.out.println("Infix Expression: " + exp);
                        System.out.println("Postfix Expression: " + res);
                        System.out.println();
                    }
                    break;
                //======================================
                //          POSTFIX TO INFIX
                //======================================
                case 2:
                    System.out.println("==============================");
                    System.out.println("       POSTFIX TO INFIX");
                    System.out.println("==============================");
                    for (int i=1;i<=5;i++) 
                    {
                        System.out.print("Enter Postfix Expression "+i+": ");
                        String ex = sc.nextLine();
                        String r =Activity_02_PostfixToInfix.postfixToInfix(ex);
                        System.out.println("Postfix Expression: " + ex);
                        System.out.println("Infix Expression: " + r);
                        System.out.println();
                    }
                    break;
                //======================================
                //          INFIX TO PREFIX
                //======================================
                case 3:
                    System.out.println("==============================");
                    System.out.println("        INFIX TO PREFIX");
                    System.out.println("==============================");
                    for (int i=1;i<=5;i++) 
                    {
                        System.out.print("Enter Infix Expression "+i+": ");
                        String expression = sc.nextLine();
                        String result =Activity_03_InfixToPrefix.infixToPrefix(expression);
                        System.out.println("Infix Expression: " + expression);
                        System.out.println("Prefix Expression: " + result);
                        System.out.println();
                    }
                    break;
                //======================================
                //          PREFIX TO INFIX
                //======================================
                case 4:
                    System.out.println("==============================");
                    System.out.println("       PREFIX TO iNFIXFIX");
                    System.out.println("==============================");
                    for (int i=1;i<=5;i++) 
                    {
                        System.out.println("Enter prefix expression "+i+": ");
                        String e=sc.nextLine();
                        String total=Activity_04_PrefixToInfix.prefixToInfix(e);
                        System.out.println("Prefix Expression: "+e);
                        System.out.println("Infix Expression: "+total);
                    }
                    break;
                //======================================
                //             PREFIX TO POSTFIX
                //======================================
                case 5:
                    System.out.println("==============================");
                    System.out.println("        PREFIX TO POSTFIX     ");
                    System.out.println("==============================");
                    for(int i=1;i<=5;i++)
                    {
                    System.out.println("Enter prefix expression "+i+": ");
                    String value=sc.nextLine();
                    String ress=Activity_05_PrefixToPostfix.prefixToPostfix(value);
                    System.out.println("Prefix Expression: "+value);
                    System.out.println("Postfix Expression: "+ress);
                    }
                    break;
                //=======================================
                //          POSTFIX TO PREFIX
                //=======================================
                case 6:
                    System.out.println("==============================");
                    System.out.println("        POSTFIX TO PREFIX     ");
                    System.out.println("==============================");
                    for(int i=1;i<=5;i++)
                    {
                    System.out.println("Enter postfix expression "+i+": ");
                    String val=sc.nextLine();
                    String t=Activity_06_PostfixToPrefix.postfixToPrefix(val);
                    System.out.println("Postfix Expression: "+val);
                    System.out.println("Prefix Expression: "+t);
                    }
                    break;
                //=======================================
                //                 EXIT
                //=======================================
                case 7:
                    System.out.println("Program Exit.");
                    break;
                //======================================
                //          INVALID CHOICE
                //======================================
                default:
                    System.out.println("Invalid choice! Please enter 1-5.");
            }
        }
        //======================================
        //          EXCEPTION HANDLING
        //======================================
            catch (InputMismatchException ex) {
            System.out.println();
            System.out.println("Invalid Input!");
            System.out.println("Please enter a number from 1 to 7.");
            sc.nextLine();
            }
        }while (choice != 7);
    }
}