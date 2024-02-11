package Condicionais01;

public class Sistema_De_Medida {

	public static void main(String[] args) {
		String key = "A";
		
		switch (key) {
		case "P": {
			System.out.println("Pequeno");
			break;
		}
		case "M": {
			System.out.println("Medio");
			break;
		}
		case "G": {
			System.out.println("Grande");
			break;
		}
		default:
			System.out.println("Erro");
		}
	}

}
