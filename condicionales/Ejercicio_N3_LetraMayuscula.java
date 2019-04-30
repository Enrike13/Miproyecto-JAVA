/*Ejercicio N°3 - Bloque condicionales
Hacer un programa que lea un caracter por teclado y compruebe si es una
letra mayúscula.
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejercicio_N3_LetraMayuscula {

    public static void main(String[] args) {
        char letra;
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "Es una letra MAYUSCULA");
        } else {
            JOptionPane.showMessageDialog(null, "Es una letra minúscula");
        }
    }
    
}
