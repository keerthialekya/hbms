package com.cg.hbm.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cg.hbm.entities.Transactions;

public interface ITransactionRepository extends JpaRepository<Transactions,Integer >{
	//public Transactions addTransaction(Transactions transaction);
}
