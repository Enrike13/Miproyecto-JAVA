/*EJERCICIO N°8
Construir un programa que calcule y muestre por pantalla las raíces de la
ecuacion de segundo grado de coeficcientes reales.
ax^2 + bx + c = 0
X = (-b ± √(b^2 - 4ac))/2a
 */
package ejercicios;

import java.util.Scanner;

public class EJ08_RaizDeEcuacion {

    public static void main(String[] args) {
        float a,b,c,paso1,paso2,paso3,x1,x2;       // Defino el tipo de varible 
        Scanner entrada = new Scanner(System.in);
     //Datos de entrada
     //Pido los valores de a,b y c al usuario
        System.out.print("Ingrese valor de a: ");
        a=entrada.nextFloat();
        System.out.print("Ingrese valor de b: ");
        b=entrada.nextFloat();
        System.out.print("Ingrese valor de c: ");
        c=entrada.nextFloat();
        
     //Proceso
        paso1=(-1)*b;    // -b
        paso2=(b*b)-(4*a*c);   // b^2-4*a*c
        float raiz =(float)Math.sqrt(paso2); // √(paso2)
        paso3=2*a;    // 2.a 
        x1=(paso1+raiz)/paso3;
        x2=(paso1-raiz)/paso3;
        
    //Mostramos los valores de x1 y x2 por  pantalla
        System.out.println("Valor de X1: "+x1);
        System.out.println("Valor de X2: "+x2);
    }
    
}
