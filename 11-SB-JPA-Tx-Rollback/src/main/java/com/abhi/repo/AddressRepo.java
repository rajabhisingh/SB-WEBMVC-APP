package com.abhi.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Serializable> {

}
