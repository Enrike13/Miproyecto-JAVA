/* EJERCICIO N°1
Hacer un programa que calcule e imprima la suma de tres calificaciones
*/
package ejercicios;

import java.util.Scanner;

public class SumaNotas {
    public static void main(String[] args) {
        float nota1, nota2, nota3, suma, prom;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite 3 calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma = nota1+nota2+nota3;
        prom = suma/3;
        System.out.println("\nLa suma de notas es: "+suma);
        System.out.println("El promedio es: "+prom);
    }
}
