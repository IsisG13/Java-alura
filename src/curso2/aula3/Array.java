package curso2.aula3;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> listaDeString = new ArrayList<>();
        listaDeString.add("Gato");
        listaDeString.add("Cachorro");
        listaDeString.add("Peixe");

        for (String elemento : listaDeString) {
            System.out.println(elemento);
        }
    }
}
