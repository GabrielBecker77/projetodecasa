package aplicacao;

import entidades.Pessoa;
import entidades.Professor;
import entidades.Aluno;

public class Programa {
	public static void main(String [] args) {
		
		
		        Pessoa maria = new Pessoa("Maria", "111.111.111-11", "Rua A", "pessoa@email.com.br", "1111-1111");
		        Professor pedro = new Professor("Pedro", "222.222.222-22", "Rua B", "professor@email.com.br", "3333-33333", 4500.00);
		        Aluno joao = new Aluno("João", "333.333.333-33", "Rua C", "aluno@email.com.br", "2222-2222", 8.5, "Ativo");

		    
		        maria.mostraContato();
		        pedro.mostraContato();
		        joao.mostraContato();
	  }
}