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

		System.out.println("Caso esteja tudo certo - Digite 1;" + "\nCaso queira editar - Digite 0");
		int confirma = Integer.parseInt(entrada.nextLine());

		if (confirma == 1) {
			for (Pessoa p : PessoaService.getPessoas()) {
				if (p.getCpf().equals(cpfEditar)) {
					System.out.println("Digite o campo a ser editado");
					int menuEndereco = entrada.nextInt();
					entrada.nextLine();
					switch (menuEndereco) {
					case 1:
						System.out.println("Digite a sua Rua/Av");
						String ruaEditado = entrada.nextLine();
						p.getEndereco().setEndereco(ruaEditado);
						break;
					case 2:
						System.out.println("Digite o Número");
						int numeroEditado = Integer.parseInt(entrada.nextLine());
						p.getEndereco().setNumero(numeroEditado);
						break;
					case 3:
						System.out.println("Digite o Bairro");
						String bairroEditado = entrada.nextLine();
						p.getEndereco().setBairro(bairroEditado);
						break;
					case 4:
						System.out.println("Digite o seu CEP");
						String cepEditado = entrada.nextLine();
						p.getEndereco().setCep(cepEditado);
						break;
					case 5:
						System.out.println("Digite a Cidade");
						String cidadeEditado = entrada.nextLine();
						p.getEndereco().setCidade(cidadeEditado);
						break;
					case 6:
						System.out.println("Digite o Estado");
						String estadoEditado = entrada.nextLine();
						p.getEndereco().setEstado(estadoEditado);
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
		entrada.close();
	}
}
