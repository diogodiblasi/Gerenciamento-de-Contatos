package actions;

import java.util.Scanner;

import model.Aluno;
import model.CrudAluno;

public class RemoverAluno {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			CrudAluno crudAluno = new CrudAluno();
			
			System.out.println("Informe o ID que deseja Remover:");
			Long id = sc.nextLong();
			
			Aluno aluno = crudAluno.FindId(id);

			crudAluno.remover(aluno);
			System.out.println("Aluno removido com Sucesso!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
