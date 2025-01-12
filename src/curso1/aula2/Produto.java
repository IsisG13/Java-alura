package curso1.aula2;

public class Produto {
    public static void main(String[] args) {
        double precoProduto = 30.53;
        int quantidade = 2;

        double total = precoProduto * quantidade;

        String mensagem = "O total é R$" + total;

        System.out.println(mensagem);
    }
}
