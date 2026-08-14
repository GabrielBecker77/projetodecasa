package entidades;

public class Motorista {

	private int codigo;
	private String nome;
	private Viagem[] viagens;
	
	public Motorista(int codigo, String nome, int qtdViagens) {
		this.codigo = codigo;
		this.nome = nome;
		this.viagens = new Viagem[qtdViagens];
	}
	
	public int getCodigo() { 
        return codigo;
    }
	
	public String getNome() {
		return nome;
	}
	
	public Viagem[] getViagens() {
		return viagens;
	}
	
	public double calcularDistanciaTotal() {
		double soma = 0;
		for (int i = 0; i < viagens.length; i++) {
			soma += viagens[i].getDistancia();
		}
		return soma;
	}
	
	public double calcularTempoTotal() {
		double soma = 0;
		for (int i = 0; i <viagens.length; i++) {
			soma += viagens[i].getTempo();
		}
		return soma;		
	}
	
	@Override
    public String toString() {
        return "Motorista\ncodigo:" + codigo + ", nome:" + nome;
	
}
}