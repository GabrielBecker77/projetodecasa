package aplicacao;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entidades.Funcionario;
import entidades.Cidade;
public class Programa {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
	//criando a lista de (objetos) funcionarios
	
		List<Funcionario> lista = new ArrayList<>();	
//interface de listas                       excutado via array
		
	//criando uma cidade e um funcionário, e adicionando a lista
	
		Cidade cdd1 = new Cidade(1,"SMO", "SC");
		Funcionario fun1 = new Funcionario("Gabriel", 1, cdd1, 10000);		
		lista.add(fun1);
	
		Cidade cdd2 = new Cidade(2, "CCO", "SC");
		Funcionario fun2 = new Funcionario("Estebam", 2, cdd2, 5000);
		lista.add(fun2);
		
		Cidade cdd3 = new Cidade(3, "TKY", "CNA");
		Funcionario fun3 = new Funcionario("Xin Zao", 3, cdd3, 5000);
		lista.add(fun3);
		
		Cidade cdd4 = new Cidade (4, "RJ", "RJ");
		Funcionario fun4 = new Funcionario("Stefani", 4, cdd4, 5000);
		lista.add(fun4);
		
		
		for (Funcionario f : lista) {
			System.out.print(f);
		}
	
	// encontrar um funcionario
		
		System.out.printf("%nInforme o código do funcionário: ");
		int cod = teclado.nextInt();
		Funcionario encontrado = null;
		
		
		for(Funcionario f : lista) {
			
			if (f.getCodigo() == cod) {
				encontrado = f;
			}
		}
		
	
		
		if (encontrado != null) {
			
			System.out.println("Qual o percentual de aumento salarial? sem '%' ");
			int percentual = teclado.nextInt();
		
			encontrado.aumentarSalario(percentual);	
			System.out.println(encontrado);
		} else {
			System.out.println("Código inválido.");
		}
		teclado.close();
		
		Funcionario fun5 = new Funcionario("Coringa", 5, cdd4, 3333);
		lista.add(3, fun5);	
		
		for(Funcionario f : lista) {
			System.out.printf("%s%n", f);
		}
	}

}
