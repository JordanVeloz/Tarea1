/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnceEjercicios;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        /*Ejercicio 5.
Dados tres (3) números, Hacer una aplicación que calcule la resolvente.*/
        //Entrada
        double X = 0.0;
        double A = 0.0;
        double B = 0.0;
        double C = 0.0;
        //Proceso
        A = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de A:"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de B:"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de C:"));
        //Salida
         X = (-B +(Math.sqrt(Math.pow(B, 2) + (4*A*C))))/(2*A);
        
        JOptionPane.showMessageDialog(null, X);
    }

}
