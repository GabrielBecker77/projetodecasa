package entidades;

public class Mamifero extends Animal {
	
	private String alimento;
	
	public Mamifero(String nome, double comprimento, int n_patas, String cor, String ambiente, double velocidade, String alimento) {
		super(nome, comprimento, n_patas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}

	public Mamifero (String nome, double comprimento, double velocidade, String alimento) {
		super(nome, comprimento, 4, "Castanho", "Terra", velocidade);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}
	
	@Override
	public String dados() {
		return super.dados() + "\n" +
			"Alimento: " + alimento;		
	}
}
