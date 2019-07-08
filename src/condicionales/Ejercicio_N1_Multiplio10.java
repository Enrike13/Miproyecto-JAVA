/*Ejercicio N°1 - Bloque condicionales
Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejercicio_N1_Multiplio10 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        if (numero%10 == 0) {
            JOptionPane.showMessageDialog(null, "El número "+numero+ " es múltiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "El número no es múltiplo de 10");
        }
    }
    
}
