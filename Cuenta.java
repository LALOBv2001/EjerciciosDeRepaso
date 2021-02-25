/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosRepaso;

/**
 *
 * @author Eduardo
 */
public class Cuenta {
    private String Titular;
    private double Cantidad;
    public Cuenta(String t)
    {
        Titular=t;
        Cantidad=0;
    }
    public Cuenta(String t,double c)
    {
    this.Cantidad=c;
    this.Titular=t;
    }
    public String getTitular()
{ 
    // retorna el valor de la variable dia
    return Titular; 
}
public void setTitular(String t)   
{ 
    // asigna el valor del parametro a la variable dia
    this.Titular = t;    
}
public double getCantidad()
{ 
    // retorna el valor de la variable dia
    return Cantidad; 
}
public void setCantidad(double c)   
{ 
    // asigna el valor del parametro a la variable dia
    this.Cantidad = c;    
}
public void Ingresar(double c)
{
    if(c>0)
    {
    this.Cantidad=c;
    }

}
public void Retirar(double c)
{
    this.Cantidad=this.Cantidad-c;
    if(this.Cantidad<=0)
    {
    this.Cantidad=0;
    }
}
public String toString()
{
    return("Titular:"+Titular+"\nSaldo de la cuenta:"+Cantidad);
 }
            
    
}
