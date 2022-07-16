/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnceEjercicios;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        /* Ejercicio 10.
Dado un (1) número binario de cuatro (4) dígitos imprimir su valor*/
        //Entrada
        long Numero, aux, digito, decimal;
        int Exponente;
        boolean EsBinario;
        Scanner sc = new Scanner(System.in);
        //Proceso
        do {
            System.out.print("Introduzca un numero binario: ");
            Numero = sc.nextLong();
            EsBinario = true;
            aux = Numero;
            while (aux != 0) {
                digito = aux % 10; 
                if (digito != 0 && digito != 1) { 
                    EsBinario = false; 
                }
                aux = aux / 10;                          
            }
        } while (!EsBinario); 
        Exponente = 0;
        decimal = 0; 
        while (Numero != 0) {
            digito = Numero % 10;                          
            decimal = decimal + digito * (int) Math.pow(2, Exponente);
            Exponente++;
            Numero = Numero / 10;
        }
        //Salida
        System.out.println("Decimal: " + decimal);
        
    }
    
}
