package clase_5;

import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args){
        Scanner numeroIngresado = new Scanner(System.in);
        double numero = numeroIngresado.nextDouble();
        double aleatorio = Math.random();
        if(numero==aleatorio){
            System.out.println("Acertaste tu numero es igual "+numero+" al de la computadora"+aleatorio);
        }else {
            System.out.println("lo siento tu numero NO es igual "+numero+" al de la computadora"+aleatorio);
        }
    }
}

