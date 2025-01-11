package aula3;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int numeroEscolhido = 0;
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um numero");
        numeroEscolhido = numero.nextInt();

        System.out.println("O numero escolhido foi " + numeroEscolhido);

        if (numeroEscolhido >= 0) {
            System.out.println("O numero que você escolheu (" + numeroEscolhido + ") é positivo");
        } else {
            System.out.println("O numero que você escolheu (" + numeroEscolhido + ") é negativo");
        }
    }
}
