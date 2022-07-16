/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUltimos;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        // Entrada
        Scanner input = new Scanner(System.in);

        int lado = 0;

        System.out.println("Ingrese la medida de un lado del petagono: ");
        lado = input.nextInt();

        System.out.println("El perimetro del pentagono es: " + calcular(lado));

    }

    public static int calcular(int lado) {
        return lado * 5;
    }
    
}
