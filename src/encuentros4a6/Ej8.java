/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package encuentros4a6;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int n;
       
       System.out.println("Escriba un número N");
       n= leer.nextInt();
       
        for (int i = 1; i <= n; i++) {
            if (i==1 || i==n) {
                for (int j = 1; j <= n; j++) {
                System.out.print("*");
                }
                System.out.println("");
            } else {
                System.out.print("*");
                for (int j = 1; j <= n-2; j++) {
                System.out.print(" ");
                    }
                System.out.println("*");}
            }
    }   
}  
 

       
 
