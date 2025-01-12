package curso1.Desafio;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        int opcao = 0;
        double receber;
        double transferir;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite o tipo da sua conta");
        String conta = scanner.nextLine();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextInt();

        System.out.println("""
                ************************************
                Dados iniciais do cliente
                """);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + conta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("************************************");

        while (opcao != 4) {
            System.out.println("Operações");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é R$ " + saldo);

            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber");
                receber = scanner.nextInt();
                System.out.println("Saldo atualizado " + (saldo + receber));

            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir");
                transferir = scanner.nextInt();
                if (transferir > saldo) {
                    System.out.println("Não há saldo suficiente para essa transferencia");
                }  else {
                    System.out.println("Saldo atualizado " + (saldo - transferir));
                }
            } else if (opcao != 4) {
                System.out.println("Opção invalida");
            }
        }
    }
}
