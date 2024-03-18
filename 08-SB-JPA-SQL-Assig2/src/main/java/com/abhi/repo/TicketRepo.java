package com.abhi.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abhi.entity.Ticket;

import jakarta.persistence.EntityManager;


@Repository
public class TicketRepo  {
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Ticket>  getTicket(){
		return em.createNamedStoredProcedureQuery("firstProcedure").getResultList();
	}
	
	public List<Ticket>  getTicketInfoByCatagory(String input){
		return em.createNamedStoredProcedureQuery("secondProcedure").setParameter("tcatagory",input).getResultList();
	}

 }


