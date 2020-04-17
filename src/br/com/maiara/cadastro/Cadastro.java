package br.com.maiara.cadastro;


public class Cadastro {

	public void menu() {
		System.out.println("**Menu de Cadastro**\n");
		System.out.println("1 - Novo Cadastro");
		System.out.println("2 - Editar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Consulta");
		System.out.println("0 - Sair");
	}

	public void editar() {
		System.out.println("1 - Nome");
		System.out.println("2 - Cpf");
		System.out.println("3 - Endereço");
		System.out.println("4 - Contato");
		System.out.println("0 - Sair");
	}

	public void editarEndereco() {
		System.out.println("1 - Rua/Av.");
		System.out.println("2 - Numero");
		System.out.println("3 - Bairro");
		System.out.println("4 - Cep");
		System.out.println("5 - Cidade");
		System.out.println("6 - Estado");
		System.out.println("0 - Sair");
	}

	public void editarContato() {
		System.out.println("1 - Contato Principal");
		System.out.println("2 - Contato Secundário");
		System.out.println("3- E-mail");
		System.out.println("0 - Sair");
	}
	
	
}

	