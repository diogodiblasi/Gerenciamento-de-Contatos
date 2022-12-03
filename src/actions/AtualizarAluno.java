package actions;

import java.util.Scanner;

import model.Aluno;
import model.CrudAluno;

public class AtualizarAluno {
	public static void main(String[] args) {
		
		CrudAluno crudAluno = new CrudAluno();
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Informe o ID que deseja atualizar:");
			Long id = sc.nextLong();
			
			Aluno aluno = crudAluno.FindId(id);
			sc.nextLine();
			System.out.println("Insira o nome do aluno: ");
			String nome = sc.nextLine();
			System.out.println("Insira o e-mail: ");
			String email = sc.nextLine();
			System.out.println("Insira o seu CPF: ");
			String cpf = sc.nextLine();
			System.out.println("Insira sua data de Nascimento xx/xx/xxxx : ");
			String nascimento = sc.nextLine();
			System.out.println("Insira a sua Naturalidade: ");
			String naturalidade = sc.nextLine();
			System.out.println("Insira seu endereco: ");
			String endereco = sc.nextLine();
			
			aluno.setNome(nome);
			aluno.setEmail(email);
			aluno.setCpf(cpf);
			aluno.setNascimento(nascimento);
			aluno.setNaturalidade(naturalidade);
			aluno.setEndereco(endereco);
			
			crudAluno.atualizar(aluno);
		}catch (Exception e) {

		}

	}
	

}
