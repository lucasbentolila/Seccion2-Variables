/*Detalle de la factura
La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura,
se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.

        Por ejemplo, el resultado podría ser algo así:
La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioDetalleDeFactura {
    public static void main(String[] args) {

        // Creamos el objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos el nombre o descripción de la factura
        System.out.println("Hola bienvenido, ingrese el nombre o descripción de la factura: ");
        String nombreFactura = scanner.nextLine();

        // Declaramos las variables donde guardamos los precios
        double precio1 = 0;
        double precio2 = 0;

        // Bloque try-catch para controlar si el usuario ingresa datos no númericos
        try {
            System.out.println("Ingrese el precio del primer producto");
            precio1 = scanner.nextDouble();

            System.out.println("Ingrese el precio del segundo producto");
            precio2 = scanner.nextDouble();

        } catch (InputMismatchException e) {
            // Si el usuario ingresa algo que no sea número, mostramos mensaje de error
            System.out.println("Dato ingresado no valido, por favor ingrese datos nuevamente");
            return; // terminamos el programa para evitar errores
        }

        // Calculamos el total bruto (suma de los dos precios)
        double totalBruto = precio1 + precio2;

        // Calculamos el impuesto del 19%
        double impuesto = totalBruto * 0.19;

        // Calculamos el total neto (suma del total bruto + impuesto)
        double totalNeto = totalBruto + impuesto;

        // Creamos un String para mostrar toda la información de forma clara, con catenaciones
        String notificacion = "La factura " + nombreFactura + " tiene un total bruto de " + totalBruto + ", con un impuesto de " + impuesto +
                " y el monto despues del impuesto es de " + totalNeto;

        //Mostramos el resultado final
        System.out.println(notificacion);

        scanner.close(); // Cerramos el scanner para liberar recursos

    }
}