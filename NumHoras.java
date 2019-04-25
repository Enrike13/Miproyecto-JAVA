/*EJERCICIO N°7
Construir un programa que, dado el número total de horas, devuelve el número de
semanas, días y horas equivalentes. Por ejemplo, dado un total de 1000 horas
debe mostrar 5 semanas, 6 días y 16 horas.
 */
package ejercicios;

import java.util.Scanner;

public class NumHoras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasTotales, semanas, dias, horas;
        
        System.out.print("Digite el número de horas: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales /(24 * 7);
        dias = horasTotales%168 / 24;    //168 horas a la semana
        horas = horasTotales%24;
        
        System.out.println("\nEL EQUIVALENTE ES: ");
        System.out.println("Semanas: "+semanas);
        System.out.println("Días: "+dias);
        System.out.println("Horas: "+horas);
        
    }
    
}
