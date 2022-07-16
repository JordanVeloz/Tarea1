/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        /*Ejercicio 8.
Construye un algoritmo que calcule e imprima la tabla de multiplicar, desde la tabla
del 1 hasta la del 10.
*/
        Scanner input = new Scanner(System.in);
        int n = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 12; j++) {
                n = i * j;
                System.out.println(i + "*" + j + "=" + n);
            }
        }
    }
    
}
