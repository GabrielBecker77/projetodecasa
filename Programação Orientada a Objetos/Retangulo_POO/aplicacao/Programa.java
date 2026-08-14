package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Retangulo;

public class Programa {
    public static void main (String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a largura: ");
        double largura = teclado.nextDouble();
        
        System.out.print("Digite a altura: ");
        double altura = teclado.nextDouble();

        Retangulo r = new Retangulo(largura, altura);
        
        System.out.println();
        System.out.printf("Área: %.2f%n", r.area());
        System.out.printf("Perímetro: %.2f%n", r.perimetro());
        System.out.printf("Diagonal: %.2f%n", r.diagonal());
        
        teclado.close();
    }
}
