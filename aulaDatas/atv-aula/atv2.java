/*atividade 2*/
import java.time.LocalDate;
import java.time.Period;

public class ativ2 {
	public static void main(String[] args) {
		contaTempo(04, 01, 2027);
	}
	private static void contaTempo(int dia, int mes, int ano) {
		// Data atual
	    LocalDate hoje = LocalDate.now();
	    
	    // Data informada
	    LocalDate dataFutura = LocalDate.of(ano, mes, dia);
	    
	    // Calcula a diferença
	    Period periodo = Period.between(hoje, dataFutura);
	    
	    int anos = periodo.getYears();
	    int meses = periodo.getMonths();
	    int dias = periodo.getDays();
	    
	    System.out.println("Faltam " + anos + " ano(s), " 
	            + meses + " mês(es) e " 
	            + dias + " dia(s) para essa data em " + ano + ".");
	}

}