package Condicionais01;

public class Escola {

	public static void main(String[] args) {
		int nota = 5;
		System.out.println(nota >= 7 ? "Aprovado" : "Reprovado");
		String res = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
		System.out.println(res);
		System.out.println(nota >= 7 ? "Aprovado" : ((nota >= 5) && (nota < 7)) ? "Recuperação" : "Reprovado");
	}
}
