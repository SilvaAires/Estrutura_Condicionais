import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecoes {
	public static void main(String[] args) {
		try {
			
			Scanner e = new Scanner(System.in).useLocale(Locale.US);
			System.out.println("Digite seu nome: ");
			String nome = e.nextLine();
			
			e = new Scanner(System.in);
			System.out.println("Digite seu sobrenome: ");
			String sobrenome = e.nextLine();
			
			e = new Scanner(System.in);
			System.out.println("Digite sua idade: ");
			int idade = e.nextInt();
			
			System.out.println("Digite sua altura: ");
			int altura = e.nextInt();
			
			System.out.println(nome+" "+sobrenome);
			System.out.println("Idade: "+idade);
			System.out.println("Altura: "+altura);
			e.close();
			
		} catch (InputMismatchException e) {
			System.err.println("Idade e altura são campos numericos!");
		}
	}
}
