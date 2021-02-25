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
public class Radio {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        double radio,area;
    System.out.println("Ingrese el radio:");
    radio=scanner.nextDouble();
    area=Math.PI*Math.pow(radio,2);
    System.out.println("Area:"+area);
    }
    
}
