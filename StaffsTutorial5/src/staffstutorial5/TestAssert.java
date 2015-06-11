/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffstutorial5;

import java.util.Scanner;

/**
 *
 * @author Alexandre Ravaux
 */
public class TestAssert {
   
    public static int inputInt(){
        Scanner sc=new Scanner(System.in);
        int inputInt;
        System.out.println("Enter an integer : ");
        try{
            inputInt=sc.nextInt();
        }catch(Exception e){
            System.out.println("Your input is not an integer, retry : ");
            inputInt=inputInt();
        }
        return inputInt;
    }
    
    public static double inputDouble(){
        Scanner sc=new Scanner(System.in);
        double inputDouble;
        System.out.println("Enter a double : ");
        try{
            inputDouble=sc.nextDouble();
        }catch(Exception e){
            System.out.println("Your input is not a double, retry : ");
            inputDouble=inputDouble();
        }
        return inputDouble;
    }
    
}
