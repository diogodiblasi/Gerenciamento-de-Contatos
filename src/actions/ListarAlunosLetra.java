package actions;

import java.util.Scanner;


import model.CrudAluno;

public class ListarAlunosLetra {
	
	public static void main(String[] args) {
		
		
		CrudAluno crudAluno = new CrudAluno();
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Informe a primeira letra do nome que deseja buscar: ");
			String busca = sc.nextLine();
			crudAluno.getAlunosLetra(busca);
		}catch (Exception e) {
			
		}
		
	}


}
