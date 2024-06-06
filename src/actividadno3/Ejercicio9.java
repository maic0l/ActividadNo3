/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadno3;
//modulo a usar
import java.util.Scanner;


/**
 * Leer N cantidad de notas (validar rango de notas), imprimir el promedio de
 * las notas, la nota más alta y la más baja. 
 */
public class Ejercicio9 {

    /**
     * Leer N cantidad de notas (validar rango de notas), 
     * imprimir el promedio de las notas, la nota más alta y la más baja
     * @param args
     */
    public static void main(String[] args) {
        //definimos el nombre del objeto Scanner
        Scanner leer = new Scanner(System.in);
        //variables
        int rangoDeNotas;
        double nota;
        double sumaTotalDeNotas = 0;
        double notaMasAlta= Double.MIN_VALUE; //Menor valor posible
        double notaMasBaja= Double.MAX_VALUE; //Mayor valor posible
        
        //pedimos al usuario el número de notas a ingresa
        
        System.out.println("Ingrese el número de notas a ser ingresadas:");
        rangoDeNotas = leer.nextInt();
        
        //comenzamos la entrada de cada nota, segpun el rango dado
        for(int i = 1; i <= rangoDeNotas; i++){
            //ingreso de cada nota
            System.out.println("Ingrese la nota No" + i + " Porfavor:");
            nota = leer.nextDouble();
            sumaTotalDeNotas += nota; //Suma de las notas. para promediar
            
            //Verificación de la mayor nota dada hasta el momento.
            if(notaMasAlta < nota){
                notaMasAlta = nota;
            }
            //Verificación de la menor nota dada hasta el momento.
            if(notaMasBaja > nota){
                notaMasBaja = nota;
            }
        }

        System.out.println("el promedio total de las notas es de: " + sumaTotalDeNotas/rangoDeNotas); //promedio
        System.out.println("La nota más alta es de: " + notaMasAlta);//mayor nota
        System.out.println("La nota más baja es de: " + notaMasBaja);//menor nota
    }
    
}
