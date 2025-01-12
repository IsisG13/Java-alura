package curso2.aula3;

import java.util.ArrayList;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Preço: " + preco;
    }

    public static void main(String[] args) {
        double soma = 0;

        ArrayList<Produto> listaDeProduto = new ArrayList<>();
        Produto produto1 = new Produto("Celular", 250.0);
        Produto produto2 = new Produto("Fone", 30.0);
        Produto produto3 = new Produto("Capa", 20.0);

        listaDeProduto.add(produto1);
        listaDeProduto.add(produto2);
        listaDeProduto.add(produto3);

        System.out.println(listaDeProduto.size());
        for (Produto produto : listaDeProduto) {
            System.out.println(produto);
        }

        for (Produto produto : listaDeProduto) {
            soma += produto.getPreco();
        }

        double media = soma / listaDeProduto.size();
        System.out.println("Preço médio dos produtos: " + media);
    }
}
