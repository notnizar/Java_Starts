/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author nezar
 */
public class Starts_project {
    
    public static double Celesus_To_Fernhight(double celesus){
    return (celesus * 9/5) + 32;
    }
    
    
    public static double Fernhight_To_Celesus(double fernhight){
    return (fernhight - 32)* 5/9;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choise the convert type:");
        System.out.println("1-Celesuios to Fernhighte");
        System.out.println("2-Fernhigt to Celesuise");
        int choise = scanner.nextInt();
        
        if(choise == 1){
            System.out.println("Enter the deggre in celesuios:");
            double celesus_deggre = scanner.nextDouble();
            double fernhight = Celesus_To_Fernhight(celesus_deggre);
             System.out.println(celesus_deggre + "C is equal to " + fernhight + "F");
        }
        if(choise == 2){
            System.out.println("Enter the deggere in Fernhight:");
            double fernhoght = scanner.nextDouble();
            double celesus = Fernhight_To_Celesus(fernhoght);
            System.out.println(fernhoght + "F is equal to " + celesus + "C");
        }else {
            System.out.println("Enter a vaild choise");
        }
        scanner.close();
    }
}
