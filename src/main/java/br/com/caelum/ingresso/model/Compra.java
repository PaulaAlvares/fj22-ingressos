package br.com.caelum.ingresso.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	List<Ingresso> ingressos = new ArrayList<>();
	
	public Compra() {
		// TODO Auto-generated constructor stub
	}
	
	public Compra(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Ingresso> getIngressos() {
		return ingressos;
	}

	public void setIngressos(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}
	
	

}
