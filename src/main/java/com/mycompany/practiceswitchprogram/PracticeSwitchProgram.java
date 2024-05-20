/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practiceswitchprogram;

import java.util.Scanner;

/**
 *
 * This is a practice switch program
 */
public class PracticeSwitchProgram {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        //variable region below
        int numberInput;
        //variable region above

        System.out.println("Enter a any number ranging from 1 to 10");
        numberInput = keyboard.nextInt(); 
        
        
        switch (numberInput) {
            case 1:
                System.out.println("Number entered is 1");
                break;
            case 2:
                System.out.println("Number entered is 2");
                break;
            case 3:
                System.out.println("Number entered is 3");
                break;
            case 4:
                System.out.println("Number entered is 4");
                break;
            case 5:
                System.out.println("Number entered is 5");
                break;
            case 6:
                System.out.println("Number entered is 6");
                break;
            case 7:
                System.out.println("Number entered is 7");
                break;
            case 8:
                System.out.println("Number entered is 8");
                break;
            case 9:
                System.out.println("Number entered is 9");
                break;
            case 10:
                System.out.println("Number entered is 10");
                break;
            default:
                System.out.println("Number entered is out of the given range");
        }
    }
}
