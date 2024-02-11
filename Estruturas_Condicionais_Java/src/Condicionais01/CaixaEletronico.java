package Condicionais01;

public class CaixaEletronico {
	public static void main(String[] args) {
		double saldo = 25;
		double valorSolicitado = 17;
		
		if(valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println("Saldo: "+saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}
