package src;
// Importa a classe Scanner na nossa aplicação
import java.util.Scanner;

// cria a classe Parametro Inválido que vai definir o nosso erro
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

// Classe que vai receber um terminal Scanner que vai fazer a operação
public class Contador {
	public static void main(String[] args) {
		//Importa o Scanner para a classe
		Scanner terminal = new Scanner(System.in);

		// Imprime a primeira mensagem para submeter o primeiro valor
		System.out.println ("Digite o primeiro valor");
		// O valor é um número inteiro que se chamará Parametro 1
		int valorUm = terminal.nextInt();

		// Imprime a segunda mensagem para submeter o segundo valor
		System.out.println("Digite o segundo valor");
		// O valor é um número inteiro que se chamará Parametro 2
		int valorDois = terminal.nextInt();
		
		try {
            contar(valorUm, valorDois);
		
		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int valorUm, int valorDois) throws ParametrosInvalidosException {
		// Se o primeiro valor for maior que o segundo, encontraremos a exceção e aparecerá a mensagem
		if (valorUm > valorDois) {
			throw new ParametrosInvalidosException("O segundo valor deve ser maior que o primeiro!");
		}
		
		int contagem = valorDois - valorUm;
		
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
