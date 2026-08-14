package entidades;

public class Jogo {

    private int codigo;
    private String nome;
    private double preco;
    private Categoria categoria;

    public Jogo(int codigo, String nome, double preco, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void aplicarDesconto(double percentual) {
        preco -= preco * percentual / 100.0;
    }

    @Override
    public String toString() {
        return String.format(
            "Código: %d | Nome: %s | Preço: %.2f | Categoria: %s",
            codigo, nome, preco, categoria
        );
    }
}