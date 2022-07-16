/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUltimos;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        //Entrada
        Scanner input = new Scanner(System.in);

        int exponente = 0;
        int base = 0;

        System.out.println("Ingrese la base: ");
        base = input.nextInt();
        System.out.println("Ingrese el exponente: ");
        exponente = input.nextInt();

        System.out.println("El resultado es: " + elevar(base, exponente));

    }

    public static double elevar(int base, int exponente) {
        return Math.pow(base, exponente);
    }
    
}
