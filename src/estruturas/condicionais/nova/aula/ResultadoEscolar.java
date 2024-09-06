package estruturas.condicionais.nova.aula;

public class ResultadoEscolar {

	public static void main(String[] args) {
		int nota = 0;
		
		if (nota >= 7) {
			System.out.println("Aprovado");

		} else if (nota >= 5 && nota < 7) {
			System.out.println("Em recuperação");

		} else if (nota < 5) {
			System.out.println("Reprovado");
			
		}

	}

}
