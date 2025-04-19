package conta_banco;
import java.util.Scanner;
public class ContaTerminal {
	public static void main(String[] args) {
		//TODO: Conhecer e importar a classe Scanner
		
		//TODO: Exibir a mensagem para o nosso usuário
		
		//TODO: Obter pela scanner os valores digitados no terminal
		
		//TODO: Exibir a mensagem conta criada
		
		
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Digite o número da Conta: ");
		int numero = imput.nextInt();
		
		System.out.println("Digite o Número da Ag6encia: ");
		String agencia = imput.next();
		
		System.out.println("Informe seu Nome: ");
		String nomeCliente = imput.next();
		
		System.out.println("Informe seu Saldo: ");
		double saldo = imput.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
				" já está disponível para saque!");
		
	}
}
