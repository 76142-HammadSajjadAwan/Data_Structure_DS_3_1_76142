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
public class Activity_01_InfixToPostfix {
    //This method is for checking the precedence of operators.
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
    //Convert Infix expression into Postfix
    public static String infixToPostfix(String expression)
    {
        Stack<Character> stack=new Stack<>();
        String output="";

        for(int i=0;i<expression.length();i++)
        {
            char ch=expression.charAt(i);
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
}
