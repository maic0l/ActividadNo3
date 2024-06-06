/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadno3;
//modulos a usar
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;


public class Ejercicio18 {

    /**
     * Generar una matriz nxn (dado por el usuario) el valor de n debe ser mayor 
     * a 2 y menor a 10 y llenarla con números aleatorios. 
     * @param args
     */
    public static void main(String[] args) {
               
    //casteo de datos
    short filas = 0;
    short columnas = 0;

    do{
        filas = Short.parseShort(JOptionPane.showInputDialog("El numero de filas: "));
        columnas = Short.parseShort(JOptionPane.showInputDialog("El numero de columnas"));
        if (filas < 2 || filas > 10 || columnas < 2 || columnas > 10){
            System.out.println("las filas y las columnas deben ser mayor a 2 y menor a 10");
        }        
    }while(filas < 2 || filas > 10 || columnas < 2 || columnas > 10);
    short[][] arrayBidimen = new short[filas][columnas];

    for(int i = 0; i < filas; i++){
        for(int j = 0; j< columnas;j++){
            arrayBidimen[i][j] = (short) ((Math.random() * 20) + 1);
        }
    }
    for(int i = 0; i < filas; i++){
       for(int j = 0; j< columnas;j++){
           System.out.print(arrayBidimen[i][j] + " ");
        }
        System.out.println();
    }


    }
    
}
