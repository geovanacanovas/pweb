package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {
	
	private int numero;
	private String nome;
	private String materia;
	
	
	@Id
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}

}
