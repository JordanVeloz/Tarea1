/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        /* Ejercicio 6.
Dada una secuencia de números terminada en cero (0), elaborar un algoritmo que
informe al usuario qué valor tiene el número mayor y qué valor tiene el número
menor, sin contar el cero (0)*/
        //Entrada
        Scanner input = new Scanner(System.in);
        String n="124890654";
        String n2="3478543";
        String nc="";
        String nc2="";
        //Proceso
        int nci=0,nci2=0;
        for(int i=0; i<n.length() ;i++){
            if(n.charAt(i)!='0'){
            nc=nc+n.charAt(i);
            
        }            
        }
        for(int i=0; i<n2.length() ;i++){
            if(n2.charAt(i)!='0'){
            nc2=nc2+n2.charAt(i);           
        }            
        }
       
         nci= Integer.parseInt(nc);
        nci2= Integer.parseInt(nc2);
           if (nci>nci2 ){
               System.out.println("EL mayor es: "+nci);    
               System.out.println("EL menor es: "+nci2);               
           }else {
               System.out.println("EL mayor es: "+nci2);
               System.out.println("EL menor es: "+nci);
           }
           
    }
    
}
