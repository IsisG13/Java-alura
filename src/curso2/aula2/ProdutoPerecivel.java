package curso2.aula2;

public class ProdutoPerecivel extends Produto{
    String dataValidade;

    public ProdutoPerecivel(String nome, Double preco, Integer quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Nome do produto " + getNome() + " | preço " + getPreco() + " | quantidade " + getQuantidade() + " | validade " + dataValidade;
    }

    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Coca", 10.50, 4, "2025-12-31");
        System.out.println(produtoPerecivel);
    }
}
