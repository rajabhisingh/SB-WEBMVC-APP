package com.abhi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Setter;



@Data
@Entity
//@Table(name = "CONTECTS_MASTER")
public class Contactsmasterentity {
	@Id
	@Column(name = "CONTECT_ID")
	private Integer contectId;
	
	@Column(name = "CONTECT_NAME")
	private String contectName;

	@Column(name = "CONTECT_NUMBER")
	private Integer contectNumber;
}
