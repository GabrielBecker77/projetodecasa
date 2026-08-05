package entidade;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura) {
		
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}
	
	@Override
    public int compareTo(Pessoa p) {
        return this.nome.compareTo(p.nome);
    }
	
	@Override
    public String toString() {
        return "Nome: " + nome +
               " | Idade: " + idade +
               " | Altura: " + String.format("%.2f", altura);
    }
}
