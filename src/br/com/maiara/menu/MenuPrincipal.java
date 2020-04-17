package br.com.maiara.menu;

import java.util.Scanner;

import br.com.maiara.cadastro.Cadastro;
import br.com.maiara.cadastro.NovoCadastro;
import br.com.maiara.editar.EditarPessoa;
import br.com.maiara.service.PessoaService;

public class MenuPrincipal {

	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
		cadastro.menu();

		Scanner entrada = new Scanner(System.in);
		int valorMenu = entrada.nextInt();

		switch (valorMenu) {
		case 1:
			NovoCadastro.init();
			break;
		case 2:
			System.out.println("Informe o CPF para Editar o cadastro");
			String cpfEditar = entrada.nextLine();
			EditarPessoa.init(cpfEditar);
			break;
		case 3:
			System.out.println("Informe o CPF para EXCLUIR o cadastro");
			String cpfExcluir = entrada.nextLine();
			System.out.println(PessoaService.excluiPessoaPeloCpf(cpfExcluir));
			break;
		case 4:
			System.out.println("Informe o CPF para CONSULTAR o cadastro");
			String cpfConsultar = entrada.nextLine();
			System.out.println(PessoaService.buscaPessoaPeloCpf(cpfConsultar));
			break;

		default:
			break;

		}
		entrada.close();
	}

}
