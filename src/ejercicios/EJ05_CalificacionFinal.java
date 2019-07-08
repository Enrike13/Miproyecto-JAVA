/*EJERCICIO N° 5
La calificacion final de un estudiante de informática se calcula con base a las calificaciones de
cuatro aspectos de su rendimiento académico: participacion, primer examen parcial, segundo examen parcial
y examen final. Sabiendo que las calificaciones entran a la calificacion final con ponderaciones del
10%, 25%, 25% y 40%, hacer un programa que calcule e imprima la calificación final obtenida por un estudiante
*/
package ejercicios;

import java.util.Scanner;

public class EJ05_CalificacionFinal {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
        
        System.out.print("Nota de participacion: ");
        participacion = entrada.nextFloat();
        System.out.print("Nota 1er examen parcial: ");
        primerExamen = entrada.nextFloat();
        System.out.print("Nota 2do examen parcial: ");
        segundoExamen = entrada.nextFloat();
        System.out.print("Digite la nota del examen fiinal: ");
        examenFinal = entrada.nextFloat();
        
        participacion *= 0.10f;
        primerExamen *= 0.24f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;
        
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        
        System.out.println("\nLA nota final es: " + notaFinal);
    }
    
}
