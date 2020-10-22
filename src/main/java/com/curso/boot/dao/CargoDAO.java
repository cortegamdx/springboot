package com.curso.boot.dao;

import java.util.List;

import com.curso.boot.domain.Cargo;

public interface CargoDAO {
	
	void save(Cargo Cargo);
	
	void update(Cargo Cargo);
	
	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
}
