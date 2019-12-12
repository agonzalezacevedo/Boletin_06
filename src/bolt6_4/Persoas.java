package bolt6_4;

import java.util.Scanner;

/**
 *
 * agonzalezacevedo
 */
public class Persoas {

    private String nome;
    private int peso;

    public Persoas() {
    }

    public Persoas(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void datos() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Cal é o nome?");
        this.nome = ler.nextLine();
        System.out.println("Cal é o peso?");
        this.peso = ler.nextInt();
    }
}
