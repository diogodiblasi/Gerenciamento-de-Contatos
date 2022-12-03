package actions;

import java.util.Scanner;

import model.Aluno;
import model.CrudAluno;

public class InserirAluno {
	
	public static void main(String[] args) {
		
		CrudAluno crudaluno = new CrudAluno();

		
		try (Scanner sc = new Scanner(System.in)) {
			Aluno aluno = new Aluno();
			
			
			
			System.out.println("Insira o nome do aluno: ");
			String nome = sc.nextLine();
			System.out.println("Insira o e-mail: ");
			String email = sc.nextLine();
			System.out.println("Insira o seu CPF: ");
			String cpf = sc.nextLine();
			System.out.println("Insira sua data de Nascimento xx/xx/xxxx : ");
			String nascimento = sc.nextLine();
			System.out.println("Insira sua Naturalidade: ");
			String naturalidade = sc.nextLine();
			System.out.println("Insira seu endereco: ");
			String endereco = sc.nextLine();

			aluno.setNome(nome);
			aluno.setEmail(email);
			aluno.setCpf(cpf);
			aluno.setNascimento(nascimento);
			aluno.setNaturalidade(naturalidade);
			aluno.setEndereco(endereco);
			crudaluno.inserir(aluno);
			

			
			System.out.println("Aluno inserido: \n"+"Nome: " + aluno.getNome() + " Email: "+ aluno.getEmail()+ " Cpf: "+aluno.getCpf()+" Data Nascimento: "+ aluno.getNascimento()+
					" Naturalidade: "+aluno.getNaturalidade()+ " Endereco: "+ aluno.getEndereco()+"\n");
		}catch (Exception e) {
		}
		

	}
}
