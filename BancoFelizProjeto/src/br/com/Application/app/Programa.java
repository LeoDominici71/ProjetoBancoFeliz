package br.com.Application.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.entities.app.PessoaFisic;
import br.com.entities.app.Cliente;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		PessoaFisic pessoaFisica = new PessoaFisic();
		List<PessoaFisic> list = new ArrayList<PessoaFisic>();
		boolean continuar = true;
		char opcao = 's';
		while (continuar) {

			for (int i = 1; opcao == 's'; i++) {
				System.out.println("Bem vindo ao Banco Feliz :)");
				
                System.out.println("Digite o numero da sua agencia/ 1 : Praia Grande , 2 : Santos, 3 : Sao Paulo");
					int number = sc.nextInt();

					String cidade = "";

					switch (number) {
					case 1:
						cidade = "Praia Grande";
						break;
					case 2:
						cidade = "Santos";
						break;
					case 3:
						cidade = "Sao Paulo";
						break;
					}
					System.out.println("Digite seu nome");
					String nome = sc.next();

					System.out.println("Digite seu sobrenome");
					String sobrenome = sc.next();

					System.out.println("Digite seu cpf");
					int cpf = sc.nextInt();

					System.out.println("Digite o nome da rua");
					String rua = sc.next();

					System.out.println("Digite o numero da residencia");
					int numero = sc.nextInt();

					System.out.println("Digite o complemento se houver, se nao digite 0");
					Integer complemento = sc.nextInt();

					System.out.println("Digite o telefone");
					int telefone = sc.nextInt();

					int conta = 1000 + i;

					cliente.dadosPessoa(cpf, nome, sobrenome, rua, numero, opcao, telefone, cidade);

					PessoaFisic pessoaFisic = new PessoaFisic(number, conta, cpf, cliente);

					list.add(pessoaFisic);

					System.out.println(cliente);

					System.out.println("Agencia : " + number + " Conta : " + conta);
					System.out.println(
							"===========================================================================================================");
					System.out.println("Gostaria de acessar sua conta?");
					char search = sc.next().charAt(0);
					if(search == 's') {
						System.out.println("Digite o numero da conta");
						int id_match = sc.nextInt();
						pessoaFisic = list.stream().filter(x -> x.getConta() == id_match).findFirst().orElse(null);
						System.out.println(pessoaFisic);
					}
					System.out.println("Gostaria de cadastrar outra conta? sim/nao");

					opcao = sc.next().charAt(0);

					if (opcao != 's') {
						continuar = false;
						System.out.println("Muito obrigado por usar nossos serviços");

					}
				} 

				
			}
	}
}
