
package condicionales;

import javax.swing.JOptionPane;

public class Ejemplo_N1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número 5 "));
        
        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "El numero es: "+dato);
        } else {
            JOptionPane.showMessageDialog(null, "El numero es diferente de "+dato);
        }
    }
    
}
