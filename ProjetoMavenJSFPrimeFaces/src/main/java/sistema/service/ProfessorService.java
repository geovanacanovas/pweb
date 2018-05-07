package sistema.service;

import java.util.List;
import sistema.modelos.Professor;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class ProfessorService {
	private EntityManagerFactory emf;
	private EntityManager em;

	
	public ProfessorService(){
		String nomeUP="ProjetoMavenJSFPrimeFaces";
		emf=Persistence.createEntityManagerFactory(nomeUP);
	}
	
	public void salvar(Professor professor)
	{
		em = emf.createEntityManager();
    	em.getTransaction().begin();
    	em.persist(professor);
    	em.getTransaction().commit();
    	em.close();
	}
	

	public List <Professor> getProfessores()
	{
		List<Professor>lista;
    	em = emf.createEntityManager();
    	lista=em.createQuery("Select p From Professor p").getResultList();
    	em.close();
    	return lista;
		
	}
	
}
