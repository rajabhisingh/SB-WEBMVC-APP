package com.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.entity.Account;
import com.abhi.entity.AccountPK;

@Repository
public interface AccountRepo extends JpaRepository<Account, AccountPK> {

}
