package entidades;

public class Viagem {
	
	private int codigo;
	private String destino;
	private double distancia;
	private double tempo;
	
	public Viagem (int codigo, String destino, double distancia, double tempo) {
		this.codigo = codigo;
		this.destino = destino;
		this.distancia = distancia;
		this.tempo = tempo;
	}
	
	public double getDistancia() {
		return distancia;
	}

	public double getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
	    return String.format(
	        "Código: %d | Destino: %s | Distância: %.2f km | Tempo: %.2f h",
	        codigo, destino, distancia, tempo
	    );
	}
}
