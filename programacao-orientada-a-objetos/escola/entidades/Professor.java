package entidades;

public class Professor extends Pessoa {

	private double salario;

	public Professor(String nome, String cpf, String endereco, String email, String telefone, double salario) {
		super(nome, cpf, endereco, email, telefone);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public void mostraContato() {
		System.out.println("Nome do professor: " + getNome() + ", e-mail: " + getEmail() + ", Telefone: " + getTelefone());
	}		
	
}
