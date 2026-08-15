package entidades;

public class Animal {
	
	private String nome;
	private double comprimento;
	private int n_patas; //O Padrão é 4
	private String cor;
	private String ambiente;
	private double velocidade; //m/s
	
	public Animal(String nome, double comprimento, int n_patas, String cor, String ambiente, double velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.n_patas = n_patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public String getNome() {
		return nome;
	}

	public int getN_patas() {
		return n_patas;
	}

	public String getCor() {
		return cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public double getVelocidade() {
		return velocidade;
	}
	
	public String dados() {
        return "Animal: " + nome + "\n" +
               "Comprimento: " + (int)comprimento + " cm\n" +
               "Patas: " + n_patas + "\n" +
               "Cor: " + cor + "\n" +
               "Ambiente: " + ambiente + "\n" +
               "Velocidade: " + velocidade + " m/s";
	}			
}
