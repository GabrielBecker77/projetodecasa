package entidades;

public class Peixe extends Animal {

	private String caracteristicas; 

	public Peixe(String nome, double comprimento, double velocidade) {
		super(nome, comprimento, 0, "Cinza", "Mar", velocidade);
		this.caracteristicas = "Barbatana e cauda";
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}


	public String dados() {
        return super.dados() + "\n" +
               "Característica: " + caracteristicas;
    }	
}
