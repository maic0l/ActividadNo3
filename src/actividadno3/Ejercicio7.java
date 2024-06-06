/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadno3;
//Modulo a usar
import java.util.Scanner;

public class Ejercicio7 {

    /**
     * Realizar un programa en Java que dado n cantidad de números determine si 
     * es primo o no y si ese número primo es múltiplo de 3, se debe contar. 
     * Imprimir cantidad de primos y cantidad de múltiplos de 3
     * @param args
     */
    public static void main(String[] args) {
        //Declaramos el nombre del objeto Scanner
        Scanner leer = new Scanner(System.in);
        
        //variables
        int rangoNumeral;
        int cantidadPrimos = 0;
        int multiplosDeTres = 0;
        int multiplosDeTresPrimos = 0;
        
        //pedimos al usuario el número necesario para determinae el rango de 1-n
        System.out.println("Ingrese un número para determinar cuantos números primos y cuantos son multiplos de 3, en el rango de 1 hasta su número.");
        rangoNumeral = leer.nextInt(); //Rango de número dado por el usuario
        
        //comenzamos un loop para verificar cada número en el rango dado
        for(int i = 2;i<=rangoNumeral;i++){
           
            /*El contador de coincidencias, nos ayudará a determinar si es o no 
            primo*/
            int contador = 0;
            
            //iniciamos el bucle para verificar si el número en i es primo o no
            for(int j=1;j<=i; j++){
                if(i%j==0) {//si encuentra algúna coincidencia                  
                    contador++;//se sumara 1 al contador
                }
                if(contador > 2){//y si encuentra una tercera coincidencias 
                    break; /*saldremos del blucle,ya que se cumplirán más de las
                    2 condiciones. 
                    las 2 condiciones: num % 1 == 0 y num % num == 0*/
                }                    
            }
            
            //contamos la cantidad de números primos que haya en ese rango
            if(contador==2){
                cantidadPrimos++;
                System.out.print(i + ", ");//imprimimos la coincidencia
                if(i % 3 == 0){//Contamos los primos que sean multiplos de 3
                    multiplosDeTresPrimos++;
                }
            }
            if(i % 3 == 0){//Cantidad de multiplos de 3
                multiplosDeTres++;
            }

                                
        }
        //salidas
        System.out.println("\nEl número de primos encontrados es de: " + cantidadPrimos);
        System.out.println("El número de multiplos de 3 es de: " + multiplosDeTres);
        System.out.println("El número de multiplos de 3 que sean primos es de: " + multiplosDeTresPrimos);
    }
    
}