/*Construir um programa para mostrar a data do sistema escrita por extenso usando as classes discutidas 
e testando as demais formas, como por exemplo: 
Hoje é quinta-feira, dia 19 de março de 2026 e agora são 20 horas e 32 minutos.
Deve ser construída uma classe e um método para retornar a data nesse formato.
*/
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Atividade {
	public static void main (String [] args){
		
		System.out.println(mostrarData());	
	}	
	
	public static String mostrarData (){
		Date hoje = new Date();
		SimpleDateFormat data = new SimpleDateFormat(
				"EEEE, 'dia' d 'de' MMMM 'de' yyyy 'e agora são' HH 'horas e' mm 'minutos.'",
				new Locale("pt", "BR")
				);
		return "Hoje é " + data.format(hoje);
	}
		
}