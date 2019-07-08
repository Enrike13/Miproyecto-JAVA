/*Ejercicio N°4 - Bloque condicionales
En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere
los S/.300 ¿Cuál será la cantidad que ppagará una persona por su compra?
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejercicio_N4_CantidadAPagar {

    public static void main(String[] args) {
        float descuento, compra, total;
     
        compra = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto de su compra."));
        
        if (compra > 300) {
            descuento = compra * 0.20f;
            total = compra - descuento;
            JOptionPane.showMessageDialog(null, "Tiene un descuento de: S/."+descuento+"\nTotal a pagar: S/."+total);
        } else {
            JOptionPane.showMessageDialog(null, "No tiene descuento, Total a pagar: S/."+compra);
        }
 
    }
    
}
