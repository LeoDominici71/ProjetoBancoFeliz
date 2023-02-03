package br.com.Application.app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import br.com.entities.app.Cliente;
import br.com.entities.app.PessoaFisic;
import br.com.exception.app.ConfirmaContaException;
import br.com.exception.app.CpfException;
import br.com.exception.app.CpfLenghtException;
import br.com.exception.app.StringException;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Cliente cliente = new Cliente();

		PessoaFisic pessoaFisica = new PessoaFisic();

		List<PessoaFisic> list = new ArrayList<PessoaFisic>();

		boolean continuar = true;

		char opcao = 's';

		try (Scanner input = new Scanner(System.in)) {
			while (continuar) {

				for (int i = 1; opcao == 's'; i++) {
					System.out.println("Bem vindo ao Banco Feliz :)");

					System.out.println(
							"Digite o numero da agencia de sua cidade/ 1 : Praia Grande , 2 : Santos, 3 : Sao Paulo");
					int agencia = sc.nextInt();

					String cidade = "";

					switch (agencia) {
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
					pessoaFisica.eString(nome);

					System.out.println("Digite seu sobrenome");
					String sobrenome = sc.next();
					pessoaFisica.eString(sobrenome);

					System.out.println("Digite seu cpf");
					String cpf = sc.next();
					PessoaFisic cpf_match = list.stream().filter(x -> x.getCliente().getCpf().equals(cpf)).findFirst().orElse(null);
					pessoaFisica.MesmoCpf(cpf_match);
					pessoaFisica.CpfTamanho(cpf);

					System.out.println("Digite o nome da rua");
					String rua = sc.next();

					System.out.println("Digite o numero da residencia");
					int numero = sc.nextInt();

					System.out.println("Digite o complemento se houver, se nao digite 0");
					int complemento = sc.nextInt();

					System.out.println("Digite o telefone com o ddd");
					String telefone = sc.next();

					int conta = 10000 + i;

					cliente.dadosPessoa(cpf, nome, sobrenome, rua, numero, complemento, telefone, cidade);

					PessoaFisic pessoaFisic = new PessoaFisic(agencia, conta, cpf, cliente);

					list.add(pessoaFisic);

					System.out.println(cliente);

					System.out.println("Agencia : " + agencia + " Conta : " + conta);

					System.out.println(
							"===========================================================================================================");
					System.out.println("Gostaria de acessar sua conta? sim/nao");
					char acesso = sc.next().charAt(0);
					if (acesso == 's') {

						System.out.println("Digite o numero da conta");
						int id_match = sc.nextInt();
						pessoaFisic = list.stream().filter(x -> x.getConta() == id_match).findFirst().orElse(null);
						pessoaFisic.ConfirmaConta(pessoaFisic);

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
		} catch (InputMismatchException err) {

			System.out.println("Erro! O valor digitado nao e valido");

		} catch (CpfException e) {

			System.out.println("Esse CPF ja esta cadastrado, procure um gerente");

		} catch (StringException e) {

			System.out.println("Por favor, digite somente letras");

		} catch (CpfLenghtException e) {

			System.out.println("O CPF deve conter 11 digitos");

		} catch (ConfirmaContaException e) {

			System.out.println("Essa conta nao existe");

		}

	}
}
