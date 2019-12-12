package bolt6_3;

import java.util.Scanner;

/**
 *
 * agonzalezacevedo
 */
public class Valor {

    public void amosar() {
        System.out.println("Inserta un numero");
        Scanner ls = new Scanner(System.in);
        int num = ls.nextInt();
        if (num > 0) {
            System.out.println("+");
        } else if (num < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }
    }
}
