package entidades;

public class Funcionario {
	
	private int codigo;
	private String nome;
	private Cidade cidade;
	private double salario;
	
	public Funcionario(String nome, int codigo, Cidade cidade, double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
		this.salario = salario;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
	
	
	public void aumentarSalario(int percentual) {
		this.salario += salario * percentual / 100;
	}

	@Override
	public String toString() {
		return String.format(
				"%nFuncionário: %s / Código: %d / Cidade: %s / Salário: %.2f%n"
				,nome, codigo, cidade, salario
				);
	}
}
