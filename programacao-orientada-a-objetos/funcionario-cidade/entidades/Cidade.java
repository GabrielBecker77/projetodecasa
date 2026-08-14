package entidades;

public class Cidade {
	
	private int codigo;
	private String nomeCidade;
	private String estado;
	
	public Cidade(int codigo, String nomeCidade, String estado) {
		super();
		this.codigo = codigo;
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public String getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return String.format(
				"Cidade: %s-%s(Código: %d)",
				nomeCidade, estado, codigo
				);			
	}

}
