package com.crud.crud.interfaces;

import com.crud.crud.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<Persona,Integer> {

}
