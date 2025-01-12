package curso2.desafio;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double limite = 0;
        double valor = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite do cartão");
        limite = scanner.nextDouble();
        System.out.println("** O limite do cartão é: " + limite + " ** \n");

        Cartao cartao = new Cartao(limite);

        int sair = 1;
        while (sair != 0){
            System.out.println("Digite o nome do produto para comprar:");
            String produto = scanner.next();

            System.out.println("Digite o valor da compra:");
            valor = scanner.nextDouble();
            System.out.println("\n");

            Compra compra = new Compra(produto, valor);

            if (cartao.lancaCompra(compra)) {
                System.out.println("""
                        *********************************
                        COMPRA REALIZADA COM SUCESSO!\n
                         *** Sobre a compra: *** """);
                System.out.println(" - Nome do produto: " + produto);
                System.out.println(" - Valor do produto: " + valor);
                System.out.println(" - Saldo disponivel: " + cartao.getSaldo());
                System.out.println("*********************************\n");

                System.out.println("Deseja cotinuar comprando? (Digite 1 para continuar ou 0 para sair)");
                sair = scanner.nextInt();
                System.out.println("\n");
            } else {
                System.out.println("Não há saldo suficiente");
                sair = 0;
            }

            if (sair == 0) {
                Collections.sort(cartao.getCompras());
                System.out.println("""
                        *********************************
                        LISTA DO QUE FOI COMPRADO""");
                for (Compra c : cartao.getCompras()){
                    System.out.println(" - Produto: " + c.getDescricao() + " | Preço: " + c.getValor());
                }
                System.out.println("Saldo final: " + cartao.getSaldo());
                System.out.println("*********************************");
                sair = 0;
            }
        }
    }
}
