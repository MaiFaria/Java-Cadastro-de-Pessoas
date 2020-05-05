package br.com.maiara.editar;

import java.util.Scanner;

import br.com.maiara.cadastro.Cadastro;
import br.com.maiara.excecoes.MinhaExcecao;
import br.com.maiara.model.Pessoa;
import br.com.maiara.service.PessoaService;

public class EditarEnderecos extends Cadastro {

	public static void init(String cpfEditar) {
		Cadastro editarEndereco = new Cadastro();
		editarEndereco.editarEndereco();

		Scanner entrada = new Scanner(System.in);

		int confirma = 1;

		if (confirma == 1) {
			for (Pessoa p : PessoaService.getPessoas()) {
				if (PessoaService.isPessoaEquals(p, cpfEditar)) {
					System.out.println("Digite a op��o a ser editada");
					int menuEndereco = entrada.nextInt();
					entrada.nextLine();

					switch (menuEndereco) {
					case 1:
						System.out.println("Digite a sua Rua/Av para ALTERA��O");
						String ruaEditado = entrada.nextLine();
						p.getEndereco().setEndereco(ruaEditado);

						System.out.println("Confirme a altera��o - Digite 1; ");
						int confirma1 = entrada.nextInt();

						if (confirma1 != 1) {
							throw new MinhaExcecao("Cadastro n�o alterado!");
						}
						PessoaService.salvarPessoa(p);
						System.out.println("Cadastro alterado com sucesso!!\n");
						break;
					case 2:
						System.out.println("Digite o N�mero para ALTERA��O");
						int numeroEditado = Integer.parseInt(entrada.nextLine());
						p.getEndereco().setNumero(numeroEditado);

						System.out.println("Confirme a altera��o - Digite 1; ");
						int confirma2 = entrada.nextInt();

						if (confirma2 != 1) {
							throw new MinhaExcecao("Cadastro n�o alterado!");
						}
						PessoaService.salvarPessoa(p);
						System.out.println("Cadastro alterado com sucesso!!\n");
						break;
					case 3:
						System.out.println("Digite o Bairro para ALTERA��O");
						String bairroEditado = entrada.nextLine();
						p.getEndereco().setBairro(bairroEditado);

						System.out.println("Confirme a altera��o - Digite 1; ");
						int confirma3 = entrada.nextInt();

						if (confirma3 != 1) {
							throw new MinhaExcecao("Cadastro n�o alterado!");
						}
						PessoaService.salvarPessoa(p);
						System.out.println("Cadastro alterado com sucesso!!\n");
						break;
					case 4:
						System.out.println("Digite o seu CEP para ALTERA��O");
						String cepEditado = entrada.nextLine();
						p.getEndereco().setCep(cepEditado);

						System.out.println("Confirme a altera��o - Digite 1; ");
						int confirma4 = entrada.nextInt();

						if (confirma4 != 1) {
							throw new MinhaExcecao("Cadastro n�o alterado!");
						}
						PessoaService.salvarPessoa(p);
						System.out.println("Cadastro alterado com sucesso!!\n");
						break;
					case 5:
						System.out.println("Digite a Cidade para ALTERA��O");
						String cidadeEditado = entrada.nextLine();
						p.getEndereco().setCidade(cidadeEditado);

						System.out.println("Confirme a altera��o - Digite 1; ");
						int confirma5 = entrada.nextInt();

						if (confirma5 != 1) {
							throw new MinhaExcecao("Cadastro n�o alterado!");
						}
						PessoaService.salvarPessoa(p);
						System.out.println("Cadastro alterado com sucesso!!\n");
						break;
					case 6:
						System.out.println("Digite o Estado para ALTERA��O");
						String estadoEditado = entrada.nextLine();
						p.getEndereco().setEstado(estadoEditado);

						System.out.println("Confirme a altera��o - Digite 1; ");
						int confirma6 = entrada.nextInt();

						if (confirma6 != 1) {
							throw new MinhaExcecao("Cadastro n�o alterado!");
						}
						PessoaService.salvarPessoa(p);
						System.out.println("Cadastro alterado com sucesso!!\n");
						break;
					case 0:
						break;
					default:
						System.out.println("Op��o Inv�lida!\n");
						break;
					}
				}
			}
		}
	}
}
