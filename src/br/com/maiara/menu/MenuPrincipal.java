package br.com.maiara.menu;

import java.util.Scanner;

import br.com.maiara.cadastro.Cadastro;
import br.com.maiara.cadastro.NovoCadastro;
import br.com.maiara.editar.EditarPessoa;
import br.com.maiara.service.PessoaService;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		int valorMenu = 1;

		do {

			Cadastro cadastro = new Cadastro();
			cadastro.menu();

			valorMenu = entrada.nextInt();

			switch (valorMenu) {
			case 1:
				NovoCadastro.init();
				break;
			case 2:
				System.out.println("\nInforme o CPF para EDITAR o cadastro");
				String cpfEditar = entrada.nextLine();
				EditarPessoa.init(cpfEditar);
				break;
			case 3:
				System.out.println("\nInforme o CPF para EXCLUIR o cadastro");
				String cpfExcluir = sc.nextLine();
				entrada.nextLine();
				System.out.println(PessoaService.excluiPessoaPeloCpf(cpfExcluir));
				break;
			case 4:
				System.out.println("\nInforme o CPF para CONSULTAR o cadastro");
				String cpfConsultar = sc.nextLine();
				System.out.println(PessoaService.buscaPessoaPeloCpf(cpfConsultar));
				break;

			default:
				break;

			}

		} while (valorMenu != 0);

	}

}
