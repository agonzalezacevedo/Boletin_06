package bolt6_1;

import java.util.Scanner;

/**
 *
 * agonzalezacevedo
 */
public class Positivo {

    public void numeroP() {
        System.out.println("Inserte un numero positivo.");
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        if (numero >= 0) {
            System.out.println(numero + " e positivo");
        }
    }
}
