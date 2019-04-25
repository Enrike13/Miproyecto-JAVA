/*EJERCICO N°6
Hacer un programa que calcule el cuadrado de una suma
(a+b)^2 = a^2+b^2+2ab
*/
package ejercicios;

import java.util.Scanner;

public class CalculoCuadrado {

    public static void main(String[] args) {
        double a, b, resultado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        a = entrada.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        b = entrada.nextFloat();
        
        resultado = Math.pow((a + b), 2);
        System.out.println("El resultado es: " + resultado);
    }
    
}
