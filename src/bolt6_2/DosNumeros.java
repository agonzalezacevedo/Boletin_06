package bolt6_2;

import java.util.Scanner;

/**
 *
 * agonzalezacevedo
 */
public class DosNumeros {

    public void amosar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Inserta el primer número");
        short num1 = ler.nextShort();
        System.out.println("Inserta el segundo número");
        short num2 = ler.nextShort();
        if (num1 >= num2) {
            System.out.println("El primer numero menos el segundo da " + (num1 - num2));
        } else {
            System.out.println("El primer numero más el segundo da " + (num1 + num2));
        }
    }
}
