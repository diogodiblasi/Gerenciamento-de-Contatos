package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CrudAluno {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
	EntityManager manager = factory.createEntityManager();

	
	public void inserir(Aluno aluno) {
		

		manager.getTransaction().begin();
		manager.persist(aluno);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
	
	public List<Aluno> getAlunos(String aluno) {
		
		
		String sql = "from Aluno";
		Query query = manager.createQuery(sql);
		
		@SuppressWarnings("unchecked")
		List<Aluno> lista = query.getResultList();
		
		
		for (Aluno alunos : lista) {
			System.out.println( "ID:" + alunos.getId()+" Nome: " + alunos.getNome() + " Email: "+ alunos.getEmail()+ " Cpf: "+alunos.getCpf()+" Data Nascimento: "
						+ alunos.getNascimento()+	" Naturalidade: "+alunos.getNaturalidade()+ " Endereco: "+ alunos.getEndereco()+"\n");
		}

		
		manager.close();
		factory.close();
		return lista;
	}
	
	public List<Aluno> getAlunosLetra(String busca){
		
		String sql = "from Aluno as a where a.nome like:nome";
		Query query = manager.createQuery(sql);
		
		query.setParameter("nome", busca + "%");
		
		@SuppressWarnings("unchecked")
		List<Aluno> lista = query.getResultList();
		System.out.println("Aluno(s) com o nome iniciando com a letra informada:\n");

		for (Aluno aluno : lista) {
			System.out.println( "ID:" + aluno.getId()+" Nome: " + aluno.getNome() + " Email: "+ aluno.getEmail()+ " Cpf: "+aluno.getCpf()+" Data Nascimento: "
					+ aluno.getNascimento()+ " Naturalidade: "+aluno.getNaturalidade()+ " Endereco: "+ aluno.getEndereco()+"\n");
			
		}

		manager.close();
		factory.close();
		return lista;
	}

	public Aluno FindId(long id) {
		
		Aluno aluno = manager.find(Aluno.class, id);		
		
			
//		manager.close();
//		factory.close();
		return aluno;
	}
	public void atualizar(Aluno aluno) {
		
		manager.getTransaction().begin();
		manager.merge(aluno);
		
		manager.getTransaction().commit();
		
		System.out.println("Atualizado com Sucesso");
		System.out.println( "ID:" + aluno.getId()+" Nome: " + aluno.getNome() + " Email: "+ aluno.getEmail()+ " Cpf: "+aluno.getCpf()+" Data Nascimento: "
				+ aluno.getNascimento()+ " Naturalidade: "+aluno.getNaturalidade()+ " Endereco: "+ aluno.getEndereco()+"\n");
		manager.close();
		factory.close();
	}
	
	public void remover(Aluno aluno) {
		
		manager.getTransaction().begin();
		
		manager.remove(aluno);
		manager.getTransaction().commit();
		
		
		manager.close();
		factory.close();
	}
	
}
