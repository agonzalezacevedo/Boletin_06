package bolt6_6;

/**
 *
 * agonzalezacevedo
 */
public class Calculo {

    private String nomeArt;
    private int numVend;

    public Calculo() {
    }

    public Calculo(String nomeArt, int numVend) {
        this.nomeArt = nomeArt;
        this.numVend = numVend;
    }

    public String getNomeArt() {
        return nomeArt;
    }

    public void setNomeArt(String nomeArt) {
        this.nomeArt = nomeArt;
    }

    public int getNumVend() {
        return numVend;
    }

    public void setNumVend(int numVend) {
        this.numVend = numVend;
    }

    public void calcularTipo() {

        if (numVend <= 100) {
            System.out.println("Bajo");
        }
        if (numVend > 100 && numVend <= 500) {
            System.out.println("Medio");
        }
        if (numVend > 500 && numVend <= 1000) {
            System.out.println("Alto");

        }
        if (numVend > 1000) {
            System.out.println("Primera necesidade");
        }

    }
}
