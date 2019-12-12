package bolt6_5;

import java.util.Scanner;

/**
 *
 * agonzalezacevedo
 */
public class Maior {

    public void calcular() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Dame 3 números: ");
        int num1 = ler.nextInt();
        int num2 = ler.nextInt();
        int num3 = ler.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " e maior que os demais");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " e maior que os demais");
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " e maior que os demais");
        }
    }

}
