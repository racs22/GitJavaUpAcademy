package io.altar.jseproject.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import io.altar.jseproject.model._Entity;

public abstract class EntityRepositories<T extends _Entity> {
// isto vai ser eventualmente subistituído por um repositório de uma base de dados de mySQL
	private Map<Long, T> map = new HashMap<Long, T>();
	// O T a cada instância passa a ser uma classe concreta
	long currentId; // como o long ta com L minusculo, assume-se que é = 0

	public T getEntity(long id) {
		return map.get(id);
	}

	// get nextID
	private long nextID() {
		return ++currentId;
	}

// criar
	public long createID(T entidade) {
		entidade.setId(nextID()); // O produto qd vem do textinterface n tem ID, esta função vai pedir ao
									// repositorio qual o Id através do setId()
		map.put(entidade.getId(), entidade); // vai guardar no map através do getId()
		return entidade.getId();

	}

// editar
	public void editID(T entidade) {
		map.put(entidade.getId(), entidade);

	}

// remover
	public T removeID(long id) {
		return map.remove(id);

	}

	// consultar
	public Collection<T> getAll() {
		return map.values();

	}

}
