package com.ifms.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Tecnico extends Pessoa<Long> {

	private static final long serialVersionUID = 1L;
	
	private Boolean arbitro;
	
	@OneToMany(mappedBy = "tecnico")  // como já foi mapeado, criando o @JoinColumn na classe Equipe, basta colocar o nome da variável que mapeou 
	private List<Equipe> equipes;

	public Boolean getArbitro() {
		return arbitro;
	}

	public void setArbitro(Boolean arbitro) {
		this.arbitro = arbitro;
	}
	

}
