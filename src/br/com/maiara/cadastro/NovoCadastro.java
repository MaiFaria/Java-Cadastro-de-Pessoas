package br.com.maiara.cadastro;

import java.util.Scanner;

import br.com.maiara.excecoes.MinhaExcecao;
import br.com.maiara.model.Contato;
import br.com.maiara.model.Endereco;
import br.com.maiara.model.Pessoa;
import br.com.maiara.service.PessoaService;

public class NovoCadastro extends Cadastro {

	public static void init() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Novo Cadastro");
		Pessoa pessoa = new Pessoa();

		System.out.println("Digite o seu Nome Completo");
		String nome = entrada.nextLine();
		pessoa.setNome(nome);
		System.out.println("Digite seu CPF:");
		String cpf = entrada.nextLine();
		pessoa.setCpf(cpf);

		Endereco endereco = new Endereco();
		System.out.println("Digite o seu Endereço");
		String rua = entrada.nextLine();
		endereco.setEndereco(rua);
		System.out.println("Digite o Número");
		int numero = Integer.parseInt(entrada.nextLine());
		endereco.setNumero(numero);
		System.out.println("Digite o Bairro");
		String bairro = entrada.nextLine();
		endereco.setBairro(bairro);
		System.out.println("Digite o seu CEP");
		String cep = entrada.nextLine();
		endereco.setCep(cep);
		System.out.println("Digite a Cidade");
		String cidade = entrada.nextLine();
		endereco.setCidade(cidade);
		System.out.println("Digite o Estado");
		String estado = entrada.nextLine();
		endereco.setEstado(estado);
		pessoa.setEndereco(endereco);

		Contato contato = new Contato();
		System.out.println("Digite o seu Contato Principal");
		int contatoUm = entrada.nextInt();
		contato.setContato1(contatoUm);
		entrada.nextLine();
		System.out.println("Digite o seu Contato Secundário");
		int contatoDois = entrada.nextInt();
		contato.setContato2(contatoDois);
		entrada.nextLine();
		System.out.println("Digite o seu E-mail");
		String emailUm = entrada.nextLine();
		contato.setEmail(emailUm);
		pessoa.setContato(contato);

		System.out.println("Os dados estão corretos? " + "\nNome: " + nome + "\nCPF: " + cpf + "\nRua: " + rua
				+ "\nNumero: " + numero + "\nBairro: " + bairro + "\nCEP: " + cep + "\nCidade: " + cidade + "\nEstado: "
				+ estado + "\nContato Primário: " + contatoUm + "\nContato Secundário: " + contatoDois + "\nE-mail: "
				+ emailUm);

		System.out.println("Confirme os dados - Digite 1;");
		int confirmacao = Integer.parseInt(entrada.nextLine());

		if (confirmacao != 1) {
			throw new MinhaExcecao("Cadastro não realizado!");
		}
		PessoaService.salvarPessoa(pessoa);
		System.out.println("Cadastro realizado com sucesso!!\n");

	}
}
