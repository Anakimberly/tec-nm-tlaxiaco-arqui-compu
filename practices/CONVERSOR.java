/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARQCOMP;
import java.util.Scanner;

public class CONVERSOR {

   
    public static int convertirABaseDecimal(String numero, int baseOrigen) {
        return Integer.parseInt(numero, baseOrigen);
    }

 
    public static String convertirDeDecimalABase(int numeroDecimal, int baseDestino) {
        return Integer.toString(numeroDecimal, baseDestino).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese el número a convertir: ");
        String numero = scanner.nextLine();
        System.out.print("Ingrese la base del número: ");
        int baseOrigen = scanner.nextInt();
        System.out.print("Ingrese la base a la que desea convertir el numero: ");
        int baseDestino = scanner.nextInt();

       
        int numeroDecimal = convertirABaseDecimal(numero, baseOrigen);

       
        String resultado = convertirDeDecimalABase(numeroDecimal, baseDestino);

     
        System.out.println("El número " + numero + " en base " + baseOrigen + " es " + resultado + " en base " + baseDestino);
    }
}

