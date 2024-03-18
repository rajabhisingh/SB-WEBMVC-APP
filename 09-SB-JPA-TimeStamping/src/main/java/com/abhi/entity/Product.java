package com.abhi.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Product_Master")
public class Product {
	@Id
	//@GeneratedValue(strategy = GenerationType.TABLE)
	//@GeneratedValue
	//@GeneratedValue(strategy = GenerationType.TABLE)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "Product_Id")
	private String productid;
	
	@Column(name = "Product_Name")
	private String productName;
	
	@Column(name = "Product_Price")
	private Double prouctPrice;
	
	@CreationTimestamp
	@Column(name = "Created_Date", updatable = false)
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name = "Updated_Date", insertable = false)
	private LocalDateTime updatedDate;
}
