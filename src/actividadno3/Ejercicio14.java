/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadno3;

//Modulo a usar
import java.util.Random;

public class Ejercicio14 {

    /**
     * Realizar un programa que genere un arreglo de 50 posiciones y se rellene 
     * con la función ramdom de Java (los números deben ser 1 a 99), 
     * luego de llenar hacer la impresión de la matriz. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //asignamos un nombre para el objeto random
        Random aleatorio = new Random();
        
        //declaramos el arreglo
        int[] arregloPosiciones = new int[50];
        
        //inicializamos el bucle, donde a cada posicion daremos un número random
        for(int i = 0; i < arregloPosiciones.length; i++ ){
            arregloPosiciones[i] = aleatorio.nextInt(100);//declaramos el rango
        }
        //imprimimos el arreglo:
        for(int i = 0; i < arregloPosiciones.length; i++ ){
            System.out.print(arregloPosiciones[i] + " ");
        }        
    }
    
}

