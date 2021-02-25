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
public class Cuadratica {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
    double a,b,c,determinante,x1,x2;
    System.out.println("Ingrese el coeficiente para a");
    a=scanner.nextDouble();
    System.out.println("Ingrese el coeficiente para b");
    b=scanner.nextDouble();
    System.out.println("Ingrese el coeficiente para c");
    c=scanner.nextDouble();
    determinante=Math.pow(b,2)-(4*a*c);
    if(determinante>=0)
    {
    x1=(-b+Math.sqrt(determinante))/(2*a);
        x2=(-b-Math.sqrt(determinante))/(2*a);

        System.out.println("Primera solucion:"+x1);
                System.out.println("segunda solucion:"+x2);

    }
    else
    {
        System.out.println("No hay solucion.");
     }
    
    }
    
}
