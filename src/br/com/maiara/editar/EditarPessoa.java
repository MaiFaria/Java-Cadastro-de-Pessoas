package br.com.maiara.editar;

import java.util.Scanner;

import br.com.maiara.cadastro.Cadastro;
import br.com.maiara.excecoes.MinhaExcecao;
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
					System.out.println("Digite a op��o a ser editada");
					int menu = entrada.nextInt();

					switch (menu) {
					case 1:
						System.out.println("Digite o seu Nome Completo para ALTERA��O");
						String nomeEditado = entrada.nextLine();
						p.setNome(nomeEditado);
						entrada.nextLine();

						System.out.println("Confirme a altera��o - Digite 1; ");
						int confirmaNome = entrada.nextInt();

						if (confirmaNome != 1) {
							throw new MinhaExcecao("Cadastro n�o alterado!");
						}
						PessoaService.salvarPessoa(p);
						System.out.println("Cadastro alterado com sucesso!!\n");
						break;
					case 2:
						System.out.println("Digite o CPF para ALTERA��O");
						String cpfEditado = entrada.nextLine();
						p.setCpf(cpfEditado);

						System.out.println("Confirme a altera��o - Digite 1; ");
						int confirmacao = entrada.nextInt();

						if (confirmacao != 1) {
							throw new MinhaExcecao("Cadastro n�o alterado!");
						}
						PessoaService.salvarPessoa(p);
						System.out.println("Cadastro alterado com sucesso!!\n");
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
						System.out.println("Op��o Inv�lida!\n");
						break;
					}

				} else {
					System.out.println("Cpf n�o localizado!!\n");
				}
			}
		}
	}

}
