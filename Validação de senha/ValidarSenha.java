import java.util.Scanner;

public class ValidarSenha {
	public static void main (String [] args) {
		 Scanner scanner = new Scanner(System.in); 
	       String senha; 
	       System.out.print("Digite a senha: "); 
	       senha = scanner.nextLine(); 
	    
	       while (!senhaValida(senha)) { 
	           System.out.println("Senha inválida. Tente novamente."); 
	           System.out.print("Digite a senha: "); 
	           senha = scanner.nextLine(); 
	       } 
	       System.out.println("Senha válida."); 
	       scanner.close(); 
	   } 
	   private static boolean senhaValida(String senha) { 
	       if (senha.length() < 8) { 
	           return false; 
	       } 
	       boolean temMaiuscula = false; 
	       boolean temMinuscula = false; 
	       boolean temNumero = false; 
	       int i = 0; 
	       while (i < senha.length()) { 
	           char c = senha.charAt(i); 
	           if (Character.isUpperCase(c)) { 
	               temMaiuscula = true; 
	           } else if (Character.isLowerCase(c)) { 
	               temMinuscula = true; 
	           } else if (Character.isDigit(c)) { 
	               temNumero = true; 
	           } 
	           i++; 
	       } 
	       return (temMaiuscula && temMinuscula && temNumero); 
	    
	}

}
