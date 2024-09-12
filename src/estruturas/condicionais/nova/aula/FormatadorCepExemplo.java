package estruturas.condicionais.nova.aula;

public class FormatadorCepExemplo {

	public static void main(String[] args) {
		try {
			String cepFormatado = formatarCep("2376506");
			System.out.println(cepFormatado);
		} catch (CepInvalidoException e) {
			System.out.println("O CEP não corresponde com a regras de 8 digitos");
		}

	}
	static String formatarCep (String cep) throws CepInvalidoException{
		if(cep.length() != 8)
			throw new CepInvalidoException();
		
		//SIMULANDO UM CEP FORMATADO
		return "23.765-064";
	}
	

}
