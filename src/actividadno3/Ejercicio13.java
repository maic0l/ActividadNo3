/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadno3;

public class Ejercicio13 {

    /**
     * Realizar un programa que genere una matriz 7x7, inicializarla la diagonal 
     * principal con el número “0”(cero), el resto de las posiciones deben ser 
     * - (guion).Imprimir la matriz. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos el número de filas y columnas para luego iterar mejor
        int filasYcolumnas = 7;         
        //pasamos el valor a la matriz
        String[][] matriz = new String[filasYcolumnas][filasYcolumnas];
        //iniciamos con un bucle donde:
        for(int i = 0; i<filasYcolumnas; i++){
            for(int j = 0; j<filasYcolumnas; j++){
                if(i==j){//si i == j, pertenece a la diagonal principal.
                    matriz[i][j] = "0";
                }else{//De otra forma no pertenece. entonces es un"-".
                   matriz[i][j] = "-"; 
                }
            }            
        }
        //imprimimos la matriz
        for(int i = 0; i< filasYcolumnas; i++){
            for(int j = 0; j< filasYcolumnas; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();//Separamos las filas
        }               
    }
    
}
