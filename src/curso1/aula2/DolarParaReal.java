package curso1.aula2;

public class DolarParaReal {
    public static void main(String[] args) {
        double valorEmDolares = 50.30;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("O valor em reais é: " + valorEmReais);
    }
}
