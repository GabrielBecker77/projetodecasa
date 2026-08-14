/*Construa um projeto chamado AulaDatas, uma classe chamada Principal, dentro um método main e um método estático calcularIdade 
 * com a seguinte assinatura.

public static void calcularIdade(int dia, int mes, int ano)

O método deve receber a data de nascimento de uma pessoa e calcular sua idade atual.
Requisitos:
•	Exibir a idade em anos, meses e dias
•	Validar se a data informada é válida
•	Considerar corretamente meses com diferentes quantidades de dias
•	Utilizar as classes estudadas em aula
*/
import java.time.LocalDate;
import java.time.Period;

public class Principal {
	public static void main (String [] args) {
		
		calcularIdade(1, 02, 1998);
	}
	
	public static void calcularIdade(int dia, int mes, int ano) {
		
		if (mes < 1 || mes > 12) {
			System.out.println("Data inválida!");
			return;
		}
		
		int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			diasMes[1] = 29;
		}
		
		if (dia < 1 || dia > diasMes[mes - 1]) {
			System.out.println("Data inválida!");
			return;
		}
		
		LocalDate hoje = LocalDate.now();
		LocalDate nascimento = LocalDate.of(ano, mes, dia);
		
		
		if (nascimento.isAfter(hoje)) {
			System.out.println("Data de nascimento inválida (no futuro).");
			return;
		}
		
		Period idade = Period.between(nascimento, hoje);
		
		System.out.println("Idade: " 
				+ idade.getYears() + " ano(s), "
				+ idade.getMonths() + " mês(es) e "
				+ idade.getDays() + " dia(s).");
		
	}
	

}