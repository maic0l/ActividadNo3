/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadno3;
//Modulo a usar
import java.util.Scanner;

public class Ejercicio2 {
    
    /**
     * Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3 
     * (para ser sumado debe verificarse que sea múltiplo de 5 y 3 a la vez) 
     * comprendidos entre 1 y n (n es determinado por el usuario). Imprimir la 
     * cantidad de múltiplos de 5 y 3. 
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        //Declaración de variables
        int numeroLimite;
        int numeroIntervalo = 1;
        int multiplosDeTres = 0;
        int multiplosDeCinco = 0;
        int multiplosDeAmbos = 0;        
        int sumaNumeros = 0;
        
        //Objeto Scanner
        Scanner leer = new Scanner(System.in);
        
        //pedimos el ingreso de un numero por parte del usuario
        System.out.println("Ingrese un número para calcular cuantos multiplos de 3 y 5 hay de 1 hasta su número: ");
        numeroLimite = leer.nextInt(); //Rango limite dado por el usuario
        
        //condicionales
        while(numeroIntervalo <= numeroLimite){//condición No1, Entrada al loop.
            
            if(numeroIntervalo % 5 == 0){//condición No2 Suma de multiplos de 5
                multiplosDeCinco++;
            }    
            if(numeroIntervalo % 3 == 0){//condición No3 Suma de multiplos de 3
                multiplosDeTres++;
            }//condición No4 Suma de multiplos de 5 y 3
            if(numeroIntervalo % 3 == 0 && numeroIntervalo % 5 == 0){
                multiplosDeAmbos++;
                sumaNumeros += numeroIntervalo;/*suma de números que cumplan las 
                2 condiciones*/
                
                //impresión de coincidencias
                System.out.print(numeroIntervalo + ", ");                                            
            }
            numeroIntervalo++;
        }
        //salidas
        System.out.println("\nel número de multiplos que cumplen las dos condiciones son: " + multiplosDeAmbos + ", Y su suma da: " + sumaNumeros + ".");        
        System.out.println("El número de multiplos de 3 encontrados son: " + multiplosDeTres + ".") ;
        System.out.println("El número de multiplos de 5 encontrados son: " + multiplosDeCinco + ".");
    }
    
}
