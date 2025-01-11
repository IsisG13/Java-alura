package aula3;

import java.util.Scanner;

public class Numero2 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um numero");
        n1 = numero.nextInt();

        System.out.println("Digite outro numero");
        n2 = numero.nextInt();

        if (n1 == n2) {
            System.out.println("Os numeros são iguais! O primeiro número foi " + n1 + " e o segundo numero foi " + n2);
        } else if (n1 > n2) {
            System.out.println("O primeiro numero (" + n1 + ") é maior que o segundo numero (" + n2 + ")");
        } else {
            System.out.println("O primeiro numero (" + n1 + ") é menor que o segundo numero (" + n2 + ")");
        }
    }
}
