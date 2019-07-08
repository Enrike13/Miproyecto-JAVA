/*Ejercicio N°7 - Bloque condicionales
Pedir tres números y mostrarlos ordenados de mayor menor
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejercicio_N7_OrdenarNumeros {

    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2do número: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 3er número: "));
        
        if (num1 > num2 && num2 > num3) {
            JOptionPane.showMessageDialog(null, "El orden es: "+num1+" - "+num2+" - "+num3);
        } else if(num1>num3 && num3>num2 ){
            JOptionPane.showMessageDialog(null, "El orden es: "+num1+" - "+num3+" - "+num2);
        } else if(num2 > num1 && num1>num3){
            JOptionPane.showMessageDialog(null, "El orden es: "+num2+" - "+num1+" - "+num3);
        } else if(num2>num3 && num3>num1){
            JOptionPane.showMessageDialog(null, "El orden es: "+num2+" - "+num3+" - "+num1);
        } else if(num3>num1 && num1>num2){
            JOptionPane.showMessageDialog(null, "El orden es: "+num3+" - "+num1+" - "+num2);
        } else {
            JOptionPane.showMessageDialog(null, "El orden es: "+num3+" - "+num2+" - "+num1);
        }
    }
}
