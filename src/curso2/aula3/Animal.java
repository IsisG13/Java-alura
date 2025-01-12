package curso2.aula3;

import java.util.ArrayList;

public class Animal {
    String nome;
    String dono;

    public Animal(String nome, String dono) {
        this.nome = nome;
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Nome do animal: " + nome + " | Dono: " + dono;
    }

    public static void main(String[] args) {
        ArrayList<Animal> listaDeAnimais = new ArrayList<>();
        Animal animal1 = new Animal("Myaa", "Julia");
        Animal animal2 = new Animal("Thor", "Luiz");
        Animal animal3 = new Animal("Ivvy", "Margot");

        listaDeAnimais.add(animal1);
        listaDeAnimais.add(animal2);
        listaDeAnimais.add(animal3);

        System.out.println("Tamanho da lista: " + listaDeAnimais.size());
        for (Animal animal : listaDeAnimais) {
            System.out.println(animal);
        }
    }
}
