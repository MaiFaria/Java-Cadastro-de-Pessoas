package br.com.maiara.service;

import java.util.ArrayList;
import java.util.List;

import br.com.maiara.model.Pessoa;

public class PessoaService {
	
	private static List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public static void salvarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
		
	}
	
	public static boolean isPessoaEquals(Pessoa pessoa, String valor) {
		return pessoa.getCpf().equals(valor);
	}
	
	public static List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public static String buscaPessoaPeloCpf(String cpfConsultar) {
		for (Pessoa pessoa : pessoas) {
			if (isPessoaEquals(pessoa, cpfConsultar)) {
				return pessoa.toString();
			}
		}
		
		return null; 
	}
	
	public static String excluiPessoaPeloCpf(String cpfExcluir) {
		for (Pessoa pessoa : pessoas) {
			if (isPessoaEquals(pessoa, cpfExcluir)) {
				pessoas.remove(pessoa);
				return "Pessoa removida com SUCESSO!!";
			}
		}
		return "Não foi localizado esse CPF no cadastro!";
	}
	
	

}
