package Repeticao;

import java.util.Random;

public class FacaEnquanto {
	public static void main(String[] args) {
		/*int i = 0;
		boolean v = true;
		do {
			System.out.println(i*2);
			i++;
			if(i == 30) {
				v = false;
			}
		} while (v != false);*/
		System.out.println("Discando...");
		do {
			System.out.println("Tocando");
			
		} while (to());
		System.out.println("Atendeu");
		
	}
	
	public static boolean to() {
		boolean at = new Random().nextInt(3)==1;
		System.out.println("Atendeu? "+ at);
		return !at;
	}
}
