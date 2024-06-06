/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadno3;
//modulos a usar
import java.util.Scanner;

public class Ejercicio8 {

    /**
     * Dado N cantidad de precios de gaseosas en un supermercado el gerente de 
     * ventas desea que se genere un programa que le permita saber cuál de las 
     * gaseosas tiene el mayor precio, cuál tiene menor precio y cuál es el 
     * precio promedio. Hacer las impresiones según lo requerido
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definimos el nombre del objeto Scanner
        Scanner leer = new Scanner(System.in);
        //Variables
        double rangoDeGaseosas;
        double precioDeGaseosa;
        double precioAPromediar = 0;
        double gaseosaConMayorPrecio= Double.MIN_VALUE;//Mayor valor posible
        double gaseosaConMenorPrecio= Double.MAX_VALUE;//Menor valor posible
        
        //pedimos el rango de gaseosas a ser calculadasd
        System.out.println("Ingrese el número de gaseosas a ser calculadas y promediadas:");
        rangoDeGaseosas = leer.nextDouble();
        
        //Ingreso de el precio de cada gaseosa
        for(int i = 1; i <= rangoDeGaseosas; i++){
            
            //ingreso del precio de la gaseosa
            System.out.println("Ingrese el precio de la gaseosa No" + i + " Porfavor:");
            precioDeGaseosa = leer.nextDouble();
            precioAPromediar += precioDeGaseosa; //suma de cada precio.
            
            //Verificación del mayor precio dado hasta el momento.
            if(gaseosaConMayorPrecio < precioDeGaseosa){
                gaseosaConMayorPrecio = precioDeGaseosa;
            }
            //Verificación del menor precio dado hasta el momento.
            if(gaseosaConMenorPrecio > precioDeGaseosa){
                gaseosaConMenorPrecio = precioDeGaseosa;
            }
        }
        //salidas
        System.out.println("El precio promedio de las gaseosas es de: " + precioAPromediar/rangoDeGaseosas);//promedio
        System.out.println("La de mayor precio, cuesta: " + gaseosaConMayorPrecio);//Mayor precio
        System.out.println("La de menor precio, cuesta: " + gaseosaConMenorPrecio);//Menor precio
    }
    
}
