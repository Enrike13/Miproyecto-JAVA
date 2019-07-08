/*Ejercicio N°6 - Bloque condicionales
Hacer un programa que tome 2 números y diga si ambos son pares o impares
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejercicio_N6_CalculoNPar {

    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2er número: "));
        if (num1%2 == 0 && num2%2 == 0) {
            JOptionPane.showMessageDialog(null, "Los números son pares");
        } else {
            JOptionPane.showMessageDialog(null, "Los números son impares.!!");
        }
    }
    
}
