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
public class Activity_03_InfixToPrefix {
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
    //Convert Infix expression into Prefix
    public static String infixToPrefix(String expression)
    {
        // Step 1: Reverse the expression
        String reversed = "";
        for(int i = expression.length() - 1; i >= 0; i--)
        {
            char ch = expression.charAt(i);

            // Step 2: Change brackets
            if(ch == '(')
            {
                reversed = reversed + ')';
            }
            else if(ch == ')')
            {
                reversed = reversed + '(';
            }
            else
            {
                reversed = reversed + ch;
            }
        }

        // Step 3: Convert reversed expression to postfix
        Stack<Character> stack = new Stack<>();
        String output = "";

        for(int i = 0; i < reversed.length(); i++)
        {
            char ch = reversed.charAt(i);

            // If letter or number, add to output
            if(Character.isLetterOrDigit(ch))
            {
                output = output + ch;
            }

            // If opening bracket, push into stack
            else if(ch == '(')
            {
                stack.push(ch);
            }

            // If closing bracket
            else if(ch == ')')
            {
                while(!stack.isEmpty() && stack.peek() != '(')
                {
                    output = output + stack.pop();
                }

                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }

            // If operator
            else if(isOperator(ch))
            {
                while(!stack.isEmpty() &&
                      stack.peek() != '(' &&
                      precedence(stack.peek()) > precedence(ch))
                {
                    output = output + stack.pop();
                }

                stack.push(ch);
            }
        }

        // Empty the stack
        while(!stack.isEmpty())
        {
            output = output + stack.pop();
        }

        // Step 4: Reverse postfix to get prefix
        String prefix = "";

        for(int i = output.length() - 1; i >= 0; i--)
        {
            prefix = prefix + output.charAt(i);
        }

        return prefix;
    }
}
