/*
15. Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el
exponente introducido. No se deben utilizar funciones de exponenciación. Por ejemplo, si
introducimos el 2 y el 5, se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5 (Ver Ejercicio en hoja)
*/

package ejercicios1;
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int exponenteFinal, exponente;
        double base, potencia;        
        
        System.out.println("Introduce una base");
        base=teclado.nextDouble();
        System.out.println("Introduce un exponente");
        exponenteFinal=teclado.nextInt();
        
        for(int i=1;i<=exponenteFinal;i++){
            potencia=1;
            exponente=i;
            
            for(int j=1;j<=exponente;j++){
                potencia=potencia+base;
            } 
            System.out.println(base+"^"+i+" = "+potencia);
        }
 
    }    
}
