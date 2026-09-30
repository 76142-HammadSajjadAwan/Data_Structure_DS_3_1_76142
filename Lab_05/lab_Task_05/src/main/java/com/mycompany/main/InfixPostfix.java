/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.util.Stack;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class InfixPostfix {
   
    public static int precedence(char operator)
    {        
        if(operator=='*'||operator=='/'||operator=='%')
        {
            return 2;
        }
        else if(operator=='+'||operator=='-')
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
        return ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%';
    }
    public static String infixToPostfix(String expression)
    {
        Stack<Character> stack=new Stack<>();
        String output="";
        //for reading number left to right
        for(int i=0;i<expression.length();i++)
        {
            char ch=expression.charAt(i);
            //for checking letter
            if(Character.isLetterOrDigit(ch))
            {
                output= output + ch;
            }
            else if(ch=='(')
            {
                stack.push(ch);
            }
            else if(ch==')')
            {
                while(!stack.isEmpty() &&stack.peek()!='(')
                {
                    output=output + stack.pop();
                }
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else if(isOperator(ch))
            {
                while(!stack.isEmpty() && stack.peek()!='(' && precedence(stack.peek())>=precedence(ch))
                {
                    output = output + stack.pop();
                }
                 stack.push(ch);
            } 
        }
        while(!stack.isEmpty())
        {
            output = output + stack.pop();
        }
        
        return output;
    }
    
    //===============================
    //Bonus
    //===============================
    
    public static int evaluatePostfix(String postfix)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < postfix.length(); i++)
        {
            char ch = postfix.charAt(i);

            // Ignore spaces
            if(ch == ' ')
            {
                continue;
            }
            // If character is not an operator, it is an operand
            if(!isOperator(ch))
            {
                stack.push(ch - '0');
            }
            // If character is an operator
            else
            {
                int b = stack.pop();
                int a = stack.pop();

                if(ch == '+')
                {
                    stack.push(a + b);
                }
                else if(ch == '-')
                {
                    stack.push(a - b);
                }
                else if(ch == '*')
                {
                    stack.push(a * b);
                }
                else if(ch == '/')
                {
                    stack.push(a / b);
                }
            }
        }
        return stack.pop();
    }
}
