package com.abhi.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.abhi.entities.Contactsmasterentity;

public interface ContactMasterRepo extends  CrudRepository< Contactsmasterentity, Serializable >{

}
