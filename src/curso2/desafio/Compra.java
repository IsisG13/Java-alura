package curso2.desafio;

public class Compra implements Comparable<Compra>{
    private String produto;
    private double valor;

    public Compra(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }
    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return produto;
    }

    @Override
    public String toString() {
        return "Compra: produto='" + produto +" | valor=" + valor;
    }

    @Override
    public int compareTo(Compra other) {
        return Double.compare(this.valor, other.valor);
    }
}
