/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_06;
import java.util.Stack;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class Activity_06_PostfixToPrefix {
    //This method is for checking the precedence of operators.
    public static int precedence(char operator)
    {
        if(operator == '*' || operator == '/' || operator == '%')
        {
            return 2;
        }
        else if(operator == '+' || operator == '-')
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
     public static boolean isOperator(char ch)
    {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%';
    }
    public static String postfixToPrefix(String expression)
    {
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < expression.length(); i++)
        {
            char ch = expression.charAt(i);

            if(Character.isLetterOrDigit(ch))
            {
                stack.push(String.valueOf(ch));
            }
            else if(isOperator(ch))
            {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String result = ch + operand1 + operand2;
                stack.push(result);
            }
        }
        return stack.pop();
    }
}
