/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java
*/
package encuentros4a6;

import java.util.Scanner;

public class Ej2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase");
        String frase = leer.nextLine();
        
        if ( "eureka".equalsIgnoreCase(frase)) {
            System.out.println("Correcto son iguales");
        } else {
            System.out.println("Incorrecto no son iguales");
        }
    }
   
    
}
   
