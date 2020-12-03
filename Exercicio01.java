package afrodev.Exercicio01;
//Desenvolvido por Rodrigo Brito
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta(6646, 969060);
		primeiraConta.deposita(0);
		System.out.println("Meu saldo atual é de " + primeiraConta.getSaldo() + " Reais");

		System.out.println("------------------------------------");
		System.out.println("Digite o valor que queira depositar");
		Scanner scan = new Scanner(System.in);
		double depositar = scan.nextDouble();
		primeiraConta.deposita(depositar);
		System.out.println("Após o depósito, o meu saldo é de: " + primeiraConta.getSaldo() + " Reais");
		System.out.println("------------------------------------");

		System.out.println("------------------------------------");
		System.out.println("Digite o valor que queira Sacar");
		double sacar = scan.nextDouble();
		primeiraConta.saca(sacar);
		System.out.println("Após o saque, o meu saldo é de: " + primeiraConta.getSaldo() + " Reais");
		System.out.println("------------------------------------");

		// Criando a segunda conta

		Conta segundaConta = new Conta(6645, 969061);
		segundaConta.deposita(50);
		System.out.println("segunda conta tem " + segundaConta.getSaldo());

		System.out.println("------------------------------------");
		System.out.println("Digite o valor que queira Transferir");
		double transferir = scan.nextDouble();
		boolean sucessoTransferencia = primeiraConta.transfere(transferir, segundaConta);

		if (sucessoTransferencia) {
			System.out.println("Transferencia realizada com sucesso");

		} else {
			System.out.println("Não foi possível realizar a transferencia. Saldo Insuficiente");

		}
		System.out.println("O saldo da conta " + primeiraConta.getNumero() + " é " + primeiraConta.getSaldo());
		System.out.println("O saldo da conta " + segundaConta.getNumero() + " é " + segundaConta.getSaldo());

	}
}
