/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Felix
 */
import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Calculator {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter First number: ");
       
       int num1, num2;
       num1 = input.nextInt();
       System.out.println("Enter secound number: ");
       num2 = input.nextInt();
       
       System.out.println(
               "Enter your selection: 1 for Addition, "
                       + "2 for subrraction, "
                       + "3 for Multipliation and "
                       + "4 for division:");
       
       int choose;
       choose = input.nextInt();
       
       switch (choose){
           case 1:
               System.out.println(add( num1, num2));
               break;
           case 2:
               System.out.println(sub( num1, num2));
               break;
           case 3:
               System.out.println(mult( num1, num2));
               break;
           case 4:
               System.out.println(div( num1,num2));
               break;
           default:
               System.out.println("illigal Operation");
       }
       
       
       
       
    }
    public static int add(int x, int y){
           int result = x + y;
           return result;
       }
    public static int sub(int x, int y){
        int result = x - y;
        return result;
    }
    public static int mult(int x, int y){
        int result = x*y;
        return result;
    }
    public static int div(int x, int y){
        int result = x/y;
        return result;
    }
    
}
