package aplicacao;

import entidade.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;


public class Principal {
	public static void main (String [] args) {
		
		try {
			ArrayList<Pessoa> lista = new ArrayList<>();
			
			lista.add(new Pessoa("Gabriel", 28, 1.82));
			lista.add(new Pessoa("Carol", 33, 1.65));
			lista.add(new Pessoa("Otilia", 18, 1.65));
			
			Collections.sort(lista);
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("PessoaFile.txt"));
			
			for (Pessoa p : lista) {
				writer.write(p.getNome() + "-" + p.getIdade() + "-" + p.getAltura());
				writer.newLine();
			}
			writer.close();
			
			System.out.printf("Dados gravados!%n");
			
			BufferedReader reader = new BufferedReader(new FileReader("PessoaFile.txt"));
			
			String linha;
			
			System.out.println("Conteúdo do arquivo: ");
			
			while((linha = reader.readLine()) != null) {
				String [] dados = linha.split("-");
				
				Pessoa p = new Pessoa(dados[0], Integer.parseInt(dados[1]), Double.parseDouble(dados[2]));
				
				System.out.println(p);
			}
			
			reader.close();
		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}				
		
	}

}
