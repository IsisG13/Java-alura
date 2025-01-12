package curso2.aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumerosInteiros {
    Integer numero;

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(3);
        numeros.add(59);
        numeros.add(6);

        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
    }
}
