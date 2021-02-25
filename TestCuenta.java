/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosRepaso;

/**
 *
 * @author Eduardo
 */ import java.util.Scanner;
public class TestCuenta {
    public static void main(String[]args)
    {
        Cuenta miCuenta1= new Cuenta("Pedro",300);
        Cuenta miCuenta2=new Cuenta("Fernando",300);
        miCuenta1.Ingresar(300);
        miCuenta2.Ingresar(400);
        miCuenta1.Retirar(500);
        miCuenta2.Retirar(100);
       System.out.println(miCuenta1.toString());
        System.out.println(miCuenta2.toString());
    
    }
    
}
