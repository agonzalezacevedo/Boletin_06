package bolt6_7;

import java.util.Scanner;

/**
 *
 * agonzalezacevedo
 */
public class Calculo {

    Scanner teclado = new Scanner(System.in);

    public void perCuadrado() {
        System.out.println("Cual es el tamaño del lado?");
        float lado = teclado.nextFloat();
        float perimetro = lado * lado;
        System.out.println("El perímetro del cadrado es " + perimetro);
    }

    public void perTriangulo() {
        System.out.println("Cual es el tamaño de la base?");
        float base = teclado.nextFloat();
        System.out.println("Y la altura altura?");
        float altura = teclado.nextFloat();
        float perimetro = base * altura / 2;
        System.out.println("El perímetro del triángulo es " + perimetro);
    }

    public void perCirculo() {
        System.out.println("Cual es el tamaño del radio?");
        float radio = teclado.nextFloat();
        float perimetro = (float) Math.PI * ((float) Math.pow(radio, 2));
        System.out.println("El perímetro del cículo es " + perimetro);
    }

    public void calcular() {
        System.out.println("Cuales de los perimetros quieres calcular? \n1.-Cuadrado.\n2.-Triángulo.\n3.-Círculo.");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                if (opcion == 1) {
                    perCuadrado();
                    break;
                }
            case 2:
                if (opcion == 2) {
                    perTriangulo();
                    break;
                }
            case 3:
                if (opcion == 3) {
                    perCirculo();
                    break;
                }
            default:
                System.out.println("Esa opción no esta disponible");
        }

    }

}
