/* EJERCICIO N°3
Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan
tiene la mitad de lo que posee Luis y Guillermo juntos. hacer un programa que
calcule e imprima la cantidad de dinero entre los tres.
*/
package ejercicios;
import java.util.Scanner;

public class CantidadDinero {

    public static void main(String[] args) {
        float guillermo, luis, juan, totalEntreLos3;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Indique cuantos dinero tiene Guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2;
        juan = (luis + guillermo)/2;
        totalEntreLos3 = luis + guillermo + juan;
        System.out.println("El total de dinero entre los tres es: "+ totalEntreLos3);
        
    }
    
}
