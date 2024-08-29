package programas;
//paquete de datos
import java.util.Scanner;
public class programa02 {
    public static void main(String[] args) {
    //declarar variables
    double radio, acirculo;
    Scanner lectura=new Scanner(System.in);
    //entrada de datos
    System.out.print("ingresar radio:");
    radio=lectura.nextDouble();
    //proceso de datos
    acirculo=Math.PI* Math.pow(radio, 2);
    //salida de datos
    System.out.println("Los resultados son");
    System.out.println("El area del circulo es:"+acirculo);   
   }
}