/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnceEjercicios;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        /*Ejercicio 3
Escribir las siguientes expresiones matemáticas a pseudo-codigo*/
// Entrada
        int x1 = 0;
        int x2 = 0;
        int a = 200;
        int b = 5;
        int c = 6;
        x1 = (a + (b / c)) / ((a / b) + c);
        x2 = (a / (a + b)) / (a / (a - b));
//Salida
        JOptionPane.showMessageDialog(null, "El resultado de la primera operacion matematica es: " + x1
                + " \n El resultado de la segunda operacion matematica es: " + x2);

    }

}
