package entidades;

public class Aluno extends Pessoa {
	
	private double mediaGeral;
	private String situacao; // Ativo, Trancamento, Desistente, Formado

	public Aluno(String nome, String cpf, String endereco, String email, String telefone, double mediaGeral, String situacao) {
		super(nome, cpf, endereco, email, telefone);
		this.mediaGeral = mediaGeral;
		this.situacao = situacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public double getMediaGeral() {
		return mediaGeral;
	}

	@Override
	public void mostraContato() {
		System.out.println("Nome do aluno: " + getNome() + ", e-mail: " + getEmail() + ", Telefone: " + getTelefone());
	}

}
