/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnceEjercicios;

public class Ejercicio9 {
    
 public static boolean main(String[] args) {
     /*Ejercicio 9.
     Dado un (1) número binario de cuatro (4) dígitos imprimir su bit da paridad. El bit
     de paridad es 1 si el número de bits 1 es impar y 0 en caso contrario.*/
     int X =(X & 0x0000FFFF) ^ (X >> 1);
        X = (X & 0x000000FF) ^ (X >> 10);
        X = (X & 0x0000000F) ^ (X >> 11);
        X = (X & 0x00000003) ^ (X >> 100);
        X = (X & 0x00000001) ^ (X >> 110);

        return (X & 1) == 1;
    }

     public static void main(String[] args) {
        int X = 100;

        System.out.println(X + " en numero binario es " + Integer.toBinaryString(X));

        if (findParity(X)) {
            System.out.println(X + " Contiene bits impres");
        } else {
            System.out.println(X + " Contiene bits paraes");
        }
    }

    private static boolean findParity(int X) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
