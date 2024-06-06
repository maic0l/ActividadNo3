/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadno3;
//modulos a usdadrd
import java.util.Scanner;

public class Ejercicio3 {

    /**
     * Hacer un programa en Java que, dado un rango, por el usuario, se da
     * número inicial y uno final (tomar en cuenta que el inicial debe ser 
     * menor que el final, hacer la validación y volver a pedir los dos números 
     * si no cumple la condición) y sume los números pares dentro del rango 
     * incluyendo el valor inicial y final. 
     * @param args
     */
    public static void main(String[] args) {
        
        //variables
        int numeroInicial;
        int numeroFinal;
        int sumaPares = 0;
        
        //definimos el nombre del objeto Scanner
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Se calculara la suma de los números pares en el rango dado por usted");
        
        //do. mientras que el número Inicial sea mayor o igual al número final         
        do{
            System.out.println("\nPor favor ingrese el número donde quieres iniciar el rango (tiene que ser menor al numero final):");
            numeroInicial = leer.nextInt();
            System.out.println("Por favor ingrese el número donde quieres terminar el rango (tiene que ser mayor al numero inicial):");
            numeroFinal = leer.nextInt();
            
            if (numeroInicial >= numeroFinal){
                System.out.println("Recuerde que el número inicial debe ser menor al mayor");
            }
        }while(numeroInicial >= numeroFinal);
   
        //cuando se cumpla lo anterior, procedera con esta parte:
        //iniciamos un loop en el número inicial hasta el número final       
        for(int i = numeroInicial; i<= numeroFinal; i++  ){
            if(i % 2 == 0){//condición de número par encontrado              
                System.out.print(i + ", ");//impresión de coincidencias
                sumaPares += i;//suma de números pares encontrados
            }
        }
        //salida
        System.out.println("\nLa suma de los números pares encontrados en el rango dado es de: " + sumaPares);
    }
    
}
