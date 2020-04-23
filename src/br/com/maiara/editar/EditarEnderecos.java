package br.com.maiara.editar;

import java.util.Scanner;

import br.com.maiara.cadastro.Cadastro;
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
					System.out.println("Digite o campo a ser editado");
					int menuEndereco = entrada.nextInt();
					entrada.nextLine();

					switch (menuEndereco) {
					case 1:
						System.out.println("Digite a sua Rua/Av para ALTERAÇÃO");
						String ruaEditado = entrada.nextLine();
						p.getEndereco().setEndereco(ruaEditado);

						System.out.println("Caso esteja tudo certo - Digite 1;" + "\nCaso queira editar - Digite 0");
						int confirma1 = entrada.nextInt();

						if (confirma1 == 1) {
							PessoaService.salvarPessoa(p);
							System.out.println("Cadastro alterado com sucesso!!");
						}
						break;
					case 2:
						System.out.println("Digite o Número");
						int numeroEditado = Integer.parseInt(entrada.nextLine());
						p.getEndereco().setNumero(numeroEditado);

						System.out.println("Caso esteja tudo certo - Digite 1;" + "\nCaso queira editar - Digite 0");
						int confirma2 = entrada.nextInt();

						if (confirma2 == 1) {
							PessoaService.salvarPessoa(p);
							System.out.println("Cadastro alterado com sucesso!!");
						}
						break;
					case 3:
						System.out.println("Digite o Bairro");
						String bairroEditado = entrada.nextLine();
						p.getEndereco().setBairro(bairroEditado);

						System.out.println("Caso esteja tudo certo - Digite 1;" + "\nCaso queira editar - Digite 0");
						int confirma3 = entrada.nextInt();

						if (confirma3 == 1) {
							PessoaService.salvarPessoa(p);
							System.out.println("Cadastro alterado com sucesso!!");
						}
						break;
					case 4:
						System.out.println("Digite o seu CEP");
						String cepEditado = entrada.nextLine();
						p.getEndereco().setCep(cepEditado);

						System.out.println("Caso esteja tudo certo - Digite 1;" + "\nCaso queira editar - Digite 0");
						int confirma4 = entrada.nextInt();

						if (confirma4 == 1) {
							PessoaService.salvarPessoa(p);
							System.out.println("Cadastro alterado com sucesso!!");
						}
						break;
					case 5:
						System.out.println("Digite a Cidade");
						String cidadeEditado = entrada.nextLine();
						p.getEndereco().setCidade(cidadeEditado);

						System.out.println("Caso esteja tudo certo - Digite 1;" + "\nCaso queira editar - Digite 0");
						int confirma5 = entrada.nextInt();

						if (confirma5 == 1) {
							PessoaService.salvarPessoa(p);
							System.out.println("Cadastro alterado com sucesso!!");
						}
						break;
					case 6:
						System.out.println("Digite o Estado");
						String estadoEditado = entrada.nextLine();
						p.getEndereco().setEstado(estadoEditado);

						System.out.println("Caso esteja tudo certo - Digite 1;" + "\nCaso queira editar - Digite 0");
						int confirma6 = entrada.nextInt();

						if (confirma6 == 1) {
							PessoaService.salvarPessoa(p);
							System.out.println("Cadastro alterado com sucesso!!");
						}
						break;
					case 0:
						break;
					default:
						System.out.println("Opção Inválida!");
						break;
					}
				}
			}
		}
	}
}
