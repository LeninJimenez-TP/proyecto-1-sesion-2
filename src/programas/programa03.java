
package programas;
import java.util.Scanner;
import java.lang.Math;
public class programa03 {
public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = datos.nextLine();

        System.out.print("Ingrese la cantidad a solicitar: S/ ");
        double prestamo = datos.nextDouble();

        System.out.print("Tiempo del préstamo (en años): ");
        double tiempo = datos.nextDouble();

        // Tasa de interés anual (ajusta este valor según sea necesario)
        double tasa = 0.10; // 10% de interés anual

        // Calcular el interés compuesto
        double interes = prestamo * Math.pow(1 + tasa, tiempo) - prestamo;

        // Calcular el monto total a pagar
        double montoTotal = prestamo + interes;

        // Mostrar los resultados
        System.out.println("\nResumen del préstamo para " + nombre + ":");
        System.out.println("Cantidad solicitada: S/ " + prestamo);
        System.out.println("Tasa de interés anual: " + tasa * 100 + "%");
        System.out.println("Tiempo del préstamo: " + tiempo + " años");
        System.out.println("Interés compuesto a pagar: S/ " + interes);
        System.out.println("Monto total a pagar: S/" + montoTotal);
         }
 } 