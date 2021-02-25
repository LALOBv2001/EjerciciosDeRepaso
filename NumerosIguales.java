/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Eduardo
 */import java.util.Scanner;
public class NumerosIguales {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        double N1,N2;
        System.out.println("Ingrese el valor del primer numero:");
        N1=scanner.nextDouble();
         System.out.println("Ingrese el valor del segundo numero:");
        N2=scanner.nextDouble();
        if(N1==N2)
        {
         System.out.println("Numeros iguales");
        }
        else
            System.out.println("Numeros diferentes");
    
    }
    
}
