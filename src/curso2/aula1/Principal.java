package curso2.aula1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Kim", 14);
        Pessoa pessoa2 = new Pessoa("Lara", 15);
        Pessoa pessoa3 = new Pessoa("Henrique", 15);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista " + listaDePessoas.size());
        System.out.println("Primeira pessoa " + listaDePessoas.get(0));
        System.out.println("Lista de pessoas ");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
