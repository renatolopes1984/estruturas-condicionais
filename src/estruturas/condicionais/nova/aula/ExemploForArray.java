package estruturas.condicionais.nova.aula;

public class ExemploForArray {

	public static void main(String[] args) {
		
		//EM ARRAYS O INDICE INICIA COM ZERO
		String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
		
		/*for (int x=0; x < alunos.length; x++) {
			System.out.println("O aluno no indice x = " + x + " é " + alunos [ x ]);
		}*/
		
		// OUTRA FORMA DE FAZER FOR EM ARRAYS
		// O FOR REACH É FORTEMENTE RELACIONADO COM UM CENÁRIO ONDE CONTENHA UM ARRAY OU COLEÇÃO.
		
		for (String aluno : alunos) {
			System.out.println("Nome do aluno é: " + aluno);
		}
		
		

	}

}
