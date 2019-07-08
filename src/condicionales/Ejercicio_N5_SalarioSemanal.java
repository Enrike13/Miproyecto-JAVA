/*Ejercicio N°5 - Bloque condicionales
Un obrero necesita calcular su salario semanal, el cual se obtiene de la
siguiente manera:
- Si trabaja 40Hs o menos se le paga S/.16 por hora
- Si trabaja mas de 40Hs de le paga S/. 16 por cada una de las primeras
40Hs y 20 por cada hora extra.
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejercicio_N5_SalarioSemanal {

    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioSemanal;
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas: "));
        if(horasTrabajadas <= 40){
            salarioSemanal = 16 * horasTrabajadas;
        }else{
            salarioSemanal = (16 * 40) + ((horasTrabajadas-40)*20);
        }
        JOptionPane.showMessageDialog(null, "El salario semanal es: "+salarioSemanal);
        
    }
    
}
