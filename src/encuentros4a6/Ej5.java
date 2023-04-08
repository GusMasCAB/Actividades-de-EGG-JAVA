/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
*/
package encuentros4a6;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un valor limite positivo");
        int limit = leer.nextInt();
        int suma=0;
        do {            
         int num=leer.nextInt();
         suma=suma+num;
            System.out.println(suma);
        } while (suma<=100);
        System.out.println("Te pasaste el limite");
        System.out.println("La suma es " + suma);
    }
}
