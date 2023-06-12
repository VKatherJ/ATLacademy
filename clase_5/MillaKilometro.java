package clase_5;

import java.util.Scanner;

public class MillaKilometro {
    public static void main(String[] args) {
        System.out.println("Ingrese una distancia en millas: ");
        Scanner pideMilla = new Scanner(System.in);
        double millas = pideMilla.nextDouble();
        double conversionKm = millas * 1.60934;
        System.out.println("La distnacia en kilomentros es de "+conversionKm);

    }

}
