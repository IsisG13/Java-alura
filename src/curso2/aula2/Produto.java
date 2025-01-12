package curso2.aula2;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

        @Override
        public String toString() {
            return "Nome do produto: " + nome + ", preço: " + preco + ", quantidade: " + quantidade;
        }

    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Celular", 250.0, 1);
        Produto produto2 = new Produto("Carregador", 30.0, 1);
        Produto produto3 = new Produto("Fone", 65.0, 1);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Primeiro produto " + listaDeProdutos.get(0).getNome());
        System.out.println("Todos os produtos");
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }
    }
}
