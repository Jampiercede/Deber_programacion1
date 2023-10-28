// Commit 1: Agregar estructura básica y clases de utilidad

package com.mycompany.deber_programacion1;

import java.util.Scanner;
import java.util.Random;

public class NewMain {
    
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Random aleatorios = new Random();

    int numero1 = aleatorios.nextInt(10); // Números de 0 a 9
    int numero2 = aleatorios.nextInt(10); // Números de 0 a 9

    System.out.println("Cuánto es " + numero1 + " + " + numero2 + "?");
    int respuesta = entrada.nextInt();

    if(respuesta == (numero1 + numero2)) {
        System.out.println("Correcto!");
    } else {
        System.out.println("Incorrecto.");
    }
    System.out.println("Cuánto es " + numero1 + " - " + numero2 + "?");
int respuestaResta = entrada.nextInt();

if (respuestaResta == (numero1 - numero2)) {
    System.out.println("Correcto!");
} else {
    System.out.println("Incorrecto.");
}   
      
    
}
    
    
    
    
}



