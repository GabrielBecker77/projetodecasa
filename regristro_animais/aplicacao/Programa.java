package aplicacao;


import entidades.Animal;
import entidades.Mamifero;
import entidades.Peixe;

public class Programa {
	public static void main (String [] args) {
		
		Animal[] zoo = new Animal[3];
		
		zoo [0] = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2.0, "Vegetais");
		zoo [1] = new Mamifero("Urso Pardo", 180, 0.5, "Mel");
		zoo [2] = new Peixe("Tubarão", 300, 1.5);
		
		for (Animal animal : zoo) {
			System.out.println(animal.dados());
			System.out.println();
		}	
	}
}
