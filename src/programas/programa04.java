
package programas;
//paquete de datos
import java.util.Scanner;
public class programa04 {
    public static void main(String[] args) {
    //declarar variables
    double angulo, radianes;
Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el ángulo en grados
        System.out.print("Ingrese el ángulo en grados: ");
        double anguloGrados = scanner.nextDouble();

        // Convertir el ángulo a radianes
        double anguloRadianes = Math.toRadians(anguloGrados);

        // Calcular el seno y coseno en radianes
        double seno = Math.sin(anguloRadianes);
        double coseno = Math.cos(anguloRadianes);

        // Mostrar los resultados
        System.out.println("El seno de " + anguloGrados + " grados es: " + seno);
        System.out.println("El coseno de " + anguloGrados + " grados es: " + coseno);
    }
}