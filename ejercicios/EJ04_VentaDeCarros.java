/* EJERCICIO N°4
Una compañia de venta de carros usados, paga a su personal de ventas un salario
de S/.1000 mensuales, mas una comision de S/.150 por carro vendido, más el 5%
del valor de la venta por carro. Cada mes el capturista de la empresa ingresa
en la computadora los datos pertinentes. hacer un programa que calcule e imprima
el salario mensual de un vendedor dado.
*/

package ejercicios;
import java.util.Scanner;

public class EJ04_VentaDeCarros {

    public static void main(String[] args) {
        
        double pagoPersonalVentas = 1000;
        Scanner cantidadCarrosVendidos = new Scanner(System.in);
        Scanner precioDeCarro = new Scanner(System.in);
        
        int numCarroVendidos;
        System.out.print("Ingrese la cantidad de carros vendidos: ");
        numCarroVendidos = cantidadCarrosVendidos.nextInt();
        
        double comision = 150 * numCarroVendidos; // por cada carro vendido
        
        double precioCarro;
        System.out.print("\nIngrese el precio del carro: ");
        precioCarro = precioDeCarro.nextDouble();
        
        double porcentajeVentaPorCarro = precioCarro * 0.05;
        double salarioVendedor;
        
        salarioVendedor = pagoPersonalVentas+comision+porcentajeVentaPorCarro;
        System.out.println("EL salario mensual  del vendedor es: "+salarioVendedor);
        
    }

}
