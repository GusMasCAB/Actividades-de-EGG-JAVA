//Crear un programa que dado un número determine si es par o impar.
package encuentros4a6;

import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un número entero y le diremos si es par o impar");
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número ingresado es impar");
        }
    }
    
    }
    
   


    

