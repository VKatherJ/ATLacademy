package clase_5;

import java.util.Scanner;

public class CalculaDescuento {
    public  static  void main (String[] args){
        System.out.println("Ingrese el precio original de su producto: ");
        Scanner pidePrecio = new Scanner(System.in);
        double totalCuenta = pidePrecio.nextDouble();

        System.out.println("Ingrese el  porcentaje de propina que desea dejar: ");
        Scanner pidePorcentaje = new Scanner(System.in);
        double porcentajePropina = pidePorcentaje.nextDouble();

        double monto= totalCuenta *(porcentajePropina / 100);
        System.out.println("El monto en sus propinas es de "+monto);
    }
}
