/* EJERCICIO N°2
Hacer un programa que calcule e imprima el salario semanal de un empleado a partir
de sus horas semanales trabajadas y de su salario por hora
*/
package ejercicios;

public class EJ02_SalarioSeanal {
    public static void main(String[] args) {
        double horaSemanal, salarioXHora, salarioSemanal;
        
        horaSemanal = 12 * 6;
        salarioXHora = 3.50;
        
        salarioSemanal = horaSemanal*salarioXHora;
        
        System.out.println("N° de horas por semana: "+horaSemanal);
        System.out.println("Salario por hora: "+salarioXHora);
        System.out.println("Sueldo semanal: "+salarioSemanal);
    }
}
