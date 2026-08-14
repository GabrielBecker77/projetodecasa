package entidades;

public class Produto {


    private String nome;
    private double preco;
    private int qtd;

    public Produto(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 0);
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

    public int getQtd() {
        return qtd;
    }

    public double valorEstoque() {
        return preco * qtd;
    }

    public void acrescentarProdutos(int quantidade) {
        this.qtd += quantidade;
    }

    public void retirarProdutos(int quantidade) {
        if (this.qtd >= quantidade) {
            this.qtd -= quantidade;
        } else {
            System.out.println("Não foi possível retirar: quantidade insuficiente em estoque.");
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nome 
            + ", Preço: R$ " + String.format("%.2f", preco) 
            + ", Quantidade: " + qtd 
            + " unidades, Total em Estoque: R$ " + String.format("%.2f", valorEstoque());
    }
}