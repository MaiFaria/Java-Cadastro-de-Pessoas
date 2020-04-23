package br.com.maiara.editar;

import java.util.Scanner;

import br.com.maiara.cadastro.Cadastro;
import br.com.maiara.model.Pessoa;
import br.com.maiara.service.PessoaService;

public class EditarPessoa extends Cadastro {

	public static void init(String cpf) {
		Cadastro editarPessoa = new Cadastro();

		Scanner entrada = new Scanner(System.in);

		String cpfEditar = entrada.nextLine();

		int confirma = 1;

		if (confirma == 1) {
			for (Pessoa p : PessoaService.getPessoas()) {
				if (PessoaService.isPessoaEquals(p, cpfEditar)) {
					editarPessoa.editar();
					System.out.println("Digite o campo a ser editado");
					int menu = entrada.nextInt();

					switch (menu) {
					case 1:
						System.out.println("Digite o seu Nome Completo para ALTERAÇÃO");
						String nomeEditado = entrada.nextLine();
						p.setNome(nomeEditado);
						entrada.nextLine();

						System.out.println(
								"Caso esteja tudo certo - Digite 1;" + nomeEditado + "\nCaso queira editar - Digite 0");
						int confirmaNome = entrada.nextInt();

						if (confirmaNome == 1) {
							PessoaService.salvarPessoa(p);
							System.out.println("Cadastro alterado com sucesso!!");
						}
						break;
					case 2:
						System.out.println("Digite o CPF para ALTERAÇÃO");
						String cpfEditado = entrada.nextLine();
						p.setCpf(cpfEditado);

						System.out.println(
								"Caso esteja tudo certo - Digite 1;" + cpfEditado + "\nCaso queira editar - Digite 0");
						int confirmacao = entrada.nextInt();

						if (confirmacao == 1) {
							PessoaService.salvarPessoa(p);
							System.out.println("Cadastro alterado com sucesso!!");
						}
						break;
					case 3:
						EditarEnderecos.init(cpfEditar);
						break;
					case 4:
						EditarContatos.init(cpfEditar);
						break;
					case 0:
						break;
					default:
						System.out.println("Opção Inválida!");
						break;
					}

				} else {
					System.out.println("Cpf não localizado!!");
				}
			}
		}
	}

}
