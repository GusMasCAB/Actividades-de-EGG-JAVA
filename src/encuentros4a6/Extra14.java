/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package encuentros4a6;

import java.util.Scanner;

public class Extra14 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        float hijos, familias, edad, suma=0;
        float sumaMedia=0,mediaF=0, mediaG;
        System.out.println("Escriba la cantidad de familias");
        familias=leer.nextInt();
        
        for (int i = 0; i < familias; i++) {
            System.out.println("Escriba la cantidad de hijos");
            hijos=leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Escriba la edad de sus hijos");
                edad=leer.nextInt();
                suma=suma+edad;
            }
            mediaF=suma/hijos;
            suma=0;
            System.out.println("El promedio de edad de esta familia es " + mediaF);
            sumaMedia=sumaMedia+mediaF;
        }
        System.out.println("El promedio de edad de hijos de todas las familias es");
        System.out.println(sumaMedia/familias);
        
    }
}
