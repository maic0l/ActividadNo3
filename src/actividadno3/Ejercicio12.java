/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadno3;

/**
 *Realizar un programa que genere una matriz 5x5, inicializarla en 2 e 
 *imprimirla. 
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        
       /*Declaramos las filas y las columnas, para luego definir las medidas de 
       la matriz*/
       int filasYcolumnas = 5;//5x5
       int[][] matrizBid = new int[filasYcolumnas][filasYcolumnas];  
       
       //Empezamos un ciclo para inicializar la matriz con el valor 2
       for(int i = 0; i< filasYcolumnas; i++){
            for(int j = 0; j< filasYcolumnas; j++){
                matrizBid[i][j]= 2;                        
            }
        }
       //imprimimos la matriz:
       for(int i = 0; i < filasYcolumnas; i++){
            for(int j = 0; j < filasYcolumnas; j++){
                System.out.print(matrizBid[i][j] + " ");                         
            }
            System.out.println();//Separamos las filas
        }                                        
    }                        
}