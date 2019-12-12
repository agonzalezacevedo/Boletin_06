package bolt6_4;

/**
 *
 * @author agonzalezacevedo
 */
public class Bolt6_4 {

    public static void main(String[] args) {
        Persoas per1 = new Persoas();
        per1.datos();
        Persoas per2 = new Persoas();
        per2.datos();
        if (per1.getPeso() > per2.getPeso()) {
            System.out.println(per1.getNome() + " ten maior peso");
            System.out.println("A diferenza de peso é " + (per1.getPeso() - per2.getPeso()) + "kg.");
        } else {
            System.out.println(per2.getNome() + " ten maior peso");
            System.out.println("A diferenza de peso é " + (per2.getPeso() - per1.getPeso()) + "kg.");
        }

    }

}
