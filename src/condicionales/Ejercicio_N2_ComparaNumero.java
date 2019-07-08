/*Ejercicio N°1 - Bloque condicionales
Pedir 2 números y decir cual es el mayor o si son iguales
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejercicio_N2_ComparaNumero {

    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer número:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo número:"));
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "El Primer número: "+numero1+" es el mayor");
        }else if(numero1 == numero2){
            JOptionPane.showMessageDialog(null, "Los números son iguales");
        }else {
            JOptionPane.showMessageDialog(null, "El Segundo número: "+numero2+" es el mayor");
        }
    }
    
}
