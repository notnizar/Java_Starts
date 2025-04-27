package com.mycompany.mavenproject1;

import java.util.Scanner;

public class stars {

    public static void Stars_horizontal(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void Stars_Vertical(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void Stars_Cube(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void Start_Stick_Right(int n) {
        int sum;
        for (int i = 0; i <= n; i++) {
            sum = i;
            System.out.println("*");
            for (int j = 0; j <= sum; j++) {
                System.out.print(" ");
            }
        }
    }

    public static void Stars_Stick_Left(int n) {
        int sum;
        for (int i = 0; i <= n; i++) {
            sum = i;
            System.out.println("*");
            for (int j = n; j >= sum; j--) {
                System.out.print(" ");
            }
        }
    }

    public static void Stars_triangle_Shape(int n) {
        for (int i = 0; i <= n; i++) {
            int sum = i;
            int o = i * 2;
            int h = o - 1;
            //Line 55,54 Is to make the operation to add 2 everytime on i
            for (int j = 0; j < h; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

            for (int k = n; k >= sum; k--) {
                System.out.print(" ");
            }
        }
    }

    public static void Stars_Rhombus_Shape(int n) {
         //for this shape we will use triangle and updown it
        //uper section
        for (int i = 0; i <= n; i++) {
            int sum = i;
            int o = i * 2;
            int h = o - 1;
            //Line 55,54 Is to make the operation to add 2 everytime on i
            for (int j = 0; j < h; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

            for (int k = n; k >= sum; k--) {
                System.out.print(" ");
            }
        }
        
        //bottom Section

        for (int i = 0; i <= n; i++) {
            int sum = i+1;
            int o = i * 2;
            int h = o - 1;
            //Line 55,54 Is to make the operation to add 2 everytime on i
            for (int j = n*2; j > h; j--) {
                System.out.print("*");
            }
            System.out.println(" ");

            for (int k = 0; k <= sum; k++) {
                System.out.print(" ");
            }
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("                      Writed By : Nizar Mohammad Zaid ;)");
        System.out.println("**********************************************************************************");
        System.out.println("What You Would Like to See ?");
        System.out.println("1- Stars Shows In Horizontal");
        System.out.println("2- Stars Shows In Vertical");
        System.out.println("3- Stars Shows In Cube Shape");
        System.out.println("4- Stars Shows In Stick-Right");
        System.out.println("5- Stars Shows In Stick-Left");
        System.out.println("6- Stars Shows In triangle Shape");
        System.out.println("7- Strats Show In Rhombus Shape");
        System.out.println("***********************************************************************************");
        System.out.print("Choise :");
  

        int choise = input.nextInt();

        System.out.print("Enter A number: ");
        int n = input.nextInt();

        switch (choise) {
            case 1 ->
                Stars_horizontal(n);
            case 2 ->
                Stars_Vertical(n);
            case 3 ->
                Stars_Cube(n);
            case 4 ->
                Start_Stick_Right(n);
            case 5 ->
                Stars_Stick_Left(n);
            case 6 ->
                Stars_triangle_Shape(n);
            case 7 ->
                Stars_Rhombus_Shape(n);
            default ->
                System.out.println("Inviled Option");
        }

    }
}
