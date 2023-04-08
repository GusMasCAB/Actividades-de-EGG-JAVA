/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

*/
package encuentros4a6;

import java.util.Scanner;

public class Ej6 {
    
    public static void main(String[] args)  {
        int num, num2, opcion;
        String letra, bandera;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba dos números enteros positivos");
        letra="n";
        do {            
            num = leer.nextInt();
            if (num<0) {
                System.out.println("El número es negativo vuelva a escribirlo");
            }
        } while (num<0);
         do {            
            num2 = leer.nextInt();
            if (num2<0) {
                System.out.println("El número es negativo vuelva a escribirlo");
            }
        } while (num2<0);
         
        do {   
         System.out.println("*********************Menú************************");
         System.out.println("1. Sumar");
         System.out.println("2. Restar");
         System.out.println("3. Multiplicar");
         System.out.println("4. Dividir");
         System.out.println("5. Salir");
         System.out.println("Eliga la opcion");
         
         opcion=leer.nextInt();
         leer.nextLine();
            switch (opcion) {
                
            case 1:
                System.out.println("Suma");
                System.out.println((num+"+")+(num2+"= ")+(num+num2));
                System.out.println("Presione enter para realizar otra operacion");       
                leer.nextLine();
                break;
            case 2:
                System.out.println("Resta");
                System.out.println((num+"-")+(num2+"= ")+(num-num2));
                System.out.println("Presione enter para realizar otra operacion");
                leer.nextLine();
                break;         
            case 3:
                System.out.println("Multiplicacion");
                System.out.println((num+"*")+(num2+"= ")+(num*num2));
                System.out.println("Presione enter para realizar otra operacion");
                leer.nextLine();
                break; 
            case 4:
                System.out.println("Division");
                System.out.println((num+"/")+(num2+"= ")+(num/num2));
                System.out.println("Presione enter para realizar otra operacion");
                leer.nextLine();
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                letra=leer.nextLine();
                break; 
            }
        } while ("n".equalsIgnoreCase(letra));
    }
}
   

        
        
