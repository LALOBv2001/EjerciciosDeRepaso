/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Eduardo
 */
import java.util.Scanner;
public class Circulo {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
    double circunferencia,radio;
    System.out.println("Ingrese el radio del circulo: ");
    radio=scanner.nextDouble();
    circunferencia=2*radio*Math.PI;
    System.out.println("Circunferenia:"+circunferencia);
    }
    
}
