package br.com.maiara.teste;

import br.com.maiara.model.Contato;
import br.com.maiara.model.Endereco;
import br.com.maiara.model.Pessoa;

public class Testa {

	public static Pessoa createUsuario() {
		Pessoa usuario = new Pessoa();
		usuario.setNome("Mai Faria");
		usuario.setCpf("1234");

		Endereco endereco = new Endereco();
		endereco.setEndereco("Rua");
		endereco.setNumero(123);
		endereco.setBairro("Bairro");
		endereco.setCep("123");
		endereco.setCidade("Cidade");
		endereco.setEstado("Estado");
		usuario.setEndereco(endereco);

		Contato contato = new Contato();
		contato.setContato1(123);
		contato.setContato2(321);
		contato.setEmail("Email");
		usuario.setContato(contato);

		return usuario;

	}

}
