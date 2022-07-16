/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnceEjercicios;

public class Ejercicio2 {

    public static void main(String[] args) {
        /* Ejercicio 2.
¿Siguiendo la prioridad de operadores, convierta a expresión matemática,
resuelva e indique en cuál tipo de variable almacenará el resultado de las
siguientes expresiones:
 (5 + 3 * 2) + 9 > 3 * 5 * 14 % 3
 2 *(4 – 10 + 8)/2* 36 *(1/2)
 260 / 12 + 54 % 3 – 85 % 7
 (48 < 2 * 3) | | (2 * 7 < 12)
 ((8 > 2) | | (932 < 23) ) && 4 == 2*/
//Entrada
        boolean Resultado1 = (5 + 3 * 2) + 9 > 3 * 5 * 14 % 3;
        double Resultado2 = 2 * (4 - 10 + 8) / 2 * 36 * (1 / 2);
        double Resultado3 = 260 / 12 + 54 % 3 - 85 % 7;
        boolean Resultado4 = (48 < 2 * 3) || (2 * 7 < 12);
        boolean Resultado5 = ((8 > 2) || (932 < 23)) && 4 == 2;
//Salida
        System.out.println(Resultado1);
        System.out.println(Resultado2);
        System.out.println(Resultado3);
        System.out.println(Resultado4);
        System.out.println(Resultado5);
    }
}
