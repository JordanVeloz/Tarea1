/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUltimos;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        /*Ejercicio 1.
Construya una función que solicite edades al usuario y determine el promedio de
las edades mayores a 18 años. El usuario indicará cuando desea dejar de
suministrar datos de entrada. En la Acción Principal se informará el promedio
calculado.
*/
        //Proceso
          Scanner input = new Scanner(System.in);

        int N = 0;
        double suma = 0;
        double promedio = 0;
        int contador = 0;

        System.out.println("ingrese un numero: ");
        N = input.nextInt();

        suma += N;

        while (N != 0) {
            System.out.println("ingrese un numero: ");
            N = input.nextInt();
            suma += N;
            contador++;
        }
        promedio = suma / contador;
        System.out.println("Su promedio es: " + promedio);
    }
    
}
