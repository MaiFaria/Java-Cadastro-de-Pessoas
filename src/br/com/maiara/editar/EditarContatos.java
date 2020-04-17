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
		
		System.out.println("Caso esteja tudo certo - Digite 1;" + "\nCaso queira editar - Digite 0");
		int confirma = Integer.parseInt(entrada.nextLine());
		
		if (confirma == 1) {
			for (Pessoa p : PessoaService.getPessoas()) {
				if (PessoaService.isPessoaEquals(p, cpfEditar)) {
					System.out.println("Digite o campo a ser editado");
					int menuContato = entrada.nextInt();
					entrada.nextLine();
					
					switch (menuContato) {
					case 1:
						System.out.println("Digite o seu Contato Principal");
						int contatoUmEditado = entrada.nextInt();
						p.getContato().setContato1(contatoUmEditado);
						break;
					case 2:
						System.out.println("Digite o seu Contato Secundário");
						int contatoDoisEditado = entrada.nextInt();
						p.getContato().setContato2(contatoDoisEditado);
						break;
					case 3:
						System.out.println("Digite o seu E-mail");
						String emailUmEditado = entrada.nextLine();
						p.getContato().setEmail(emailUmEditado);
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
