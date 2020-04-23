package br.com.maiara.editar;

import java.util.Scanner;

import br.com.maiara.cadastro.Cadastro;
import br.com.maiara.model.Pessoa;
import br.com.maiara.service.PessoaService;

public class EditarContatos extends Cadastro {

	public static void init(String cpfEditar) {
		Cadastro editarContato = new Cadastro();
		editarContato.editarContato();

		Scanner entrada = new Scanner(System.in);

		int confirma = 1;

		if (confirma == 1) {
			for (Pessoa p : PessoaService.getPessoas()) {
				if (PessoaService.isPessoaEquals(p, cpfEditar)) {
					System.out.println("Digite o campo a ser editado");
					int menuContato = entrada.nextInt();
					entrada.nextLine();

					switch (menuContato) {
					case 1:
						System.out.println("Digite o seu novo Contato Principal para ALTERAÇÃO");
						int contatoUmEditado = entrada.nextInt();
						p.getContato().setContato1(contatoUmEditado);

						System.out.println("Caso esteja tudo certo - Digite 1; " + "\n Caso queira editar - Digite 0");
						int confirma1 = entrada.nextInt();

						if (confirma1 == 1) {
							PessoaService.salvarPessoa(p);
							System.out.println("Cadastro alterado com sucesso!!");
						}
						break;
					case 2:
						System.out.println("Digite o seu novo Contato Secundário para ALTERAÇÃO");
						int contatoDoisEditado = entrada.nextInt();
						p.getContato().setContato2(contatoDoisEditado);

						System.out.println("Caso esteja tudo certo - Digite 1;" + "\nCaso queira editar - Digite 0");
						int confirma2 = entrada.nextInt();

						if (confirma2 == 1) {
							PessoaService.salvarPessoa(p);
							System.out.println("Cadastro alterado com sucesso!!");
						}
						break;
					case 3:
						System.out.println("Digite o seu novo E-mail para ALTERAÇÃO");
						String emailUmEditado = entrada.nextLine();
						p.getContato().setEmail(emailUmEditado);

						System.out.println("Caso esteja tudo certo - Digite 1;" + "\nCaso queira editar - Digite 0");
						int confirma3 = entrada.nextInt();

						if (confirma3 == 1) {
							PessoaService.salvarPessoa(p);
							System.out.println("Cadastro alterado com sucesso!!");
						}
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
