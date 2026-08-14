package entidades;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	
	public Pessoa(String nome, String cpf, String endereco, String email, String telefone) {
	
		this.nome = nome;
		this.cpf= cpf;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void mostraContato() {
	    System.out.println("Nome: " + nome + ", e-mail: " + email + ", Telefone: " + telefone);
	}
}
