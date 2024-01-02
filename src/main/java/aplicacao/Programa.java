package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		Pessoa p1 = new Pessoa(null,"carlos da silva","carlos@gmail.com");
		Pessoa p2 = new Pessoa(null,"maria eduarda","duda@gmail.com");
		Pessoa p3 = new Pessoa(null,"aecio brumel","brumel@gmail.com");
*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
	/*	
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);           adicionei no banco
		em.persist(p3);
		em.getTransaction().commit();
		*/
		
		/////////////////////////////////////////////////////////////////
	
		
		/*
		Pessoa p = em.find(Pessoa.class, 2); aqui eu busco a pessoa pelo id passando (classe, id) no metodo
		
		
		System.out.println(p);
*/
		/////////////////////////////////////////////////////////////////

		Pessoa p = em.find(Pessoa.class, 2); //aqui eu busco a pessoa pelo id passando (classe, id) 
		em.getTransaction().begin(); //inicio uma transaçao!!!
		//assim posso armazenar ela numa variavel e excluir
		em.remove(p);
		em.getTransaction().commit();//fecho a transaçao
		
		
		em.close();
		emf.close();
		
		
		
	}

}
