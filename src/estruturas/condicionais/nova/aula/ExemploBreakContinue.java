package estruturas.condicionais.nova.aula;

public class ExemploBreakContinue {

	public static void main(String[] args) {
		
		for (int numero = 1; numero <=5; numero ++) {
			if(numero == 3)
				//break;
				continue; // PULA O N° 3
			
			System.out.println(numero);
		}

	}

}
