package com.cg.hbm.service;

import java.util.List;


import com.cg.hbm.entities.Transactions;


public interface ITransactionService {
	public Transactions addTransaction(Transactions transaction);
	public List<Transactions> showAllTransactions();
	
}