package clase_5;

import java.util.Scanner;

public class EdadPerro {

        public static void main(String[] args) {
            System.out.print("Ingrese su edad: ");
            Scanner pideEdadHumano = new Scanner(System.in);
            Integer edadPerro= 7;
            Integer edad = pideEdadHumano.nextInt();
            Integer calculaEdad = edad*edadPerro;
            System.out.println("Su edad "+edad+ " humana equivale a "+calculaEdad+ " en edad perruna.");


        }

}
