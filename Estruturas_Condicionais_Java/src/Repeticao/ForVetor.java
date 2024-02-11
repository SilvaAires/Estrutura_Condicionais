package Repeticao;

public class ForVetor {
	public static void main(String[] args) {
		String alunos[] = new String[2];
		String aluno[] = {"A", "B", "C", "D", "E"};
		for (int i = 0; i < aluno.length; i++) {
			System.out.println(aluno[i]);
		}
		for (int i = aluno.length-1; i >= 0; i--) {
			System.out.println(aluno[i]);
		}
		
		//for each
		System.out.println("------------------");
		for (String alu : aluno) {
			System.out.println(alu);
		}
	}
}
