package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Cadastro do Produto ---");
        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Preço: ");
        double preco = teclado.nextDouble();

        System.out.print("Quantidade inicial em estoque: ");
        int qtd = teclado.nextInt();

        Produto p = new Produto(nome, preco, qtd);

        System.out.println("\nDados do produto: " + p);

        System.out.print("\nDigite a quantidade de produtos a ser adicionada ao estoque: ");
        int qtdAdicionar = teclado.nextInt();
        p.acrescentarProdutos(qtdAdicionar);

        System.out.println("Dados atualizados: " + p);

        System.out.print("\nDigite a quantidade de produtos a ser removida do estoque: ");
        int qtdRemover = teclado.nextInt();
        p.retirarProdutos(qtdRemover);

        System.out.println("Dados atualizados: " + p);

        teclado.close();
    }
}