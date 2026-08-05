package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Categoria;
import entidades.Jogo;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Jogo> lista = new ArrayList<>();

        Categoria acao = new Categoria(1, "Ação");
        Categoria rpg = new Categoria(2, "RPG");
        Categoria corrida = new Categoria(3, "Corrida");

        lista.add(new Jogo(1, "God of War", 199.90, acao));
        lista.add(new Jogo(2, "FIFA 25", 250.00, corrida));
        lista.add(new Jogo(3, "The Witcher 3", 99.90, rpg));

        int opcao;

        do {

            System.out.printf("%n--- MENU ---%n");
            System.out.println("1 - Inserir jogo");
            System.out.println("2 - Exibir jogos");
            System.out.println("3 - Aplicar desconto");
            System.out.println("4 - Remover jogo");
            System.out.println("5 - Alterar categoria");
            System.out.println("6 - Listar jogos por categoria");
            System.out.println("7 - Alterar preço");
            System.out.println("8 - Listar jogos acima de um valor");
            System.out.println("9 - Sair");

            System.out.printf("Escolha: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

            case 1:
                inserirJogo(lista, teclado);
                break;

            case 2:
                exibirJogos(lista);
                break;

            case 3:
                aplicarDesconto(lista, teclado);
                break;

            case 4:
                removerJogo(lista, teclado);
                break;

            case 5:
                alterarCategoria(lista, teclado);
                break;

            case 6:
                listarPorCategoria(lista, teclado);
                break;

            case 7:
                alterarPreco(lista, teclado);
                break;

            case 8:
                listarAcimaValor(lista, teclado);
                break;

            case 9:
                System.out.printf("Encerrando...%n");
                break;

            default:
                System.out.printf("Opção inválida!%n");
            }

        } while (opcao != 9);

        teclado.close();
    }

    public static void inserirJogo(List<Jogo> lista, Scanner teclado) {

        System.out.printf("%nCódigo: ");
        int codigo = teclado.nextInt();
        teclado.nextLine();

        System.out.printf("Nome: ");
        String nome = teclado.nextLine();

        System.out.printf("Preço: ");
        double preco = teclado.nextDouble();

        System.out.printf("Código da categoria: ");
        int codCategoria = teclado.nextInt();
        teclado.nextLine();

        System.out.printf("Nome da categoria: ");
        String nomeCategoria = teclado.nextLine();

        Categoria categoria = new Categoria(codCategoria, nomeCategoria);

        lista.add(new Jogo(codigo, nome, preco, categoria));

        System.out.printf("Jogo cadastrado com sucesso!%n");
    }

    public static void exibirJogos(List<Jogo> lista) {

        System.out.printf("%n--- LISTA DE JOGOS ---%n");

        for (Jogo j : lista) {
            System.out.println(j);
        }
    }

    public static void aplicarDesconto(List<Jogo> lista, Scanner teclado) {

        System.out.printf("%nCódigo do jogo: ");
        int codigo = teclado.nextInt();

        Jogo jogo = buscarJogo(lista, codigo);

        if (jogo != null) {

            System.out.printf("Percentual de desconto: ");
            double percentual = teclado.nextDouble();

            jogo.aplicarDesconto(percentual);

            System.out.printf("Desconto aplicado com sucesso!%n");

        } else {
            System.out.printf("Jogo não encontrado!%n");
        }
    }

    public static void removerJogo(List<Jogo> lista, Scanner teclado) {

        System.out.printf("%nCódigo do jogo: ");
        int codigo = teclado.nextInt();

        Jogo jogo = buscarJogo(lista, codigo);

        if (jogo != null) {

            lista.remove(jogo);

            System.out.printf("Jogo removido com sucesso!%n");

        } else {
            System.out.printf("Jogo não encontrado!%n");
        }
    }

    public static void alterarCategoria(List<Jogo> lista, Scanner teclado) {

        System.out.printf("%nCódigo do jogo: ");
        int codigo = teclado.nextInt();
        teclado.nextLine();

        Jogo jogo = buscarJogo(lista, codigo);

        if (jogo != null) {

            System.out.printf("Novo código da categoria: ");
            int codCategoria = teclado.nextInt();
            teclado.nextLine();

            System.out.printf("Nome da categoria: ");
            String nomeCategoria = teclado.nextLine();

            Categoria novaCategoria = new Categoria(codCategoria, nomeCategoria);

            jogo.setCategoria(novaCategoria);

            System.out.printf("Categoria alterada com sucesso!%n");

        } else {
            System.out.printf("Jogo não encontrado!%n");
        }
    }

    public static void listarPorCategoria(List<Jogo> lista, Scanner teclado) {

        teclado.nextLine();

        System.out.printf("%nInforme a categoria: ");
        String categoria = teclado.nextLine();

        System.out.printf("%n--- JOGOS DA CATEGORIA ---%n");

        for (Jogo j : lista) {

            if (j.getCategoria().getNome()
                    .equalsIgnoreCase(categoria)) {

                System.out.println(j);
            }
        }
    }

    public static void alterarPreco(List<Jogo> lista, Scanner teclado) {

        System.out.printf("%nCódigo do jogo: ");
        int codigo = teclado.nextInt();

        Jogo jogo = buscarJogo(lista, codigo);

        if (jogo != null) {

            System.out.printf("Novo preço: ");
            double novoPreco = teclado.nextDouble();

            jogo.setPreco(novoPreco);

            System.out.printf("Preço alterado com sucesso!%n");

        } else {
            System.out.printf("Jogo não encontrado!%n");
        }
    }

    public static void listarAcimaValor(List<Jogo> lista, Scanner teclado) {

        System.out.printf("%nInforme o valor mínimo: ");
        double valor = teclado.nextDouble();

        System.out.printf("%n--- JOGOS ACIMA DO VALOR ---%n");

        for (Jogo j : lista) {

            if (j.getPreco() > valor) {
                System.out.println(j);
            }
        }
    }

    public static Jogo buscarJogo(List<Jogo> lista, int codigo) {

        for (Jogo j : lista) {

            if (j.getCodigo() == codigo) {
                return j;
            }
        }

        return null;
    }
}