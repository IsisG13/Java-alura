package aula3;

import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int numero = 0;

        Scanner ler = new Scanner(System.in);

        while (tentativas <= 5) {
            System.out.println("Digite um numero de 0 a 100");
            numero = ler.nextInt();
            tentativas++;
        }

        if (numeroAleatorio == numero) {
            System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
        } else if (numero < numeroAleatorio) {
            System.out.println("O seu numero é menor que o gerado");
        } else {
            System.out.println("O seu numeo é maior que o gerado");
        }

        if (tentativas == 5 && numero != numeroAleatorio) {
            System.out.println("Você passou os limites de tentativas!");
        }
    }
}
