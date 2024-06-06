/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadno3;

//modulo a usar
import java.util.Scanner;

public class Ejercicio15 {

    /**
     * Realizar un programa que genere una matriz 5x6 y se rellene dinámicamente 
     * con los números impares partiendo desde n (n es dada por el usuario) y
     * se imprima
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Determinamos el nombre el objeto Scanner
        Scanner leer = new Scanner(System.in);
        
        //Declaramos las medidas de la matriz y el rango donde comenzaremos
        int filas = 5;
        int columnas = 6;
        int comienzoDeRango;
        //matriz
        int[][] matriz = new int[filas][columnas];
        
        //le pedimos al usuario donde iniciaremos la busqueda de los impares
        System.out.println("Ingrese un número para encontrar los números impares que se encuentren partiendo de su número, para luego rellenar la matriz 5x6: ");
        comienzoDeRango = leer.nextInt();
        
        //iniciamos un bucle, para iterar cuales son pares y cuales no
        for(int i = 0; i < filas ; i++){
            for(int j = 0; j < columnas ; j++){
                do{                    
                    if(comienzoDeRango % 2 != 0){//añade el impar a la posición
                        matriz[i][j] = comienzoDeRango;                                            
                    } 
                    comienzoDeRango++;
                }while(comienzoDeRango % 2 == 0);/*revisa si es par, hasta que 
                la condición de impar se cumpla*/                
            }  
        } 
        //imprimimos la matriz
        for(int i = 0; i < filas ; i++){
           for(int j = 0; j < columnas; j++){
                System.out.print(matriz[i][j] + " ");
            } 
            System.out.println();//Separamos las filas 
        }                                        
    }
    
}
