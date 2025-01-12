package curso2.aula3;

import java.util.ArrayList;

public class Cachorro extends Animal{
    String raca;

    public Cachorro(String nome, String dono, String raca) {
        super(nome, dono);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Nome do cachorro: " + nome + " | Raça: " + raca + " | Dono: " + dono;
    }

    public static void main(String[] args) {
        ArrayList<Cachorro> listaDeCachorros = new ArrayList<>();
        Cachorro cachorro1 = new Cachorro("Maya", "Julia", "Poodle");
        Cachorro cachorro2 = new Cachorro("Thor", "Luiz", "PitBull");
        Cachorro cachorro3 = new Cachorro("Ivvy", "Margot", "Golden Retriever");

        listaDeCachorros.add(cachorro1);
        listaDeCachorros.add(cachorro2);
        listaDeCachorros.add(cachorro3);

        System.out.println("Tamanho da lista: " + listaDeCachorros.size());
        for (Cachorro cachorro : listaDeCachorros) {
            System.out.println(cachorro);
        }
    }
}
