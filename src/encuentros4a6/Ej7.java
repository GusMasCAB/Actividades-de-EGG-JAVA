/*
 Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package encuentros4a6;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int correcta=0, incorrecta=0, k = 5;
        String cadena;
        System.out.println("Ingrese una cadenas y finalice con &&&&&");
        cadena=leer.nextLine();
        while (!(cadena.equalsIgnoreCase("&&&&&"))) {             
            if (cadena.length()== k) {
                if (cadena.substring(0,1).equalsIgnoreCase("X")&&cadena.substring(k-1,k).equalsIgnoreCase("O")) {
                    correcta=correcta+1;
                } else {
                    incorrecta=incorrecta+1;
                }
            } else {
                incorrecta= incorrecta + 1;
            }
            System.out.println("Ingrese una cadenas y finalice con &&&&&");
            cadena=leer.nextLine();
        } 
        
        System.out.println("Correctas: "+correcta );
        System.out.println("Incorrectas: "+incorrecta);
    }
}
