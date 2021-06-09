package io.altar.stockMaven.models;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass // faz com que o JPA saiba que tem que a injetar quando está a criar as classes completas
					
public class Entity_ implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // faz a identificação de itens gerados
	private long id;

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return this.id;
	}

}
